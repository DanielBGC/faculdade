/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap4ex4;

/**
 *
 * @author eduardoasilvestre
 */
public class Computador {
    String mensagensRecebidas="";
    String mensagensEnviadas="";
    String nome;
    
    

    void enviaMensagem(Computador destino, String mensagem) {
        destino = new Computador();
         destino.mensagensRecebidas  = destino.mensagensRecebidas + mensagem + "\n";
        this.mensagensEnviadas = this.mensagensEnviadas + mensagem + "\n";
        
    }
}
