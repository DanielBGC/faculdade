/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dexercicio;

/**
 *
 * @author EDYA
 */
public class Teste {
    public static void main(String args[]) {
        Cliente c = new Cliente("Eduardo");
        
        Cliente c1 = new Cliente("Augusto", "123456");
        
        Cliente c3 = new Cliente();
        
        
        
        System.out.println("nome do cliente " + c.getNome());
        
        //Cliente c = new Cliente();
    
    }
}
