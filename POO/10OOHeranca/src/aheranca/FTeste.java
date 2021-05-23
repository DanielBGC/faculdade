/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aheranca;

/**
 *
 * @author EDYA
 */
public class FTeste {
    public static void main(String[] args) {
        FControleDeBonificacoes c = new FControleDeBonificacoes();
        
        FFuncionario f = new FFuncionario();
        f.salario = 1000;
        
        FGerente g = new FGerente();
        g.salario = 1000;
        
        FSecretaria s = new FSecretaria();
        s.salario = 1000;
         
        c.registra(f);
        c.registra(g);
        c.registra(s);
        
        System.out.println("\nTotal de bonificações: " + c.getTotalDeBonificacoes());
        
        //E se for criado um Diretor na agência ?
    }
}
