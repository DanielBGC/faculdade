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
public class CTeste {

    public static void main(String[] args) {
        CGerente gerente = new CGerente();
        // podemos chamar métodos do Funcionario:
        gerente.setNome("João da Silva");
        gerente.nome = "Joao Carlos";
        gerente.salario = 2000.0;
        
        // e também métodos do Gerente!
        gerente.setSenha(4231);
    }
 
}
