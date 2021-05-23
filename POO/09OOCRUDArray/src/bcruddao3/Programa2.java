/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcruddao3;


import java.util.Scanner;

/**
 *
 * @author eduardoasilvestre
 */
public class Programa2 {

    Scanner s = new Scanner(System.in);
    PessoaDAORAM pessoaDAORAM = new PessoaDAORAM();
    
    //Aluno[] pessoas = new Aluno[5];
    //Avaliador[] pessoas = new Avaliador[5];
    //Trabalho[] pessoas = new Trabalho[5];
    //Evento[] pessoas = new Evento[5];
    //Avaliacao[] pessoas = new Avaliacao[5];

    public Programa2() {
        int opcao;
        do {
            opcao = pegaOpcaoUsuario();

            switch (opcao) {
                case 1:
                    Pessoa p = criaPessoa();

                    if (pessoaDAORAM.adiciona(p)) {
                        System.out.println("Pessoa inserida com sucesso.");
                    } else {
                        System.out.println("Array cheio");
                    }
                    break;
                case 2:
                    pessoaDAORAM.mostra();
                    break;

                case 3:
                    System.out.println("Digite o nome atual:");
                    String nomeAtual = s.nextLine();
                    
                    System.out.println("Digite o novo nome:");
                    String novoNome = s.nextLine();
                    
                   
                    if ( pessoaDAORAM.altera(nomeAtual, novoNome)) {
                        System.out.println("individuo alterado");
                    } else {
                        System.out.println("nao alterado");
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome exclusao:");
                    String nomeExclusao = s.nextLine();
                    
                    if (pessoaDAORAM.exclui(nomeExclusao)) {
                        System.out.println("individuo excluído");
                    } else {
                        System.out.println("nao excluido");
                    }
                    break;
                case 5:
                    System.out.println("5");
                    break;
                default:
                    System.out.println("defult");
                    break;

            }
        } while (opcao != 5);
    }

    private int pegaOpcaoUsuario() throws NumberFormatException {

        Scanner s = new Scanner(System.in);
        System.out.println("\n\nSeja bem vindo ao meu programa CRUD");
        System.out.println("Escolha a opcão desejada");
        System.out.println("1 - Criar Pessoa");
        System.out.println("2 - Listar Pessoas");
        System.out.println("3 - Alterar pessoa pelo id");
        System.out.println("4 - Excluir pessoa pelo id");
        System.out.println("5 - Sair do programa");
        System.out.print("Qual Sua opção ? R: ");
        return Integer.parseInt(s.nextLine());

    }

    public static void main(String[] args) {

        new Programa2();
    }

    

    private Pessoa criaPessoa() {
        Pessoa p = new Pessoa();
        System.out.println("Nome:");
        String nome = s.nextLine();

        System.out.println("SIAPE:");
        long siape = Long.parseLong(s.nextLine());

        p.setNome(nome);
        p.setSIAPE(siape);

        return p;
    }

}
