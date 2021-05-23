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
public class BSecretaria extends BFuncionario {
    @Override
    public double getBonificacao() {
        System.out.println("Executando secretaria");
        return this.salario * 0.05 ;
    }
}
