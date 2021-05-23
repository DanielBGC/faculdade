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
public class JogadorTurma {
    private static long serial;
    private long id;
    private Turma turma;
    private Jogador jogador;
    
    public JogadorTurma() {
        
        id = ++JogadorTurma.serial;
    }

    public static long getSerial() {
        return serial;
    }

    public static void setSerial(long serial) {
        JogadorTurma.serial = serial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    @Override
    public String toString() {
        return "JogadorTurma{" + "id=" + id + ", turma=" + turma + ", jogador=" + jogador + '}';
    }
    
    
    
}
