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
public class Campeonato {
    
    Time timea;
    Time timeb;
    String nome;
    int ano;
    
    String pegaCampeao() {
        
        int pontuacaoA = timea.calculaPontuacao();
        int pontuacaoB = timeb.calculaPontuacao();
        if (pontuacaoA > pontuacaoB) {
            return timea.nome;
        } else {
            return timeb.nome;
        }
    }
    /*
    void mostraCampeao() {
        
        int pontuacaoA = a.calculaPontuacao();
        int pontuacaoB = b.calculaPontuacao();
        if (pontuacaoA > pontuacaoB) {
            System.out.println(a.nome);
        } else {
            System.out.println(b.nome);
        }
    }
    */
    
    Time mostraCampeao() {
        
        int pontuacaoA = timea.calculaPontuacao();
        int pontuacaoB = timeb.calculaPontuacao();
        if (pontuacaoA > pontuacaoB) {
            return timea;
        } else {
            return timeb;
        }
    }
}
