/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aencapsulamento;

/**
 *
 * @author EDYA
 */
public class ETeste {
    
    public static void main(String[] args) {
        EConta conta1 = new EConta();
        conta1.deposita(2000);
        conta1.setTitular(null);
        
        System.out.println(conta1.toString());
                
    }
}
