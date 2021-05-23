package aencapsulamento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EDYA
 */
public class AConta {

    //PUBLIC, PRIVATE, PROTECTED
    //ABSTRACT, FINAL, STATIC
    int numero;
    //String dono;
    double saldo;
    double limite;
    double salario;
    
    ACliente titular;

    //PRIMEIRO MÉTODO SACA
    //deixado descomentado propositalmente
     void saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
     }
    
    //SEGUNDO MÉTODO SACA
    /*
    boolean saca(double valor) {
        if (this.saldo + limite < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }*/

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
    //PRIMEIRO MÉTODO TRANSFERE
    /*
     void transfere(Conta destino, double valor) {
     this.saldo = this.saldo - valor;
     destino.saldo = destino.saldo + valor;
     }
     */

    //SEGUNDO MÉTODO TRANSFERE
    /*
    boolean transfere(Conta0 destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
        // não deu pra sacar!
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }
    */
}
