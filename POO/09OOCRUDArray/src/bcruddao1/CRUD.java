/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcruddao1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class CRUD {
    public CRUD() {
        FilmeDAORAM dao = new FilmeDAORAM();
        //FilmeDAO dao = new FilmeDAO();
        
        int opcaoMenu;
        do {
        opcaoMenu = menu();
            switch (opcaoMenu) {
                case 1:
                    Filme f = this.criaFilme();
                    int retorno = dao.inserir(f);
                    if (retorno == -1) {
                        System.out.println("Filme não foi inserido. Lista está cheia");
                    }
                    break;

                case 2:
                    dao.listar();
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while(opcaoMenu!= 3);
        System.out.println("Volta outra vez...");
 
    }
    public static void main(String[] args) {
        new CRUD();
    }
    
    private Filme criaFilme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do filme:");
        String titulo = scanner.nextLine();
        
        Filme f = new Filme(titulo, LocalDate.MIN, BigDecimal.ZERO);
        
        return f;
    
    }
    
    private int menu() {
        System.out.println("\n\nSeja bem vindo ao meu programa CRUD");
        System.out.println("Escolha a opcão desejada");
        System.out.println("1 - Criar Filme");
        System.out.println("2 - Listar Filmes");
        System.out.println("3 - Alterar filme");
        System.out.println("4 - Excluir filme");
        System.out.println("5 - Sair do programa");
        System.out.print("Qual Sua opção ? R: ");
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
    }
}
