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
public class Jogador {
    private static long serial;
    private long id;
    private String nome;

    public Jogador() {
        
        id = ++Jogador.serial;
    }
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Jogador{" + "id=" + id + ", nome=" + nome + '}';
    }
    

}
