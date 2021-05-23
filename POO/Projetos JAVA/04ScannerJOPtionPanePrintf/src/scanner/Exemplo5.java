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
public class Exemplo5 {
    long id;
    String firstName;
    String surname;
    int age;
    public static void main(String[] args) {
        //alternativa 1: cria uma referência e não precisar do static
        //Exemplo5 exemplo5 = new Exemplo5();
        //exemplo5.readingOne();
        
        //alternativa 2: usa o static (pertence a classe e não ao objeto) é não precisa da referência (
        readingOne();
    }
    private static void readingOne() {
        Scanner scanner = new Scanner(System.in);

        Exemplo5 t = new Exemplo5();
        System.out.print("Enter your id: ");
        t.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter your first name: ");
        t.firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        t.surname = scanner.nextLine();
        System.out.print("Enter your age: ");
        t.age = scanner.nextInt();

        System.out.println(t.toString());
    }
    @Override
    public String toString() {
        String resultado = "";
        resultado += "Teclado:";
        resultado += " Id: " + id;
        resultado += " Primeiro nome: " + firstName; 
        return resultado;    }
}
