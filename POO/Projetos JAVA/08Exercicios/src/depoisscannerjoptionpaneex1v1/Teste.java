/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisscannerjoptionpaneex1v1;

import java.util.Scanner;

/**
 *
 * @author eduardoasilvestre
 */
public class Teste {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String menu = "";
        menu += "1 - Mostrar os dados da Pessoa (nome, salario e nascimento).";
        menu += "\n2 - Exibe o IMC do Paciente (peso /altura^2)";
        menu += "\n3 - Exibe a idade que a Pessoa fará em 2018 (c/ sua data de nascimento)(10/01/1990)";
        menu += "\n4 - Sair";
        int opcao = 10;
        Pessoa p = null;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = Integer.parseInt(s.nextLine());
            
            switch (opcao) {
                case 1:
                    if (p != null) {
                        System.out.println(p.toString());

                    } else {
                        p = new Pessoa();
                        System.out.println("Entre com o nome da pessoa: ");
                        p.nome = s.nextLine();

                        System.out.println("Entre com a salario: ");
                        p.salario = Double.parseDouble(s.nextLine());

                        System.out.println("Entre com o nascimento da pessoa: ");
                        p.nascimento = s.nextLine();
                    }
                    break;
                case 2:
                    Paciente paciente = new Paciente();
                    System.out.println("Altura: ");
                    paciente.altura = Double.parseDouble(s.nextLine());

                    System.out.println("Peso: ");
                    paciente.peso = Double.parseDouble(s.nextLine());

                    double resultado = paciente.calculaImc();
                    System.out.println("Imc" + resultado);
                    System.out.printf("IMC %.2f", resultado);
                    break;
                case 3:
                    System.out.println("Idade: ");
                    String idade = s.nextLine();
                    String array[] = idade.split("/");
                    int ano = Integer.parseInt(array[2]);
                    
                    int idade2018 = 2018 - ano;
                    System.out.println("Idade em 2018 " + idade2018);
                    
                    break;
                case 4:
                    break;
                default:
                    break;
            }

        }

    }
}
