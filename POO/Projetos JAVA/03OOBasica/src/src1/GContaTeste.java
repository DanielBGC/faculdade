package src1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EDYA
 */
public class GContaTeste {

    public static void main(String[] args) {
        GConta conta = new GConta();
        System.out.println(conta.cpf);
        System.out.println(conta.dono);
        System.out.println(conta.limite);
        
        GConta c1 = new GConta();
        c1.deposita(500);
        System.out.println("\nSaldo c1: " + c1.saldo);
        
        GConta c2 = null;
        
        
        
        c1.transfere(c2, 300);
        
        System.out.println("\nSaldo c1: " + c1.saldo);
        System.out.println("Saldo c2: " + c2.saldo);
        
        
    }
}
