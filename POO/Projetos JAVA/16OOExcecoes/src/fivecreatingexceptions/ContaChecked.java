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
public class ContaChecked {

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

   //método é obrigado a dar try-catch, ou throws:
   void saca(double valor) throws SaldoInsuficienteExceptionChecked {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteExceptionChecked("Saldo insuficiente. Teste um valor menor");
        } else {
            this.saldo -= valor;
        }
    }
    void deposita(double valor) {
        this.saldo += valor;
    }
}
