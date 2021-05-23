/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap4ex6;

import java.util.Scanner;


/**
 *
 * @author eduardoasilvestre
 */
public class PessoaUm {
    /**
Faça um programa em JAVA (versão 8) que contenha um menu infinito para a classe Pessoa. 
Uma Pessoa deve ter nome, peso e idade e métodos.
Na opção 1 deverá ser criado um objeto a partir de leitura de dados do teclado (classe Scanner), caso o objeto já exista, exiba o carro existentes.
Na opção 2 deverá ser possível excluir uma pessoa cadastrado na opção 1.
Na opção 3 será possível que a pessoa diga olá.
Na opção 4 será possível calcular quantos anos a pessoa terá em 2019 (sabendo que ela ainda não fez aniversário).
Na opção 5 exibirá "magrinho(a) se tiver menos de 60 kg" ou "gordinha(a) se tiver mais de 60kg".
Na opção 0 o programa é encerrado
     * 
     * jogador de futebol
     * nome=miraildes, idade=45, pé preferido= direito
     * nome= rg, idade= 39,prépreferido = direito
     * 
     */
    
    String nome;
    int peso;
    int idade;
    
    void dizerAlgo() {
        System.out.println("ola");
    }
    
    void mostraEstadoPessoa() {
        if (peso > 60) {
            System.out.println("gordinha");
        } else {

            System.out.println("magrinha");   
        }
    
    }
    int pegaIdadeEm2019() {
        return (idade + 1);
    }
    
    public static void main(String[] args) {
        PessoaUm p = null;
        Scanner scanner = new Scanner(System.in);
        int opcao = 250;
        while (opcao != 0) {
            System.out.println("1 criar um objeto a partir da leitura do teclado");
            System.out.println("2 excluir uma pessoa cadastrada");
            System.out.println("3 dizer ola");
            System.out.println("4 calcular quantos anos a pessoa tera em 2019");
            System.out.println("5 magrinho(a) se tiver menos de 60 kg\" ou \"gordinha(a) se tiver mais de 60kg");
            System.out.println("0 sair do programa");
            System.out.print("Qual sua opção ? R: ");
            opcao = Integer.parseInt(scanner.nextLine());
            
            switch(opcao){
                    case 1:
                        if (p == null) {
                            p = new PessoaUm();
                            System.out.println("nome:");
                            p.nome = scanner.nextLine();
                            
                            System.out.println("peso:");
                            p.peso = Integer.parseInt(scanner.nextLine());
                            
                            System.out.println("idade:");
                            p.idade =  Integer.parseInt(scanner.nextLine());
                        } else {
                            System.out.println(p.nome);
                            System.out.println(p.idade);
                            System.out.println(p.peso);
                        }
                        break;
                        
                     case 2:
                         p = null;
                        break;
                    case 3:
                        p.dizerAlgo();
                        break;
                    case 4:
                        
                        System.out.println("em 2019 a pessoa tera " + p.pegaIdadeEm2019());
                        break;
                     case 5:
                        p.mostraEstadoPessoa();
                        break;
                    case 0:
                        System.out.println("0");
                        break;
                    default:
                        System.out.println("default");
                        break;
                        
            }
                     
        }
        
    }
}
