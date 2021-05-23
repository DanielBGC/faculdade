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
public class FConta {
    private double limite;
    private double saldo;
    private FCliente cliente;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public FCliente getCliente() {
        return cliente;
    }

    public void setCliente(FCliente cliente) {
        this.cliente = cliente;
    }

    public String mostraConta() {
        return "Saldo: " + this.saldo + " | bla bla bla bla";
       
    }

    @Override
    public String toString() {
        return "saldo=" + saldo + cliente.toString();
    }
    
    
    
    
}
