/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcempregado;

/**
 *
 * @author EDYA
 */
public class Empresa {

    String cnpj;
    Funcionario empregados[] = new Funcionario[10];
    int contador = 0;

    String adiciona(Funcionario f) {
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] == null) {
                empregados[i] = f;
                return "Inserido com sucesso";
            }
        }
        return "Não inserido";

    }

    Funcionario buscaPorNome(String nome) {
        for (int i = 0; i < empregados.length; i++) {
            Funcionario empregado = empregados[i];
            if (empregado != null) {
                if (empregado.nome.equals(nome)) {
                    return empregado;
                }
            }

        }
        return null;
    }

    boolean remove(String nome) {
        boolean temPessoa = false;
        for (int i = 0; i < empregados.length; i++) {
            Funcionario empregado = empregados[i];
            if (empregado != null) {
                if (empregado.nome.equals(nome)) {
                    empregados[i] = null;
                    temPessoa = true;

                }
            }

        }
        if (temPessoa) {
            return true;

        }

        return false;
    }
/*
    void adiciona(Funcionario f) {
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] == null) {
                empregados[i] = f;
                break;
            }

        }
    }
*/
    //Como fazer para resolver o problema do array cheio ?
    //Como remover uma pessoa?
    //Como inserir uma pessoa após array cheio, remoção e inserção?

    boolean contem(Funcionario f) {
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] != null
                    && empregados[i].nome.equals(f.nome)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public String toString() {
        String aux = "Cnpj " + cnpj;
        for (int i = 0; i < empregados.length; i++) {
            Funcionario empregado = empregados[i];
            if (empregado != null) {
                aux += empregado.toString() + "\n";
            }
        }
        return aux;
                
    }
    
    
}
