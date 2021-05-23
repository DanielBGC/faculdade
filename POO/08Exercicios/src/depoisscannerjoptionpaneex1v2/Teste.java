/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisscannerjoptionpaneex1v2;

import java.util.Scanner;

/**
 *
 * @author eduardoasilvestre
 */
public class Teste {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa pessoa = null;
        Paciente paciente = null;
        int opcao = 51;
        do {
            String stringLoop = "1 - Criar uma Pessoa (nome, salario e nascimento)\n"
                    + "2 - Exibir a Pessoa\n"
                    + "3 - Destruir a Pessoa\n"
                    + "4 - Criar um Paciente (nome, peso, altura)\n"
                    + "5 - Exibir o Paciente\n"
                    + "6 - Exibe o IMC do Paciente (peso /altura^2)\n"
                    + "7 - Destruir o Paciente\n"
                    + "8 - Exibe a idade que a Pessoa fará em 2019\n"
                    + "	(c/ sua data de nascimento)(10/01/1990)\n"
                    + "9 - Sair"
                    + "\n\nQual sua opcao ?R:";
            System.out.print(stringLoop);
            opcao = Integer.parseInt(s.nextLine());

            switch (opcao) {
                case 1:
                    if (pessoa != null) {
                        System.out.println("pessoa ja existe");
                    } else {
                        pessoa = new Pessoa();
                        System.out.println("nome: ");
                        pessoa.nome = s.nextLine();

                        System.out.println("salario: ");
                        pessoa.salario = Double.parseDouble(s.nextLine());

                        System.out.println("nascimento: ");
                        pessoa.nascimento = s.nextLine();
                    }

                    break;

                case 2:
                    if (pessoa != null) {
                        /*System.out.println(p.nome);
                        System.out.println(p.salario);
                        System.out.println(p.nascimento);
                         */
                        //p.mostrar();
                        System.out.println(pessoa.toString());
                        System.out.println(pessoa);
                    } else {
                        System.out.println("pessoa nao existe");
                    }
                    break;

                case 3:
                    if (pessoa != null) {
                        pessoa = null;
                    } else {
                        System.out.println("objeto nao existe");
                    }
                    break;

                case 4:
                    if (paciente != null) {
                        System.out.println("paciente ja existe");
                    } else {
                        paciente = new Paciente();
                        System.out.println("nome: ");
                        paciente.nome = s.nextLine();

                        System.out.println("altura: ");
                        paciente.altura = Double.parseDouble(s.nextLine());

                        System.out.println("peso: ");
                        paciente.peso = Double.parseDouble(s.nextLine());
                    }
                    break;

                case 5:
                    if (paciente != null) {
                        /*System.out.println(p.nome);
                        System.out.println(p.salario);
                        System.out.println(p.nascimento);
                         */
                        //p.mostrar();
                        System.out.println(paciente.toString());
                        //System.out.println(pessoa);
                    } else {
                        System.out.println("pacient nao existe");
                    }
                    break;

                case 6:
                    if (paciente != null) {

                        System.out.println("o imc do paciente e:");
                        System.out.printf("%.2f", paciente.calculaIMC());
                        

                    } else {
                        System.out.println("objeto nao existe");
                    }
                    break;

                case 7:
                    if (paciente != null) {
                        paciente = null;
                    } else {
                        System.out.println("objeto nao existe");
                    }
                    break;

                    case 8:
                        System.out.println(pessoa.pegaIdade2019());

                    break;

                case 9:
                    System.out.println("9");
                    break;

                default:
                    System.out.println("default");
                    break;
            }

        } while (opcao != 9);
    }
}
