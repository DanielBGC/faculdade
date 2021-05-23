/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twochecked;

import java.io.FileNotFoundException;

/**
 *
 * @author EDYA
 */
public class Teste {
    
    public static void main(String[] args) throws FileNotFoundException {
        metodo();
    }
    
    public static void metodo() throws FileNotFoundException {
        new java.io.FileInputStream("arquivo.txt");
}
    
}
