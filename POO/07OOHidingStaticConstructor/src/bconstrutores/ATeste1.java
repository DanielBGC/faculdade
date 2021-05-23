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
public class ATeste1 {
    public static void main(String[] args) {
        
        ACliente a1 = new ACliente();
        
        ACliente a2 = new ACliente("eduardo");
        System.out.println(a2.getNome());
        
        ACliente a3 = new ACliente("ana ", 20);
        
        ACliente a4 = new ACliente();
        a4.setNome("ana");
        a4.setIdade(20);
        
        AConta conta1 = new AConta();
        conta1.deposita(2000);
        System.out.println("Saldo da conta1: " + conta1.getSaldo() + "\n");
    }
}
