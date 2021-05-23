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
public class BContaTeste {

    public static void main(String[] args) {
        // criando a conta
        BConta minhaConta;
        minhaConta = new BConta();

        // alterando os valores de minhaConta
        minhaConta.dono = "Duke";
        minhaConta.saldo = 1000;

        // saca 200 reais
        minhaConta.saca(200);

        // deposita 500 reais
        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo);
    }
}
