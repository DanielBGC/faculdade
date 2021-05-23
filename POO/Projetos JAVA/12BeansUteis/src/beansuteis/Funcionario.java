/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansuteis;

/**
 *
 * @author EDYA
 */
public class Funcionario {

    private String nome;
    protected String cpf;
    protected double salario;

    public double getBonificacao() {
        int x;
        System.out.println("Executando funcionario");
        return this.salario * 0.10;
    }
    
    public double ofereceAumento() {
        
        
        return (this.salario * 1.10);
    }
    
// métodos

}
