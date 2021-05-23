/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.util.Scanner;


/**
 *
 * @author EDYA
 */
public class Exemplo1 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int idade;
        System.out.print("Informe sua idade: ");
        idade = Integer.parseInt(scanner.nextLine());
        System.out.println("a idade lida foi..." + idade);

        double preco;
        System.out.println("Informe o preço: ");
        preco = Double.parseDouble(scanner.nextLine());
        System.out.println("O preco foi " + preco);

        String nome;
        System.out.print("Entre com seu primeiro nome: ");
        nome = scanner.nextLine();
        System.out.println("O meu primeiro " + nome);

        String fullName;
        System.out.println("Entre com seu nome completo: ");
        fullName = scanner.nextLine();
        System.out.println("MEu nome completo e: " + fullName);
    }
}
