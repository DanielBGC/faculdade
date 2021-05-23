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
public class DTesteContasExtra {
    
    public static void main(String args[]) {
        CConta c1;
        c1 = new CConta();
        
        c1.dono = "Eduardo";
        c1.numero = 3342;
        
        System.out.println("O dono da conta " + c1.dono + "| Número da conta " + c1.numero);
        
        
        CConta c2;
        c2 = new CConta();
        
        c2.dono = "Nono";
        c2.numero = 124;
        
        System.out.println("O dono da conta " + c2.dono + "| Número da conta " + c2.numero);
        
        CConta c3;
        c3 = new CConta();
        
        c3.dono = "Eduardo";
        c3.numero = 3342;
        
        c3.deposita(3000);
        boolean r = c3.saca(5000);
        
        if (r) {
            System.out.println("Parabéns pelo saque. Essa foi a primeira compra de beleza da sua linda esposa");
            System.out.println("Meu saldo e :" + c3.saldo);
        } else {
            //não consegui sacar
            System.out.println("Seu saldo e insuficiente...");
            System.out.println("Vou te dar uma oportunidade...");
            c3.deposita(2000);
            
            boolean x = c3.saca(5000);
        
            if (x) {
                System.out.println("Parabéns pelo saque. Essa foi a primeira compra de beleza da sua linda esposa");
            } else {
                System.out.println("Não conseguiu sacar outra vez...");
                }
        }
    }
    
}
