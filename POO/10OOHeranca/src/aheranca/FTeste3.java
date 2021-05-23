/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aheranca;

/**
 *
 * @author eduardoasilvestre
 */
public class FTeste3 {
    public static void main(String[] args) {
        
        FControleDeBonificacoes bonificacoes = new FControleDeBonificacoes();
        
        FFuncionario funcionario = new FFuncionario();
        funcionario.nome = "f1";
        funcionario.salario = 1000;
        
        FGerente gerente = new FGerente();
        gerente.nome = "f2";
        gerente.salario = 2000;
   
        FChapaCovid chapaCovid = new FChapaCovid();
        chapaCovid.salario = 1000;
        
                
        
        
        bonificacoes.registra(funcionario);
        bonificacoes.registra(gerente);
        
        bonificacoes.registra(chapaCovid);
       
        
        System.out.println(bonificacoes.getTotalDeBonificacoes());
        
    }
}
