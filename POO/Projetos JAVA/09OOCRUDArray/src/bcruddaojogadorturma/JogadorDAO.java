/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcruddaojogadorturma;

/**
 *
 * @author eduardoasilvestre
 */
public class JogadorDAO {

    private Jogador[] jogadores = new Jogador[5];

    public JogadorDAO() {
        Jogador j1 = new Jogador();
        j1.setNome("josephina");
        this.adiciona(j1);

        Jogador j2 = new Jogador();
        j2.setNome("jaspion");
        adiciona(j2);

        Jogador j3 = new Jogador();
        j3.setNome("jiraia");
        adiciona(j3);

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
    
    Jogador buscaPorId(long id) {
        for (Jogador j : jogadores) {
            if (j != null && j.getId() == id) {
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
