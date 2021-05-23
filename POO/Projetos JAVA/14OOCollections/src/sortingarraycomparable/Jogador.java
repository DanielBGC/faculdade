/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingarraycomparable;

import java.util.Objects;

/**
 *
 * @author EDYA
 */
public class Jogador implements Comparable<Jogador> {

    private String nome;
    private int gols;

    public Jogador(String nome, int gols) {
        this.nome = nome;
        this.gols = gols;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "O jogador " + nome + " tem " + gols + " gols!";
    }

    @Override
    public int compareTo(Jogador t) {
        if (this.getGols() < t.getGols()) {
            return 1;
        }
        if (this.getGols() > t.getGols()) {
            return -1;
        }
        return 0;
    }
}
