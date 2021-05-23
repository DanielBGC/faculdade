/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jherancacomposicao;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class DTeste {
    public static void main(String[] args) {
        DTripulacao tripulacao = new DTripulacao();
        //tripulacao.pessoa2 = new DPessoa();
        DPessoa pessoa = new DPessoa();
        tripulacao.setPessoa(pessoa);
        
        tripulacao.getPessoa().setNome("Eduardo");
        tripulacao.getPessoa().setIdade(20);
        tripulacao.getPessoa().getBOnificacao();
              
                
    }
}
