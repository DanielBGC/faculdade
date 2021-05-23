/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourtrowingexceptions;

/**
 *
 * @author EDYA
 */
public class TesteConta {

    public static void main(String[] args) {
        metodo1();
        
        
    }

    private static void metodo1() {
        Conta cc = new Conta();
        cc.deposita(50);
         
        cc.saca(100);
        
        /*
        try {
            cc.saca(100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        */
        System.out.println("continua rodando 1...");
        cc.saca(200);
        System.out.println("continua rodando 2...");
    }

}
