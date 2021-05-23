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
public class BSecretariaAgencia extends BSecretaria {

    @Override
    public double getBonificacao() {
      return salario * 1.2;
    }
    
}
