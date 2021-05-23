/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excluir;

import java.util.Scanner;

/**
 *
 * @author eduardoasilvestre
 */
public class ScannerTeste {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String menu = "";
        menu += "1 - Criar uma Pessoa (nome, salario e nascimento)"
                + "\n2 - Exibir a Pessoa"
                + "\n3 - Destruir a Pessoa"
                + "\n4 - Criar um Paciente (nome, peso, altura)"
                + "\n5 - Exibir o Paciente"
                + "\n6 - Exibe o IMC do Paciente (peso /altura^2)"
                + "\n7 - Destruir o Paciente"
                + "\n8 - Exibe a idade que a Pessoa fará em 2020 (c/ sua data de nascimento)(10/01/1990)"
                + "\n9 - Sair"
                + "\nQual sua opção ? R: ";
        int opcao = 32;
        Pessoa p = null;
        Paciente paciente = null;
        while (opcao != 9) {
            System.out.println(menu);
            opcao = Integer.parseInt(s.nextLine());

            switch (opcao) {
                case 1:
                    if (p == null) {
                        p = new Pessoa();
                        System.out.println("nome:");
                        p.nome = s.nextLine();

                        System.out.println("nascimento:");
                        p.nascimento = s.nextLine();

                        System.out.println("salario:");
                        p.salario = Double.parseDouble(s.nextLine());
                    } else {
                        System.out.println("p já foi criado");
                    }
                    break;
                case 2:
                    if (p != null) {
                        p.exibePessoa();
                    } else {
                        System.out.println("crie a pessoa primeiro");
                    }

                    break;
                case 3:
                    if (p != null) {
                        p = null;
                    } else {
                        System.out.println("pessoa nao existe");
                    }
                    break;

                case 4:
                    if (paciente == null) {
                        paciente = new Paciente();

                        System.out.println("nome:");
                        paciente.nome = s.nextLine();

                        System.out.println("peso:");
                        paciente.peso = Double.parseDouble(s.nextLine());

                        System.out.println("altura:");
                        paciente.altura = Double.parseDouble(s.nextLine());
                    } else {
                        System.out.println("paciente já foi criado");
                    }
                    break;

                case 5:
                    if (paciente != null) {
                        System.out.println(paciente.toString());
                        //System.out.println(paciente);
                    } else {
                        System.out.println("crie a paciente primeiro");
                    }

                    break;
                case 6:
                    double resultado = paciente.calculaImc();
                     System.out.printf("O imc é %.2f", resultado);

                    break;
                case 7:
                    if (paciente != null) {
                        paciente = null;
                    } else {
                        System.out.println("paciente nao existe");
                    }
                    break;
                case 8:
                    int idade = p.pegaIdadeEm2020();
                    System.out.println("idade em 20 20  : " + idade);
                    break;

                case 9:
                    System.out.println("vai perder");
                    break;

                default:
                    System.out.println("default");
                    break;
            }
        }
    }
}
