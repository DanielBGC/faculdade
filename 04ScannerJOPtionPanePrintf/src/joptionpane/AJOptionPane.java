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
public class AJOptionPane {
    public static void main(String args[]) {
    
     
       String resultado = JOptionPane.showInputDialog("Qual é o seu nome?");
       String menu = "";
       menu += "Seja bem vindo !!";
       menu += "\n\n1 Cadastrar cliente";
       menu += "\n2 Cadastrar Conta";
       menu += "\n\n3 Sair";
       
        JOptionPane.showInputDialog(menu);
       
       int r = JOptionPane.showConfirmDialog(null, "voce é " + resultado + "?");
       
       JOptionPane.showMessageDialog(null, "Legal! Sua resposta foi " + r);
    
    }
}



