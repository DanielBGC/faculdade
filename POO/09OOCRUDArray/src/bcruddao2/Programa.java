/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcruddao2;

import java.util.Scanner;

/**
 *
 * @author eduardoasilvestre
 */
public class Programa {

    Jogador[] jogadores = new Jogador[5];
    /*
    Usuario[] turmas = new Usuario[5];
    Quadra[] turmas = new Quadra[5];
    Turma[] turmas = new Turma[5];
    JogadorTurma[] jogadorTurma = new JogadorTurma[5];
    Horario[] turmas = new Horario[5];
    JogadorConfirmacao[] turmas = new JogadorConfirmacao[5];
    EstatisticasDoJogo[] turmas = new EstatisticasDoJogo[5];
    */
    Scanner s = new Scanner(System.in);

    public Programa() {

        int opcaoUsuario;
        do {

            opcaoUsuario = pegaOpcaoUsuario();
            switch (opcaoUsuario) {
                case 1:
                    Jogador j = criaJogador();

                    boolean jogadorFoiInserido = adiciona(j);
                    if (jogadorFoiInserido) {
                        System.out.println("jogador inserido com sucesso");
                    } else {
                        System.out.println("jogador nao inserido");

                    }

                    break;
                case 2:
                    mostrarTodos();
                    break;
                case 3:
                    System.out.println("Jogador procurado:");
                    String procurado = s.nextLine();
                    System.out.println("Novo nome:");
                    String novoNome = s.nextLine();
                    if (alterarNome(procurado, novoNome)) {
                        System.out.println("jogador alterado");
                    } else {
                        System.out.println("jogador não encontrado");
                    }

                    break;
                case 4:
                    System.out.println("Jogador procurado:");
                    String nomeExclusao = s.nextLine();

                    if (remover(nomeExclusao)) {
                        System.out.println("jogador excluído");
                    } else {
                        System.out.println("jogador não excluído");
                    }

                    break;
                case 5:
                    System.out.println("5");

                    break;

                default:
                    System.out.println("sair");

                    break;

            }
        } while (opcaoUsuario != 5);

    }

    private Jogador criaJogador() {
        Jogador j = new Jogador();
        System.out.println("CPF: ");
        String CPF = s.nextLine();
        j.setCPF(CPF);
        System.out.println("Nome: ");
        String nome = s.nextLine();
        j.setNome(nome);
        return j;
    }

    private int pegaOpcaoUsuario() {

        System.out.println("1 cadastrar");
        System.out.println("2 mostrar todos");
        System.out.println("3 alterar o nome do jogador");
        System.out.println("4 excluir pelo id");
        System.out.println("5 sair");
        System.out.print("Qual sua opcao ?R: ");
        return Integer.parseInt(s.nextLine());

    }

    public static void main(String[] args) {
        new Programa();
    }

    boolean adiciona(Jogador j) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            jogadores[proximaPosicaoLivre] = j;
            return true;
        } else {
            return false;
        }

    }

    public boolean ehVazio() {
        for (Jogador jogadore : jogadores) {
            if (jogadore != null) {
                return false;
            }
        }
        return true;

    }

    public void mostrarTodos() {
        boolean temJogador = false;
        for (Jogador j : jogadores) {
            if (j != null) {
                System.out.println(j);
                temJogador = true;
            }
        }
        if (!temJogador) {
            System.out.println("não existe jogador cadastrado");
        }
    }

    public boolean alterarNome(String nome, String novoNome) {
        for (Jogador jogadore : jogadores) {
            if (jogadore != null && jogadore.getNome().equals(nome)) {
                jogadore.setNome(novoNome);
                return true;
            }
        }
        return false;

    }

    Jogador buscaPorNome(String nome) {
        for (Jogador j : jogadores) {
            if (j != null && j.getNome().equals(nome)) {
                return j;
            }
        }
        return null;

    }

    public boolean remover(String nome) {
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null && jogadores[i].getNome().equals(nome)) {
                jogadores[i] = null;
                return true;
            }
        }
        return false;

    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] == null) {
                return i;
            }

        }
        return -1;

    }

}
