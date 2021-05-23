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
public class BTeste {
    public static void main(String[] args) {
        
        //BCliente cliente1 = new BCliente(); //ERRO
        BCliente cliente1 = new BCliente("Amanda");
        BCliente cliente2 = new BCliente("Amanda", "123456");
        
        BConta conta1 = new BConta();
        conta1.setTitular(cliente1);
        conta1.deposita(2000);
        System.out.println("Cliente da conta1: " + conta1.getTitular().getNome());
        System.out.println("Cliente da conta1: " + cliente1.getNome());
        System.out.println("Saldo da conta1: " + conta1.getSaldo() + "\n");
        
        BConta conta2 = new BConta(cliente2);
        conta2.setTitular(cliente2);
        conta2.deposita(2000);
        System.out.println("Cliente da conta1: " + conta2.getTitular().getNome());
        System.out.println("CPF da conta1: " + conta2.getTitular().getCpf());
        System.out.println("Saldo da conta1: " + conta2.getSaldo() + "\n");
       
    }
}
