/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e;

/**
 *
 * @author eduardoasilvestre
 */
public class Teste {
    public static void main(String[] args) {
        Jogador j1;
        j1 = new Jogador();
        j1.apelido = "Miraildes";
        j1.incrementaGols(5);
        j1.incrementaGols(4);
        j1.incrementaGols(3);
        j1.incrementaGols(2);
        
        j1.mostraNome();
        int golsj1 = j1.pegaGols();
        System.out.println(golsj1);
        
        Jogador j2 = new Jogador();
        j2.apelido = "Bruxo";
        j2.incrementaGols(1);
        j2.incrementaGols(1);
        j2.incrementaGols(1);
        j2.incrementaGols(1);
        
        if (j1.pegaGols() > j2.pegaGols()) {
            System.out.println("miraildes e melhor");
        } else {
            System.out.println("bruxo e melhor");
        }
        
        
    }
}
