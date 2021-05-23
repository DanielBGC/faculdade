/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printf;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardoasilvestre
 */
public class FFormatarSemPrintf {
    public static void main(String[] args) {
        double teste  = 2240.230;
        String r = String.format("%.2f", teste);
        System.out.println(r);
    }
}
