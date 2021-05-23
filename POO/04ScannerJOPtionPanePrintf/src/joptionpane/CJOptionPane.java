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
public class CJOptionPane {
    public static void main(String[] args) {
        String pergunta = "";
        pergunta += "1 - Mostrar pessoa\n";
        pergunta += "2 - Mostrar Paciente\n";
        pergunta += "3 - Sair";
        
        String resp = JOptionPane.showInputDialog(null, pergunta);
    }
}
