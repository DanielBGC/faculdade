/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;

import javax.swing.JOptionPane;



/**
 *
 * @author EDYA
 */
public class BJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Entre com o seu nome");
        System.out.println("Meu nome e " + nome);
        
        String nomeString = JOptionPane.showInputDialog("Entre com sua idade");
        int idade = Integer.parseInt(nomeString);
        
        JOptionPane.showMessageDialog(null, "MEU NOME É " + nome + "\nMinha idade e " + idade);
                
        
        //0 YES | 1 NO | 2 CANCEL | -1 CANCEL
        
        int r = JOptionPane.showConfirmDialog(null, "voce é maior de idade ?");
        System.out.println(r);
        
        if (r == 0) {
            System.out.println("Pode ser preso...0");
        } else if (r == 1) {
            System.out.println("Bandido a solta..1");
        } else if (r == 2) {
            System.out.println("Bandido a solta..2");
        } else if (r == -1) {
            System.out.println("Bandido a solta..-1");
        }
    }
}
