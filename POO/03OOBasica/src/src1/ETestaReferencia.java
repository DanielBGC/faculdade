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
public class ETestaReferencia {

    public static void main(String[] args) {
        //testa referências
       
        CConta c1 = new CConta();
        c1.deposita(100);

        CConta c2 = c1; // linha importante!
        c2.deposita(200);

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
}
