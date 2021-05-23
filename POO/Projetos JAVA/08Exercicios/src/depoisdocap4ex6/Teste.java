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
public class Teste {
    public static void main(String[] args) {
        Pessoa p = null;
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
                            p = new Pessoa();
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
