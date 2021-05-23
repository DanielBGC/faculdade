/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bconstrutores;
/**
 *
 * @author EDYA
 */
public class CConta {
     private int numero;
     private double saldo;
     private double limite;
     private CCliente titular;
     
     //construtor 1
     CConta() {
        System.out.println("[construtor 1] Construindo uma conta.");
     }
     //construtor 2
     CConta(int numero) {
         this.numero = numero;
        System.out.println("[construtor 2] Construindo uma conta.");
     }
     
     
     //construtor 3
     CConta(CCliente titular) {
        this.titular = titular;
        System.out.println("[construtor 3] Construindo uma conta.");
     }
     
     
     //construtor 4
     CConta(double saldo, CCliente titular) {
        this.saldo = saldo;
        this.titular = titular;
        System.out.println("[construtor 4] Construindo uma conta.");
     }
     
     //construtor 5
     CConta(double saldo, double limite, CCliente titular) {
        this(saldo, titular);
        this.limite = limite;
        System.out.println("[construtor 5] Construindo uma conta.");
     }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
     
    
     
     //comportamento escondido.
     //menos acomplamento
     //mudanças tem pouco impacto
     public double getSaldo() {
         return this.saldo + this.limite;
     }
     /*
     public double getLimite() {
         return this.limite;
     }*/
     
     public CCliente getTitular() {
         return this.titular;
     }
     /*
     public void setSaldo(double saldo) {
         this.saldo = saldo;
     }*/
     
     public void setLimite(double limite) {
         this.limite = limite;
     }
     
     public void setTitular(CCliente titular) {
         this.titular = titular;
     
     }
     
     public boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }


    public boolean transfere(BConta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
        // não deu pra sacar!
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }

    @Override
    public String toString() {
        return "CConta{" + "numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + ", titular=" + titular.toString() + '}';
    }
    
    
}
