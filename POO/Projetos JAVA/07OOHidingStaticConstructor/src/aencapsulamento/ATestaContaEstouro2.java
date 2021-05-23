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
public class ATestaContaEstouro2 {
    public static void main(String args[]) {
        AConta minhaConta = new AConta();
        minhaConta.limite = 100;
        /*
        Podemos incluir um if dentro do nosso método saca() para evitar a 
        situação (exemplo anterior) que resultaria em uma conta
        em estado inconsistente, com seu saldo abaixo do limite.
        */
        minhaConta.saldo = -200; //saldo está abaixo dos 100 de limite
        
        minhaConta.saldo = 1000000; //saldo está abaixo dos 100 de limite
    }
}
