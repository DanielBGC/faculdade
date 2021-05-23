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
public class AZTestaContaCPMF {
    public static void main(String[] args) {
        //a1.saldo -= (200 + 200*0.01);
        
        //Pode ser criado dezenas de objetos contas.
        //Depois de muito tempo resolve ser calculado o cpmf sobre o saque.
        AConta a1 = new AConta();
        
        
        a1.saldo -= 300;
        
        AConta a2 = new AConta();
        a2.saldo -= 300;
        
        
        AConta a3 = new AConta();
        a3.saldo -= 400;
        
        
        AConta a4 = new AConta();
        a4.saldo -= 500;
        
        
        AConta a5 = new AConta();
        a4.saldo -= 600;
        
        
        AConta a6 = new AConta();
        a5.saldo -= 300;
        
    }
  
}
