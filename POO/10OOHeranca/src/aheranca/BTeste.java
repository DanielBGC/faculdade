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
public class BTeste {

    public static void main(String[] args) {
        BFuncionario funcionario = new BFuncionario();
                
        BGerente gerente = new BGerente();
        // podemos chamar métodos do Funcionario:
        gerente.setNome("João da Silva");
        
        // e também métodos do Gerente!
        gerente.setSenha(4231);
        
        
        BGerente g2  = new BGerente();
        g2.setNome("Eduardo");
        g2.setCpf("0234234");
        g2.setNumeroDeFuncionariosGerenciados(10);
        
    }
}
