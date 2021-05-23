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
public class AConta {
     private double saldo;
     private double limite;
     private ACliente titular;
     
     //construtor 1
     AConta() {
        System.out.println("[construtor 1] Construindo uma conta.");
     }
     //faz o teste ATeste1.java
     
     
     //construtor 2
     AConta(ACliente titular) {
        this.titular = titular;
        System.out.println("[construtor 2] Construindo uma conta.");
     }
     
     
     //construtor 3
     AConta(double saldo, ACliente titular) {
        this.saldo = saldo;
        this.titular = titular;
        System.out.println("[construtor 3] Construindo uma conta.");
     }
     
     //construtor 4
     AConta(double saldo, double limite, ACliente titular) {
        
        this(saldo, titular);
        this.limite = limite;
        System.out.println("[construtor 4] Construindo uma conta.");
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
     
     public ACliente getTitular() {
         return this.titular;
     }
     /*
     public void setSaldo(double saldo) {
         this.saldo = saldo;
     }*/
     
     public void setLimite(double limite) {
         this.limite = limite;
     }
     
     public void setTitular(ACliente titular) {
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


    public boolean transfere(AConta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
        // não deu pra sacar!
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }
}
