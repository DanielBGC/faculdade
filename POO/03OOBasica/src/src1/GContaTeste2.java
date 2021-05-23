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
public class GContaTeste2 {
    public static void main(String[] args) {
        GConta origem = new GConta();
        origem.cpf = "1231";
        origem.saldo = 2000;
        origem.dono = "Joao";
        
        
        GConta destino = new GConta();
        destino.cpf = "SSSS";
        destino.saldo = 1000;
        destino.dono = "Maria";
        
        System.out.println(origem.saldo);
        System.out.println(destino.saldo);
        
        origem.deposita(2000);
        destino.deposita(1000);
        
        System.out.println(origem.saldo);
        System.out.println(destino.saldo);
        origem.transfere(destino, 600);
        
        System.out.println(origem.saldo);
        System.out.println(destino.saldo);
        
    }
}
