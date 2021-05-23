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
public class Turma {
    private static long serial;
    private long id;
    private String nome;
    private Jogador jogador;
    
    public Turma() {
        
        id = ++Turma.serial;
    }

    public static long getSerial() {
        return serial;
    }

    public static void setSerial(long serial) {
        Turma.serial = serial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", nome=" + nome + ", jogador=" + jogador + '}';
    }
    
    
    
    
}
