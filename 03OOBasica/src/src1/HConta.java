package src1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EDYA
 */
public class HConta {

    //PUBLIC, PRIVATE, PROTECTED
    //ABSTRACT, FINAL, STATIC
    int numero;
    //String dono;
    double saldo;
    double limite;
    double salario;
    
    HCliente titular;

    //PRIMEIRO MÉTODO SACA
    /*
     void saca(double quantidade) {
     double novoSaldo = this.saldo - quantidade;
     this.saldo = novoSaldo;
     }*/
    
    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita(double quantidade) {
        if (quantidade > 1000) {
            System.out.println("Deposito com o gerente");
        } else {
            this.saldo += quantidade;
        }
        
        
    }
    //PRIMEIRO MÉTODO TRANSFERE
    /*
     void transfere(Conta destino, double valor) {
     this.saldo = this.saldo - valor;
     destino.saldo = destino.saldo + valor;
     }
     */

    boolean transfere(HConta destino, double valor) {
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
