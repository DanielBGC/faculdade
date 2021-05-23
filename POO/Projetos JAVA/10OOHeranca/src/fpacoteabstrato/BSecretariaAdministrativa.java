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
public class BSecretariaAdministrativa extends BSecretaria{

    @Override
    public double getBonificacao() {
        System.out.println("Executando BSecretariaAdministrativa");
        return salario * 1.3;
    }
    
}
