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
public class FProgramador extends FFuncionario{
    int experiencia;//experiencia em anos
    
    @Override
    public double getBonificacao() {
        
        double parcial = this.salario * 0.50;
        System.out.println("Executando programador. Parcial: " + parcial);
        return parcial;
    }
}
