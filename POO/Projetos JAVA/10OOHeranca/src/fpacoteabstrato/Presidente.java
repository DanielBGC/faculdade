/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpacoteabstrato;

/**
 *
 * @author Daniel B G C
 */
public class Presidente extends BFuncionario {
    @Override
    public double getBonificacao() {
      return salario * 1.6;
    }
}
