/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

/**
 *
 * @author EDYA
 */
public class Teste {
    public static void main (String args[]) {
        Computador comp1;
        comp1 = new Computador();
        
        comp1.disco = 500;
        comp1.memoria = 4;
        comp1.nome = "ASUS";
        
        Computador comp2 = new Computador();
        comp2.memoria = 6;
        comp2.disco = 800;
        comp2.nome = "DELL";
        
        comp1.ligar();
        
        System.out.println(comp1.nome);
        System.out.println(comp2.nome);
        
        System.out.println(comp1.nome + " " + comp2.nome);
        
        comp1.desligar();
        
        
        /**
         * PESSOA
         * CARRO
         * COMPUTADOR
         * MECANICO
         * OFICINA
         * 
         * PESSOA dirigir CARRO
         * PESSOA ligar COMPUTADOR
         * MECANICO consertar CARRO
         * OFICINA pagar MECANICO
         * 
         * 
         */
        
    }
}
