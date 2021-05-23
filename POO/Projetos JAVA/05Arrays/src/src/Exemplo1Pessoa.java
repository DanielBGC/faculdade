/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *Crie 3 pessoas com nome e idade. Leia estes dados do teclado e armazene em um array.
 * Imprima os dados do array
 * @author EDYA
 */
public class Exemplo1Pessoa {
    public static void main(String[] args) {
        Pessoa [] pessoas = new Pessoa[3];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa p = new Pessoa();

            System.out.println("Entre com o nome da pessoa: ");
            p.nome = scanner.nextLine();

            System.out.println("Entre com a idade da pessoa: ");
            p.idade = Integer.parseInt(scanner.nextLine());
        
            pessoas[i] = p;
        }
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        
        
     }
}
