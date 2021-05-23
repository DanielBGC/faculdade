/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author EDYA
 */
public class ExercicioTesteFundirMotor {
    public static void main(String[] args) {
        Motor m = new Motor();
        m.potencia = 10;
        m.tipo = "1.0";
        
        Carro c = new Carro();
        c.motor = m;
        c.marcaVelocidadeMaxima();
        
        while (c.velocidadeAtual < (1.2 * c.velocidadeMaxima)) {
           c.acelera(5);
           System.out.println("Carro acelerando....VRUMMM. Vec Atual: " + c.velocidadeAtual);
        }
        System.out.println("Deu ruim...");
        System.out.println("A velocidade máxima permitida era: " + c.velocidadeMaxima);
        System.out.println("Sua velocidade atual é: " + c.velocidadeAtual);
        System.out.println("BOOMMMMMMM ! Motor Fundiu...");
        c.motor = null;
        
    }
}
