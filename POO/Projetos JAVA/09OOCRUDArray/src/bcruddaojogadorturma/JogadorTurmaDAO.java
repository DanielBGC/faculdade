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
public class JogadorTurmaDAO {
      
    private JogadorTurma[] jogadoresTurmas = new JogadorTurma[5];

    public JogadorTurmaDAO() {
        JogadorTurma j1 = new JogadorTurma();
        //j1.setNome("josephina");
        this.adiciona(j1);

        JogadorTurma j2 = new JogadorTurma();
        //j2.setNome("jaspion");
        adiciona(j2);

        JogadorTurma j3 = new JogadorTurma();
        //j3.setNome("jiraia");
        adiciona(j3);
    }

    boolean adiciona(JogadorTurma j) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            jogadoresTurmas[proximaPosicaoLivre] = j;
            return true;
        } else {
            return false;
        }

    }

    public boolean ehVazio() {
        for (JogadorTurma jogadore : jogadoresTurmas) {
            if (jogadore != null) {
                return false;
            }
        }
        return true;

    }

    public void mostrarTodos() {
        boolean temJogadorTurma = false;
        for (JogadorTurma j : jogadoresTurmas) {
            if (j != null) {
                System.out.println(j);
                temJogadorTurma = true;
            }
        }
        if (!temJogadorTurma) {
            System.out.println("não existe turma cadastrado");
        }
    }

    public boolean alterarNome(String nome, String novoNome) {
       /*
        for (JogadorTurma jogadore : jogadoresTurmas) {
            if (jogadore != null && jogadore.getNome().equals(nome)) {
                jogadore.setNome(novoNome);
                return true;
            }
        }
        */
        return false;

    }

    JogadorTurma buscaPorNome(String nome) {
       /* for (JogadorTurma j : jogadoresTurmas) {
            if (j != null && j.getNome().equals(nome)) {
                return j;
            }
        }
*/
        return null;

    }

    public boolean remover(String nome) {
        /*
        for (int i = 0; i < jogadoresTurmas.length; i++) {
            if (jogadoresTurmas[i] != null && jogadoresTurmas[i].getNome().equals(nome)) {
                jogadoresTurmas[i] = null;
                return true;
            }
        }*/
        return false;

    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < jogadoresTurmas.length; i++) {
            if (jogadoresTurmas[i] == null) {
                return i;
            }

        }
        return -1;

    } 

    void mostraJogadoresDaTurma(long idTurmaMostrar) {
        String resposta = "";
        for (JogadorTurma jogadoresTurma : jogadoresTurmas) {
            if (jogadoresTurma != null && jogadoresTurma.getTurma().getId() == idTurmaMostrar) {
                resposta += jogadoresTurma.getJogador().toString();
            }
            
        }
    }
}
