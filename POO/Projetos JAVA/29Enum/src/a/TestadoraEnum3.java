/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author EDYA
 */
public class TestadoraEnum3 {

    public static void main(String[] args) {
        //repare que a impressão do construtor é chamada
        for (COpcoesMenu op : COpcoesMenu.values()) {
            System.out.print("Menu " + op + " = " + op.getValor() + "\n");
        }
    }
}
