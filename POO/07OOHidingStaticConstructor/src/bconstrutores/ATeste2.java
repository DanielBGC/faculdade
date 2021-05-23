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
public class ATeste2 {
    public static void main(String[] args) {
        ACliente cliente = new ACliente();
        
        AConta conta1 = new AConta();
        conta1.deposita(2000);
        System.out.println("Saldo da conta1: " + conta1.getSaldo() + "\n");
        
        AConta conta2 = new AConta(cliente);
        conta2.deposita(2000);
        System.out.println("Saldo da conta2: " + conta2.getSaldo() + "\n");
        
        AConta conta3 = new AConta(2000, cliente);
        System.out.println("Saldo da conta3: " + conta3.getSaldo() + "\n");
        
        AConta conta4 = new AConta(2000, 1000, cliente);
        System.out.println("Saldo da conta4: " + conta4.getSaldo() + "\n");
    }
}
