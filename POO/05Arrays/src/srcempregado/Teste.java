/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcempregado;

/**
 *
 * @author EDYA
 */
public class Teste {
    public static void main(String[] args) {
      //DIFICULDADES DE GERENCIAR UM VETOR
      //está cheio ?
      //está vazio ?
      //tem posições nulas ?
      //como excluir ?
      //onde inserir ?
      //buscar ele todo ?
      //ordenar ?
        Empresa empresa = new Empresa();
        empresa.cnpj = "2323423/34234";
        
        Funcionario f1= new Funcionario();
        f1.nome ="joao";
        f1.rg = 123123;
        f1.salario = 2344;
        
        Funcionario f2= new Funcionario();
        f2.nome ="joana";
        f2.rg = 123123;
        f2.salario = 2344;
        
        Funcionario f3 = new Funcionario();
        f3.nome ="josé";
        f3.rg = 123123;
        f3.salario = 2344;
        
        //plano A
        empresa.adiciona(f1);
        empresa.adiciona(f2);
        empresa.adiciona(f3);
        
        //plano B
        
        /*
        empresa.empregados = new Funcionario[10];

        empresa.empregados[0] = f1;
        empresa.empregados[1] = f2;
        
        empresa.empregados[3] = new Funcionario();
        empresa.empregados[3].nome = "asdfas";
        empresa.empregados[3].salario = 12323;
        empresa.empregados[3].rg = 123;
                */
        empresa.contem(f1);
        
        

     }
}
