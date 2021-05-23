/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twochecked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EDYA
 */
public class Teste2 {

    public static void main(String[] args) throws FileNotFoundException {
        
        
            metodo();
        
        
        metodo1();
    }

    public static void metodo() throws FileNotFoundException {
        FileInputStream fileInputStream = new java.io.FileInputStream("arquivo.txt");
    }

    public static boolean metodo1() {
        try {
            FileInputStream fileInputStream = new java.io.FileInputStream("arquivo.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não aberto");
            return false;
        }
        return true;
    }
}
