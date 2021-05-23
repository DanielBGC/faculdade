/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aheranca;

/**
 *
 * @author EDYA
 */
public class ETeste1 {
    public static void main(String[] args) {
        //TESTE 1
        EFuncionario funcionario = new EFuncionario();
        funcionario.setSalario(5000.0);
                
        EGerente gerente = new EGerente();
        gerente.setSalario(5000.0);
        
        //TESTE 1: getBonificacao na classe Funcionário
        //System.out.println("Funcionario getBonificacao:" + funcionario.getBonificacao());
        //System.out.println("Gerente getBonificacao:" + gerente.getBonificacao());
        
        //TESTE 2: getBonificacao na classe Funcionário e na classe Gerente (descomentar)
        //System.out.println("Funcionario getBonificacao:" + funcionario.getBonificacao());
        //System.out.println("Gerente getBonificacao:" + gerente.getBonificacao());
        
        //TESTE 3: retornaBonficacao na classe Funcionário e na classe Gerente
        //System.out.println("Funcionario retornaBonficacao:" + funcionario.retornaBonficacao());
        //System.out.println("Gerente retornaBonficacao:" + gerente.retornaBonficacao());

        //TESTE 4: retornaBonficacao na classe Funcionário e na classe Gerente(com invocação de método reescrito)
       System.out.println("Funcionario retornaBonficacao:" + funcionario.retornaBonficacao());
      System.out.println("Gerente retornaBonficacao:" + gerente.retornaBonficacao());
        
       /*
        Depois do Cap 7 Caelum Ex 1.txt
        */ 
        
    }
}
