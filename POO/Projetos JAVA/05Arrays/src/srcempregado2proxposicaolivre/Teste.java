/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcempregado2proxposicaolivre;


/**
 *
 * @author eduardoasilvestre
 */
public class Teste {
    public static void main(String[] args) {
        Empresa e = new Empresa();
        
        Funcionario f1 = new Funcionario();
        f1.nome="Claudinha Bagaceira";
        f1.rg =123;
        f1.salario = 2000;
        
        Funcionario f2 = new Funcionario();
        f2.salario = 1700;
        f2.nome ="Maluco do axé";
    
        
        e.adiciona(f1);
        e.adiciona(f2);
        
        
        Funcionario f3 = new Funcionario();
        f3.nome = "ivete poeiraaaaaaaaaaaaa";
                
        e.mostraEmpregados();
        
        if (e.contem(f3)) {
            System.out.println("funcionario encontrado");
        } else {
            System.out.println("funcionario não encontrado");
        }
    }
}
