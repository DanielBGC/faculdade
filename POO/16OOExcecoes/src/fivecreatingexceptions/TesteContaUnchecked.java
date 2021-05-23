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
public class TesteContaUnchecked {

    public static void main(String[] args) {
        metodo1();
    }

    private static void metodo1() {

        ContaUnchecked cc = new ContaUnchecked();
        cc.deposita(50);

        //com try catch (não obrigatório)
        try {
            cc.saca(100);
        } catch (SaldoInsuficienteExceptionUnchecked e) {
            System.out.println(e.getMessage());
        }

        //Sem try catch funciona ?? R: sim (unchecked)
        cc.saca(100);
        System.out.println("Cheguei aqui manezaos");
    }
}
