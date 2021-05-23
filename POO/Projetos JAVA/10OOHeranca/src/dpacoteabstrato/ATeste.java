/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpacoteabstrato;

/**
 *
 * @author EDYA
 */
public class ATeste {

    public static void main(String[] args) {
        //classe funcionário não pode ser instanciada
        //TESTE1
        //AFuncionario funcionario = new AFuncionario();
        
        //TESTE 2
        AGerente gerente = new AGerente();
        gerente.cpf = "899";
        gerente.nome = "99392";
        gerente.senha = 212;
        gerente.salario = 5000;

        double resultado1 = gerente.getBonificacao();
        System.out.println("Bonificação do gerente: " + resultado1 + "\n");

        AFuncionario f = gerente;
        double resultado2 = f.getBonificacao();
        System.out.println("Bonificação do \"funcionário\": " + resultado2 + "\n");

        ASecretaria secretaria = new ASecretaria();
        secretaria.salario = 2000;                
        double resultado3 = secretaria.getBonificacao();
        System.out.println("Bonificação da secretaria: " + resultado3);
   
        
    
    }
}
