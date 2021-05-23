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
public class Exemplo6ContaTokens {

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto:");
        while (sc.hasNext()) {
            System.out.println("Token: " + sc.next());
            i++;
            System.out.print("Digite um texto:");
        }
        sc.close(); //Encerra o programa
        System.out.println("Tokens: " +i);
    }
}
