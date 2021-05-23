/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcempregado2proxposicaolivre;



/**
 *
 * @author EDYA
 */
public class Funcionario {
    String nome;
    int rg;
    double salario;

    @Override
    public String toString() {
        return "O meu nome e " + this.nome + " | RG: " + this.rg;
    }
    
   
}
