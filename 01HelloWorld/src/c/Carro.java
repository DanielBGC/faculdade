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
public class Carro {
    String modelo;
    int ano;
    String cor;
    
    void ligar() {
        System.out.println("Carro ligao...");
    }
    
    
    void desligar() {
    System.out.println("Carro deslgado...");
    }
    
    double calculeAlguel(int dia) {
        if (dia >=1 && dia <=4) {
            return 100;
        } else if (dia >=5 && dia <=7) {
            return 150;
        } 
        return 0;
        
    }
    
    void incrementaAno(int ano) {
        this.ano += ano;
    }
    
}
