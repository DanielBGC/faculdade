/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpacoteabstrato;

/**
 *
 * @author EDYA
 */
public abstract class AFuncionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public double getBonificacao() {
        return (this.salario +100);
    }
}
