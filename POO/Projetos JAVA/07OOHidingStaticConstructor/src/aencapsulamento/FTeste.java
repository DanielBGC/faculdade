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
public class FTeste {
    public static void main(String[] args) {
             
        FConta conta = new FConta();
        conta.setSaldo(2000);
        conta.setLimite(2000);
        
        FCliente cliente = new FCliente();
        conta.setCliente(cliente);
        cliente.setNome("eduardo");
        
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Nome: " + conta.getCliente().getNome());
        
        System.out.println(conta.mostraConta());
        
        System.out.println(conta.toString());
        
        System.out.println(conta);
    }
  
}
