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
public class ICarro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    
    void liga() {
        System.out.println("Coloquei chave ignição");
        System.out.println("Coloquei a primeira");
        System.out.println("Vai Rubinho...corre");
    }
    
    void acelera(double velocidade) {
        this.velocidadeAtual += velocidade;
    }
    
    int pegaMarcha() {
        if (this.velocidadeAtual < 20) {
            return 1;
        } else if (this.velocidadeAtual >= 20 && this.velocidadeAtual <=40) {
            return 2;
        } else if (this.velocidadeAtual > 40 && this.velocidadeAtual <=50) {
            return 3;
        } else {
            return 4;
        }

    }
}
