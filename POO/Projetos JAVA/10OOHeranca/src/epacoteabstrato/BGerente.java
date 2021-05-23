/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epacoteabstrato;

/**
 *
 * @author EDYA
 */
public class BGerente extends BFuncionario {

     int senha;
    int numeroDeFuncionariosGerenciados;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    //COMENTE ESTE MÉTODO PARA TESTE...
    @Override
    public double getBonificacao() {
        System.out.println("Executando gerente");
        return this.salario + 200;
    }
}
