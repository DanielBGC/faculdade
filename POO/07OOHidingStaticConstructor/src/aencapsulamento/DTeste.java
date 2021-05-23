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
public class DTeste {
    public static void main(String[] args) {
        
        DCliente cliente = new DCliente();
       
        
        
        cliente.setCpf("9889899898");
        cliente.setEndereco("rua alfredo de faria");
        cliente.setIdade(24);
        cliente.setNome("eduardo");
        
        
        DCliente cliente2 = new DCliente();
        cliente2.setCpf("988989898");
        cliente2.setEndereco("rua alfredo de faria");
        cliente2.setIdade(24);
        cliente2.setNome("eduardo");
        
        if (cliente.equals(cliente2)) {
            System.out.println("certo");
        } else{
            System.out.println("errado");
        }
        
        
        
        DConta conta = new DConta();
        conta.setNumero(10422);
        conta.setTitular(cliente);
        //1000 linhas
        cliente.setEndereco("novo endereco");
        conta.getTitular().setEndereco("novo endereco");
        
        
        
        DConta conta2 = new DConta();
        conta2.setNumero(10422);
        conta2.setTitular(cliente2);
        
         if (conta.equals(conta2)) {
            System.out.println("certo conta");
        } else{
            System.out.println("errado conta");
        }
        
        
        String a = "amor";
        String b = "vetor";
        if (a.equals(b)) {
            System.out.println("certo");
        } else{
            System.out.println("errado");
        }
        
        //PROBLEMA !
        //Faz sentido ter setSaldo() ?
        
    }
}
