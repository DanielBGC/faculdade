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
public class Programa {

    Scanner s = new Scanner(System.in);
    Pessoa[] pessoas = new Pessoa[5];
    //Aluno[] pessoas = new Aluno[5];
    //Avaliador[] pessoas = new Avaliador[5];
    //Trabalho[] pessoas = new Trabalho[5];
    //Evento[] pessoas = new Evento[5];
    //Avaliacao[] pessoas = new Avaliacao[5];

    public Programa() {
        int opcao;
        do {
            opcao = pegaOpcaoUsuario();

            switch (opcao) {
                case 1:
                    Pessoa p = criaPessoa();

                    if (adiciona(p)) {
                        System.out.println("Pessoa inserida com sucesso.");
                    } else {
                        System.out.println("Array cheio");
                    }
                    break;
                case 2:
                    mostra();
                    break;

                case 3:
                    System.out.println("Digite o nome atual:");
                    String nomeAtual = s.nextLine();
                    
                    System.out.println("Digite o novo nome:");
                    String novoNome = s.nextLine();
                    
                   
                    if ( altera(nomeAtual, novoNome)) {
                        System.out.println("individuo alterado");
                    } else {
                        System.out.println("nao alterado");
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome exclusao:");
                    String nomeExclusao = s.nextLine();
                    
                    if (exclui(nomeExclusao)) {
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

        new Programa();
    }

    int proximaPosicaoLivre() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                return i;
            }
        }
        return -1;
    }
    public Pessoa buscaPorNome(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }

    public boolean adiciona(Pessoa p) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre == - 1) {
            return false;
        } else {
            pessoas[proximaPosicaoLivre] = p;
            return true;
        }
    }

    public void mostra() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa.toString());
            }
        }
    }

    public boolean exclui(String nomeExclusao) {
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = pessoas[i];
            if (pessoa != null && pessoa.getNome().equals(nomeExclusao)) {
                pessoas[i] = null;
                return true;
            }

        }
        return false;

    }

    public boolean altera(String nomeAlteracao, String novoNome) {
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = pessoas[i];
            if (pessoa != null && pessoa.getNome().equals(nomeAlteracao)) {
                pessoa.setNome(novoNome);
                return true;
            }

        }
        return false;

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
