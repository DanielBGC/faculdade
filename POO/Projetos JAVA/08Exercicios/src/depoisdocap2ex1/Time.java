/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap2ex1;

/**
 *
 * @author Ernani
 */
public class Time {
    String nome;
    int vitorias;
    int derrotas;
    int empates;
    
    int calculaPontuacao() {
        return 0*derrotas + 1 *empates + 3*vitorias;
    }
    
    void mostrarNome() {
        System.out.println(nome);
    }
    
}
