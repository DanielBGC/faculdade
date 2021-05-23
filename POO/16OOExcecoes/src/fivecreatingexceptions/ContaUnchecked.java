/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecreatingexceptions;

/**
 *
 * @author EDYA
 */
public class ContaUnchecked {

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
    //nao é obrigatório throws SaldoInsuficienteExceptionUnchecked
    void saca(double valor) throws SaldoInsuficienteExceptionUnchecked{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteExceptionUnchecked("Saldo insuficiente. Teste um valor menor");
        } else {
            this.saldo -= valor;
        }
    }
    
  
    void deposita(double valor) {
        this.saldo += valor;
    }
}
