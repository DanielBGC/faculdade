/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author EDYA
 */
public class TesteCarro {
    public static void main(String[] args) {
        Carro c = new Carro();
        
        c.ano = 2000;
        c.cor = "Blue Marinho";
        c.modelo = "Uno";
        
        System.out.println(c.ano);
        System.out.println(c.cor);
        System.out.println(c.modelo);
        
        
        System.out.println("A cor é: " + c.cor);
        
        
        double valorAluguel = c.calculeAlguel(4);
        
        System.out.println("Valor do aluguel: " + valorAluguel);
        
    }
}
