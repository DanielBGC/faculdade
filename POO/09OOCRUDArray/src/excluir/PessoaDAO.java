/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excluir;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author eduardoasilvestre
 */
public class PessoaDAO {
    private Pessoa pessoas[] = new Pessoa[5];
    
    public void mostrarPessoas() {
        System.out.println("Imprimindo as possíveis pessoas:");

        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa);
            }
        }
    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = pessoas[i];
            if (pessoa == null) {
                return i;
            }
            
            /*
                if (pessoas[i] == null) {
                return i;
            }
            */
        }
        return -1;
    }

    public boolean exclui(long idASerExcluido) {
        for (int i = 0; i < pessoas.length; i++) {

            if (pessoas[i].getId() == idASerExcluido) {
                pessoas[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean altera(long idASerAlterado, String novoNome) {
        for (int i = 0; i < pessoas.length; i++) {

            if (pessoas[i].getId() == idASerAlterado) {
                pessoas[i].setNome(novoNome);
                return true;
            }
        }
        return false;

    }
    
    public boolean inserir(Pessoa pessoa ) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            pessoas[proximaPosicaoLivre] = pessoa;
            return true;
        } else {
            return false;
        }
    
    }

    public Pessoa[] buscaPessoasPorSalario(BigDecimal parametro) {
        int quantidadeDePessoas = 0;
        for (int j = 0; j < pessoas.length; j++) {
            Pessoa pessoa = pessoas[j];
            if (pessoa.getSalario().compareTo(parametro) > 0) {
                quantidadeDePessoas++;
            }
        }
        if (quantidadeDePessoas == 0) {
            return null;
        } else {
            Pessoa[] pessoasSalarioMaior = new Pessoa[quantidadeDePessoas];

            int contadorNovo = 0;
            for (int j = 0; j < pessoas.length; j++) {
                Pessoa pessoa = pessoas[j];
                if (pessoa.getSalario().compareTo(parametro) > 0) {
                    pessoasSalarioMaior[contadorNovo++] = pessoa;
                }
            }
            return pessoasSalarioMaior;

        }
    }
}
