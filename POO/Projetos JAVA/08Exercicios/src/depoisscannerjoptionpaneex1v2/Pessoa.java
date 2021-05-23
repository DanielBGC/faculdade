/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisscannerjoptionpaneex1v2;

/**
 *
 * @author eduardoasilvestre
 */
public class Pessoa {

    String nome;
    double salario;
    String nascimento;

    /*
    void mostrar() {
        System.out.println(this.nome);
        System.out.println(salario);
        System.out.println(nascimento);
    }
*/
    
    int pegaIdade2019() {
        return 2019 - pegaAnoDeString();
    }
    
    int pegaAnoDeString() {
        
        String ano1="";
        for(int i=6; i < nascimento.length(); i++) {
            ano1 += nascimento.charAt(i) + "";
        }
        return Integer.parseInt(ano1);
    }
    
    @Override
    public String toString() {
        return "o nome do usuario e " + nome;
    }
    
    
}

