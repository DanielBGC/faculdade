/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap5ex1v2;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class Empresa {

    String nomeFantasia;
    String ramo;
    String cnpj;
    Funcionario[] funcionarios = new Funcionario[2];

    @Override
    public String toString() {
        String msg = "Empresa " + this.nomeFantasia;
        msg += "\nOs funcionários da empresa são:";
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                msg += "\n" + funcionario.toString();
            }
        }
        return msg;
    }

    boolean remove(Funcionario f) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null
                    && funcionarios[i].nome.equals(f.nome)) {
                funcionarios[i] = null;
                return true;
            }

        }
        return false;

    }

    boolean adiciona(Funcionario f) {
        int posicaoLivre = this.proximaPosicaoLivre();
        if (posicaoLivre != -1) {
            funcionarios[posicaoLivre] = f;
            return true;
        } else {
            return false;
        }
    }

    int proximaPosicaoLivre() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                return i;
            }

        }
        return -1;
    }

}
