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
public class FSecretaria extends FFuncionario {
    @Override
    public double getBonificacao() {
        double parcial = this.salario * 0.05;
        System.out.println("Executando secretaria. Parcial: " + parcial);
        return  parcial;
    }
}
