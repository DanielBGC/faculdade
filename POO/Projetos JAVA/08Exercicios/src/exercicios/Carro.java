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
public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;
    
    void acelera(int velocidade) {
        this.velocidadeAtual = this.velocidadeAtual + velocidade;
    }
    
    void marcaVelocidadeMaxima() {
        this.velocidadeMaxima = this.motor.potencia * 10;
    }
    
}
