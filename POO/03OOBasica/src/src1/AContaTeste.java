/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src1;


/**
 *
 * @author EDYA
 */
public class AContaTeste {

    public static void main(String[] args) {
        //new AConta();
        
        //AConta aconta;
        //aconta = new AConta();
        
    
        AConta minhaConta = new AConta();
        
        minhaConta.dono = "Duke";
        minhaConta.saldo = 1000.0;
        System.out.println("Saldo atual: " + minhaConta.saldo);
    }
}
