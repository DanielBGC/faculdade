/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src1;

/**
 *
 * @author EDYA
 */
public class CContaTeste1 {

    public static void main(String[] args) {
        // criando a conta
        CConta minhaConta;
        minhaConta = new CConta();

        // alterando os valores de minhaConta
        minhaConta.dono = "Duke";
        minhaConta.saldo = 10000;

        boolean consegui = minhaConta.saca(2000);
        if (consegui) {
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui sacar");
        }

        minhaConta.saldo = 1000;
        if (minhaConta.saca(2000)) {
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui sacar");
        }
    }
}
