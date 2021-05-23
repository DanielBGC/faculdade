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
public class TurmaDAO {
    
    private Turma[] turmas = new Turma[5];

    public TurmaDAO() {
        Turma j1 = new Turma();
        j1.setNome("os ze ruelas");
        this.adiciona(j1);

        Turma j2 = new Turma();
        j2.setNome("os mais zé ruelas");
        adiciona(j2);

        Turma j3 = new Turma();
        j3.setNome("os 3x zé ruelas");
        adiciona(j3);

    }

    boolean adiciona(Turma j) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            turmas[proximaPosicaoLivre] = j;
            return true;
        } else {
            return false;
        }

    }

    public boolean ehVazio() {
        for (Turma jogadore : turmas) {
            if (jogadore != null) {
                return false;
            }
        }
        return true;

    }
    
    Turma buscaPorId(long id) {
        for (Turma j : turmas) {
            if (j != null && j.getId() == id) {
                return j;
            }
        }
        return null;

    }

    public void mostrarTodos() {
        boolean temTurma = false;
        for (Turma j : turmas) {
            if (j != null) {
                System.out.println(j);
                temTurma = true;
            }
        }
        if (!temTurma) {
            System.out.println("não existe turma cadastrado");
        }
    }

    public boolean alterarNome(String nome, String novoNome) {
        for (Turma jogadore : turmas) {
            if (jogadore != null && jogadore.getNome().equals(nome)) {
                jogadore.setNome(novoNome);
                return true;
            }
        }
        return false;

    }

    Turma buscaPorNome(String nome) {
        for (Turma j : turmas) {
            if (j != null && j.getNome().equals(nome)) {
                return j;
            }
        }
        return null;

    }

    public boolean remover(String nome) {
        for (int i = 0; i < turmas.length; i++) {
            if (turmas[i] != null && turmas[i].getNome().equals(nome)) {
                turmas[i] = null;
                return true;
            }
        }
        return false;

    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < turmas.length; i++) {
            if (turmas[i] == null) {
                return i;
            }

        }
        return -1;

    }
}
