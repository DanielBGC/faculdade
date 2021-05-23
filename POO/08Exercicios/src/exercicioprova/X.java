/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioprova;

/**
 *
 * @author EDYA
 */
public class X {

    public static void main(String args[]) {
        X x = new X();
        int retorno = x.voceVaiPereceberQueEstaPerdendoTempoNoFinalDesteMetodoGrandao(4);
        System.out.println(retorno);

    }

    public int voceVaiPereceberQueEstaPerdendoTempoNoFinalDesteMetodoGrandao(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 1 + (n % 2) + voceVaiPereceberQueEstaPerdendoTempoNoFinalDesteMetodoGrandao(n - 1);
        }
    }
}
