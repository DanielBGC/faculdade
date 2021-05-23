/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap4ex7;

import java.util.Scanner;

/**
 *
 * @author eduardoasilvestre
 */
public class Teste2 {

    Scanner scanner = new Scanner(System.in);
    PessoaDAORAM pessoaDAORAM = new 
            PessoaDAORAM();
   
    ServidorDAORAM servidorDAORAM = new ServidorDAORAM();
    
    //Toda vez que tiver um array com muitas manipulação
    //vc deveria um dao para ele
    
    //Servidor[] pessoas = new Servidor[5];
    //Item[] pessoas = new Item[5];
    //Ambiente[] pessoas = new Ambiente[5];
    //MI[] pessoas = new MI[5];
    //MD[] pessoas = new MD[5];
    //RA[] pessoas = new RA[5];
    //IR[] pessoas = new IR[5];
    
    //BAD SMELL ????
    

    public Teste2() {
        fazTudao();
        Pessoa temp = pessoaDAORAM.buscarPorNome("Eduardo");
        System.out.println(temp);

    }

    public static void main(String[] args) {
        new Teste2();
        
        //odiamos a main
    }

    private void fazTudao() {

        int opcaoUsuario = 10;

        while (opcaoUsuario != 0) {
            opcaoUsuario = pegaOpcaoUsuario();

            switch (opcaoUsuario) {
                case 0:
                    System.out.println("sair");
                    break;

                case 1:
                    Pessoa p = criaPessoa();

                    if (pessoaDAORAM.inserirPessoa(p)) {
                        System.out.println("inserido");
                    } else {
                        System.out.println("não inserido");
                    }
                    break;

                case 2:
                    pessoaDAORAM.mostrarPessoas();

                    break;

                case 3:
                    System.out.println("As pessoas existente são: ");
                    pessoaDAORAM.mostrarPessoas();
                    System.out.println("Qual pessoa alterar ?");
                    long id = Long.parseLong(scanner.nextLine());
                    System.out.println("Qual o novo nome ?");

                    String novoNome = scanner.nextLine();

                    if (pessoaDAORAM.alterarPessoa(id, novoNome)) {
                        System.out.println("nome foi alterado");
                    } else {
                        System.out.println("nome não foi alterado");
                    }

                    break;
                case 4:
                    System.out.println("As pessoas existente são: ");
                    pessoaDAORAM.mostrarPessoas();
                    System.out.println("Qual pessoa excluir ?");
                    long idE = Long.parseLong(scanner.nextLine());
                    
                    if (pessoaDAORAM.excluirPessoa(idE)) {
                        System.out.println("excluido");
                    } else {
                        System.out.println("não foi excluído");
                    }
                    break;

                case 5:
                    System.out.println("5 sair");
                    break;
                default:
                    System.out.println("aí não banana");
                    break;

            }
        }
        System.out.println("Saí do menu");
    }

    private Pessoa criaPessoa() {
        Pessoa p = new Pessoa();

        System.out.println("Qual o seu nome: ");
        String nomeLido = scanner.nextLine();


        p.setNome(nomeLido);

        return p;
    }

    private int pegaOpcaoUsuario() {
        mostraMenu();

        String temp = scanner.nextLine();
        return Integer.parseInt(temp);
    }

    private void mostraMenu() {
        System.out.println("BEM VINDO A MEU PROGRAMA MANEZÃO");
        System.out.println("0 - sair");
        System.out.println("1 - cadastrar pessoa");
        System.out.println("2 - mostrar pessoas");
        System.out.println("3 - alterar pessoa");
        System.out.println("4 - excluir pessoa");
        System.out.println("5 - buscar por nome");
        System.out.print("Qual sua opção ? R: ");
    }

   

}
