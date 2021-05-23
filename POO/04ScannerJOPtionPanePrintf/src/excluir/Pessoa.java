/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excluir;

import java.time.LocalDate;

/**
 *
 * @author eduardoasilvestre
 */
public class Pessoa {
    String nome;
    double salario;
    String nascimento;
    //LocalDate nascimento;
    
    int pegaIdadeEm2020() {
        //"21/11/1994";
        return (2020 - Integer.parseInt(nascimento.substring(6, nascimento.length())));
    }
    
    void exibePessoa( ) {
        String exibirPessoa = "Nome: " + this.nome + " | "
                            + "Nascimento: " + this.nascimento + " | " + "Salário: " + this.salario;
        System.out.println(exibirPessoa);
    
    }
}
