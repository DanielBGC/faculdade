/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aencapsulamento;


/**
 *
 * @author EDYA
 */
public class EConta extends Object {
     private double saldo;
     private double limite;
     private DCliente titular;
     
     //comportamento escondido.
     //menos acomplamento
     //mudanças tem pouco impacto
     public double getSaldo() {
         return 1000;
     }
     /*
     public double getLimite() {
         return this.limite;
     }*/
     
     public DCliente getTitular() {
         return this.titular;
     }
     /*
     public void setSaldo(double saldo) {
         this.saldo = saldo;
     }*/
     
     public void setLimite(double limite) {
         this.limite = limite;
     }
     
     public void setTitular(DCliente titular) {
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


    public boolean transfere(EConta destino, double valor) {
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
        return "EConta{" + "saldo=" + saldo + ", limite=" + limite + ", titular=" + titular + '}';
    }
    
 
}
