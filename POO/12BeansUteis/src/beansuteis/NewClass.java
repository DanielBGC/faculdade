/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansuteis;

import javax.swing.JOptionPane;

/**
 *
 * @author EDYA
 */
public class NewClass {
       public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("joao das acelgas");
        System.out.println("O nome do individuo e " + p.getNome());
        JOptionPane.showMessageDialog(null, "O nome do individuo e " + p.getNome());
    } 
}
