/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpacoteabstrato;

import dpacoteabstrato.*;

/**
 *
 * @author EDYA
 */
public class BTeste {

    public static void main(String[] args) {
        BControleDeBonificacoes c = new BControleDeBonificacoes();

        BGerente g = new BGerente();
        g.salario = 1000;
        
        BGerente d = new BDiretor();
        g.salario = 1000;
        
        BSecretaria s = new BSecretariaAdministrativa();
        s.salario = 1000;
        
        c.registra(g);
        c.registra(d);
        c.registra(s);
        
        System.out.println("\nTotal de bonificações: " + c.getTotalDeBonificacoes());
    }
}
