/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpacoteabstrato;

/**
 *
 * @author EDYA
 */
public abstract class BFuncionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public abstract double getBonificacao();
    
}
