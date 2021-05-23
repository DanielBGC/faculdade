/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcruddao3;

/**
 *
 * @author eduardoasilvestre
 */
public class PessoaDAORAM {
    Pessoa[] pessoas = null;
    
    public PessoaDAORAM() {
        pessoas = new Pessoa[5];
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Bruno");
        this.adiciona(p1);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Mara");
        this.adiciona(p2);
        
    }
    
    int proximaPosicaoLivre() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    Pessoa [] buscaNotasPorParametro(double parametro) {
        int contador =0;
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = pessoas[i];
            if (pessoa != null && pessoa.getNota() >= parametro) {
                contador++;
            }
            
        }
        Pessoa [] pessoasRetorno = null;
        if (contador == 0) {
            return pessoasRetorno;
        }
        pessoasRetorno = new Pessoa[contador];
        
        
           return null; 
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
}
