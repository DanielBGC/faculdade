/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecreatingexceptions;

/**
 *
 * @author EDYA
 */
public class TesteContaChecked {

    public static void main(String[] args)  /*throws SaldoInsuficienteExceptionChecked*/{
        //metodo();
       metodo1();
    }
/*
    private static void metodo() {
        ContaChecked cc = new ContaChecked();
        cc.deposita(50);

        cc.saca(100);

    }*/
    
    
    private static void metodo1() /*throws SaldoInsuficienteExceptionChecked*/ {
        ContaChecked cc = new ContaChecked();
        cc.deposita(50);
        try {
            cc.saca(100);
        } catch (SaldoInsuficienteExceptionChecked e) {
            System.out.println(e.getMessage());
        }
        
        //TODO uncomment
        //cc.saca(100);
    }
}
