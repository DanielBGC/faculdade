/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap4ex5;

import java.util.Scanner;

/**
 *
 * @author eduardoasilvestre
 */
public class Carro {

    String modelo;
    int ano;
    String cor;
    int velocidade;
    boolean ligado = false;

    public static void main(String[] args) {
        Carro c = null;

        int opcao;
        do {
            System.out.println("1 Digite os dados do carro: ");
            System.out.println("2 Excluir o carro cadastrado: ");
            System.out.println("3 Ligue o carro: ");
            System.out.println("4 Desligue o carro: ");
            System.out.println("5 Calcule o valor do aluguel do carro: ");
            System.out.println("0 Sair ");
            System.out.print("Qual sua opção: R: ");

            Scanner s = new Scanner(System.in);
            opcao = Integer.parseInt(s.nextLine());

            switch (opcao) {
                case 1:

                    if (c == null) {

                        c = new Carro();
                        System.out.println("Modelo do carro:");
                        c.modelo = s.nextLine();

                        System.out.println("Ano:");
                        c.ano = Integer.parseInt(s.nextLine());

                        System.out.println("Cor:");
                        c.cor = s.nextLine();
                    } else {
                        System.out.println(c.toString());

                    }

                    break;
                case 2:
                    if (c == null) {
                        System.out.println("carro inexistente");
                    } else {
                        c = null;
                        System.out.println("carro excluído");
                    }
                    break;
                case 3:
                    c.ligar();
                    break;
                case 4:

                    c.desligar();
                    break;
                case 5:
                    System.out.println("Quantos dias deseja alugar o carro ?R:");
                    int dias = Integer.parseInt(s.nextLine());
                    double valor = c.calculeAlguel(dias);
                    System.out.println("Será pago " + valor + "reais em aluguel");

                    break;
                default:
                    System.out.println("Opção Inexistente");
                    break;

            }
        } while (opcao != 0);

    }

    void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligando...");
        } else {
            System.out.println("Carro já ligado...");
        }
    }

    void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Carro desligando...");
        } else {
            System.out.println("Carro não está ligado...");
        }
    }

    double calculeAlguel(int dia) {
        if (dia >= 1 && dia <= 4) {
            return 100;
        } else if (dia >= 5 && dia <= 7) {
            return 150;
        }
        return 1000;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + ", velocidade=" + velocidade + ", ligado=" + ligado + '}';
    }
}
