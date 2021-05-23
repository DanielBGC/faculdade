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
public class FFuncionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public double getBonificacao() {
        
        double parcial = this.salario * 0.10;
        System.out.println("Executando funcionario. Parcial: " + parcial);
        return parcial;
    }

    public double ofereceAumento() {

        return (this.salario * 1.10);
    }
    
    public String getNome() {
        return nome;
    }

// métodos
}
