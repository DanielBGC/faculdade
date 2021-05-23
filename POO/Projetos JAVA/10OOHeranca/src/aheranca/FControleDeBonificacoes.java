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
public class FControleDeBonificacoes {

    private double totalDeBonificacoes = 0;

    public void registra(FFuncionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }
  

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}
