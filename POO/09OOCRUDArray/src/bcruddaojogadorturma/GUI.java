/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcruddaojogadorturma;

import java.util.Scanner;

/**
 *
 * @author eduardoasilvestre
 */
public class GUI {

    Scanner s = new Scanner(System.in);

    public Jogador criaJogador() {
        Jogador j = new Jogador();

        System.out.println("Nome: ");
        String nome = s.nextLine();
        j.setNome(nome);
        return j;
    }

    public Turma criaTurma(JogadorDAO jogadorDAO) {
        Turma t = new Turma();

        System.out.println("Nome: ");
        String nome = s.nextLine();
        t.setNome(nome);

        System.out.println("mostrando jogadores disponíveis");
        jogadorDAO.mostrarTodos();
        System.out.println("digite o id: ");
        long idLido = Long.parseLong(s.nextLine());

        Jogador jogadorTemp = jogadorDAO.buscaPorId(idLido);
        t.setJogador(jogadorTemp);
        return t;
    }

    public int pegaOpcaoUsuario() {

        System.out.println("1 cadastrar JOGADOR");
        System.out.println("2 mostrar todos  JOGADOR");
        System.out.println("3 alterar o nome do jogador  JOGADOR");
        System.out.println("4 excluir pelo id  JOGADOR");
        System.out.println("5 sair");
        System.out.println("6 cadastrar TURMA");
        System.out.println("7 mostrar todos  TURMA");
        System.out.println("8 alterar o nome do jogador  TURMA");
        System.out.println("9 excluir pelo id  TURMA");
        System.out.println("10 cadastrar jogador A TURMA");
        System.out.println("11 mostrar todos OS JOGADORES DE UMA TURMA");
        System.out.println("12 excluir JOGADOR DE UMA TURMA");

        System.out.print("Qual sua opcao ?R: ");
        return Integer.parseInt(s.nextLine());

    }
}
