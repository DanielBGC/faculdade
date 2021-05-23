/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import exercicios.Pessoa;

/**
 *
 * @author EDYA
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        joao.nome = "joao";
        
        Pessoa maria = new Pessoa();
        maria.nome = "Maria";
        
        joao.enviaMensagem(maria, "Oi gatinha");
        
        joao.enviaMensagem(maria, "Vem sempre aqui ?");
        
        joao.enviaMensagem(maria, "Oi sumida !!");
        
        joao.enviaMensagem(maria, "O que tem de legal para fazer nessa cidade ?");
        
        joao.enviaMensagem(maria, "Você é uma anjo... porque voce caiu do céu");
        
        maria.enviaMensagem(joao, "ola joao manezao");
        
        maria.mostraMensagens();
        
        joao.mostraMensagens();
    }
}
