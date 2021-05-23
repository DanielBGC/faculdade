/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap4ex7;

/**
 *
 * @author eduardoasilvestre
 */
public class PessoaDAORAM {

    private Pessoa[] pessoas = new Pessoa[5];

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    
    Pessoa buscarPrimeiraPessoa(String nome) {
        return null;
    }

    public PessoaDAORAM() {
        Pessoa p1 = new Pessoa();
        p1.setNome("eduardo");

        Pessoa p2 = new Pessoa();
        p2.setNome("maria");
        
        this.inserirPessoa(p1);
        this.inserirPessoa(p2);

    }

    public boolean inserirPessoa(Pessoa p) {
        int posicaoLivre = proximaPosicaoLivre();
        if (posicaoLivre != -1) {
            pessoas[posicaoLivre] = p;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarPessoas() {
        if (this.ehVazio()) {
            System.out.println("array vazio");
        } else {
            for (Pessoa pessoa : pessoas) {
                if (pessoa != null) {
                    System.out.println(pessoa);
                }
            }
        }
    }

    public Pessoa buscarPorNome(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null
                    && pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }

    public boolean ehVazio() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                return false;
            }
        }
        return true;
    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean alterarPessoa(long id, String novoNome) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null
                    && pessoas[i].getId() == id) {
                pessoas[i].setNome(novoNome);
                return true;
            }
        }
        return false;
    }

    public boolean excluirPessoa(long id) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null
                    && pessoas[i].getId() == id) {
                pessoas[i] = null;
                return true;
            }
        }
        return false;
    }
}
