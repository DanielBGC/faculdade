/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap4ex3;

/**
 *
 * @author eduardoasilvestre
 */
public class Pessoa {
    String nome;
    String mensagensRecebidas;

    void enviaMensagem(Pessoa p2, String mensagem) {
        if (p2.mensagensRecebidas == null) {
            p2.mensagensRecebidas = mensagem + "\n";
        } else {
            p2.mensagensRecebidas += mensagem + "\n";
        }
        
    }
    
    
}
