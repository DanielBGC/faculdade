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
public class Programa2 {

    JogadorDAO jogadorDAO = new JogadorDAO();
    TurmaDAO turmaDAO =  new TurmaDAO();
    JogadorTurmaDAO jogadorTurmaDAO = new JogadorTurmaDAO();
    GUI gui = new GUI();
  
  Scanner s = new Scanner(System.in);
    public Programa2() {

        int opcaoUsuario;
        do {

            opcaoUsuario = gui.pegaOpcaoUsuario();
            switch (opcaoUsuario) {
                case 1:
                    Jogador j = gui.criaJogador();

                    boolean jogadorFoiInserido = jogadorDAO.adiciona(j);
                    if (jogadorFoiInserido) {
                        System.out.println("jogador inserido com sucesso");
                    } else {
                        System.out.println("jogador nao inserido");

                    }

                    break;
                case 2:
                    jogadorDAO.mostrarTodos();
                    break;
                case 3:
                    System.out.println("Jogador procurado:");
                    String procurado = s.nextLine();
                    System.out.println("Novo nome:");
                    String novoNome = s.nextLine();
                    if (jogadorDAO.alterarNome(procurado, novoNome)) {
                        System.out.println("jogador alterado");
                    } else {
                        System.out.println("jogador não encontrado");
                    }

                    break;
                case 4:
                    System.out.println("Jogador procurado:");
                    String nomeExclusao = s.nextLine();

                    if (jogadorDAO.remover(nomeExclusao)) {
                        System.out.println("jogador excluído");
                    } else {
                        System.out.println("jogador não excluído");
                    }

                    break;
                case 5:
                    System.out.println("sair");
                    System.out.println("5");

                    break;
                    
                    case 6:
                    Turma t = gui.criaTurma(jogadorDAO);

                    boolean turmaFoiInserido = turmaDAO.adiciona(t);
                    if (turmaFoiInserido) {
                        System.out.println("turma inserido com sucesso");
                    } else {
                        System.out.println("turma nao inserido");

                    }

                    break;
                case 7:
                    turmaDAO.mostrarTodos();
                    break;
                case 8:
                    /*
                    System.out.println("Jogador procurado:");
                    String procurado = s.nextLine();
                    System.out.println("Novo nome:");
                    String novoNome = s.nextLine();
                    if (jogadorDAO.alterarNome(procurado, novoNome)) {
                        System.out.println("jogador alterado");
                    } else {
                        System.out.println("jogador não encontrado");
                    }*/

                    break;
                case 9:
                    /*
                    System.out.println("Jogador procurado:");
                    String nomeExclusao = s.nextLine();

                    if (jogadorDAO.remover(nomeExclusao)) {
                        System.out.println("jogador excluído");
                    } else {
                        System.out.println("jogador não excluído");
                    }*/

                    break;
                    case 10:
                        System.out.println("mostre as turmas:");
                        
                        turmaDAO.mostrarTodos();
                        System.out.println("Qual turma deseja gerenciar");
                        long idTurma = Long.parseLong(s.nextLine());
                        
                        Turma turma = turmaDAO.buscaPorId(idTurma);
                        System.out.println("mostre os jogadores:");
                        
                        jogadorDAO.mostrarTodos();
                        System.out.println("Qual jogador quer inserir");
                        
                        long idJogador = Long.parseLong(s.nextLine());
                        Jogador jogadorTurma = jogadorDAO.buscaPorId(idJogador);
                        
                        JogadorTurma jogadorTurma1 = new JogadorTurma();
                        jogadorTurma1.setTurma(turma);
                        jogadorTurma1.setJogador(jogadorTurma);
                        
                        
                        jogadorTurmaDAO.adiciona(jogadorTurma1);
                        
                        
                        break;
     
                    case 11:
                        //jogadorTurmaDAO.mostrarTodos();
                        
                        turmaDAO.mostrarTodos();
                        System.out.println("qual turma quer mostrar os jogadores");
                         long idTurmaMostrar = Long.parseLong(s.nextLine());
                        jogadorTurmaDAO.mostraJogadoresDaTurma(idTurmaMostrar);
                        
                    break;
                default:
                    System.out.println("sair");

                    break;

            }
        } while (opcaoUsuario != 5);

    }

    

    public static void main(String[] args) {
        new Programa2();
    }



}
