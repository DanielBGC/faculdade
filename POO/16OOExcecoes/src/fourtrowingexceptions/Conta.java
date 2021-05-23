/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourtrowingexceptions;

/**
 *
 * @author EDYA
 */
public class Conta {

    private double saldo;
    private double limite;

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    //passo 1 - não lança uma exceção
    
     boolean saca(double valor) {
        if (this.saldo < valor) {
           return false;
        } else {
           this.saldo -= valor;
           return true;
        }
     }
     

    //passo 2 - exceção muito genérica
    /*
    //como é unchecked não é obrigatório o throws RuntimeException
    void saca(double valor) throws RuntimeException{
        if (this.saldo < valor) {
            throw new RuntimeException();
        } else {
            this.saldo -= valor;
        }
    }
    */
    
    //passo 3
    /*
    //como é unchecked não é obrigatório o throws IllegalArgumentException
    void saca(double valor) {
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }
    */
    
    //passo 4 
    /*
    //como é checked  é obrigatório o throws Exception
    void saca(double valor) throws Exception{
        if (this.saldo < valor) {
            throw new Exception("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }
    */
    
   
    void deposita(double valor) {
        this.saldo += valor;
    }
}
