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
public class Teste {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        
        Pessoa maria = new Pessoa();
        
        joao.enviaMensagem(maria,"ola gatinha");
        joao.enviaMensagem(maria,"ja gostei mais disso no passado");
        joao.enviaMensagem(maria,"vamos pro DEXTER");
        joao.enviaMensagem(maria,"depois nois vamo pro zero34");
        joao.enviaMensagem(maria,"finalmente vamos jantar um HABIBÃO no habibs");
        
        
        System.out.println(maria.mensagensRecebidas);
        
    }
}
