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
public class ATestaContaEstouro1 {

    public static void main(String args[]) {
        AConta minhaConta = new AConta();
        minhaConta.saldo = 1000.0;
        minhaConta.limite = 1000.0;
        
        //TESTE: MÉTODO SACA1 e MÉTODO SACA2
        minhaConta.saca(50000); // saldo + limite é só 2000!!
        
        System.out.println("Saldo da minha conta é: " + minhaConta.saldo);
    }
}
