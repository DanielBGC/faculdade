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
public class Gerente extends Funcionario {

     int senha;
    int numeroDeFuncionariosGerenciados;
    /**
     * 
     * 
     **/
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    @Override
    public double getBonificacao() {
        System.out.println("Executando gerente");
        return this.salario * 0.15 ;
    }
    
    
    public double ofereceAumento() {
        
        
        return (super.ofereceAumento() + 500);
    }
    
}
