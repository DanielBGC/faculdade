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
public class HContaTeste {
    public static void main(String args[]) {
        
        HConta c0 = new HConta();
        c0.saldo = 1000;
        HCliente cliente0 = new HCliente();
        System.out.println("\nTitular: " + c0.titular);
        //System.out.println("Titular: " + c0.titular.nome); //CUIDADO
        ////////////////////////////////////////////////////////////////////////
        HConta c1 = new HConta();
        c1.saldo = 1000;
        c1.titular = new HCliente();
        System.out.println("\nTitular: " + c1.titular);
        System.out.println("Titular: " + c1.titular.nome);
        ////////////////////////////////////////////////////////////////////////
        HConta c2 = new HConta();
        c2.saldo = 900;        
        HCliente cliente2 = new HCliente();
        //cliente2.nome = "Jaspion";        
        
        c2.titular = cliente2;
        c2.titular.nome = "Jaspion";
        System.out.println("\nTitular: " + c2.titular);
        System.out.println("Titular: " + c2.titular.nome);
        
        ////////////////////////////////////////////////////////////////////////
        HConta c3 = new HConta();
        c3.saldo = 600;
        
        HCliente cliente3 = new HCliente();
        cliente3.nome = "Vegeta";
        c3.titular = cliente3;
        
        System.out.println("\nTitular: " + c3.titular);
        System.out.println("Titular: " + c3.titular.nome);
        
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nANTES: Saldo c2 " + c2.saldo + "| Saldo c3 " + c3.saldo);
        c2.transfere(c3, 500);
        System.out.println("DEPOIS: Saldo c2 " + c2.saldo + "| Saldo c3 " + c3.saldo);
    }
}
