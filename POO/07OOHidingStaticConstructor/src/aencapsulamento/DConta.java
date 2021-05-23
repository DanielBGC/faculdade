/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aencapsulamento;

import java.util.Objects;

/**
 *
 * @author EDYA
 */
public class DConta {

    private double saldo;
    private double limite;
    private DCliente titular;
    private long numero;

    public double getSaldo() {
        return saldo;
    }



    public double getLimite() {
        return limite;
    }



    public DCliente getTitular() {
        return titular;
    }

    public void setTitular(DCliente titular) {
        this.titular = titular;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DConta{" + "saldo=" + saldo + ", limite=" + limite + ", titular=" + titular + ", numero=" + numero + '}';
    }
    


   

}
