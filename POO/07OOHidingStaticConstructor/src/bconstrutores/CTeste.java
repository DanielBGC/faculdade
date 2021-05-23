/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bconstrutores;

/**
 *
 * @author EDYA
 */
public class CTeste {
    public static void main(String[] args) {
        CCliente cliente = new CCliente("mariana");
        
        CConta c1 = new CConta();
        c1.setLimite(2000);
        c1.setNumero(1);
        c1.setTitular(cliente);
        System.out.println(c1.toString());
        
        
        CConta c2 = new CConta(cliente);
        c2.setLimite(2000);
        c2.setNumero(2);
        System.out.println(c2.toString());
        
        CConta c3 = new CConta(3);
        c3.setLimite(2000);
        c3.setTitular(cliente);
        System.out.println(c3.toString());
        
        
        CConta c4 = new CConta(2000, cliente);
        c4.setLimite(1000);
        c4.setNumero(4);
        System.out.println(c4.toString());
        
        CConta c5 = new CConta(1000, 2000, cliente);
        c5.setNumero(5);
        System.out.println(c5.toString());
        
    
        
        
    }
   
}
