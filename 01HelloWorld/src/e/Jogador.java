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
public class Jogador {
    String apelido;
    int golsCarreira;
    
    
    void mostraNome() {
        System.out.println(apelido);
    }
    
    void incrementaGols(int numeroGols) {
        golsCarreira = golsCarreira + numeroGols;
    }
    
    int pegaGols() {
        return golsCarreira;
    }
    
}
