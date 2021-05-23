/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcruddao3;

import java.util.Objects;

/**
 *
 * @author eduardoasilvestre
 */
public class Pessoa {
    private long id;
    private String nome;
    private long SIAPE;
    private String login;
    private String senha;
    private static long serial;
    private double nota;

    public static long getSerial() {
        return serial;
    }

    public static void setSerial(long serial) {
        Pessoa.serial = serial;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
    public Pessoa() {
        id = ++Pessoa.serial;
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

    public long getSIAPE() {
        return SIAPE;
    }

    public void setSIAPE(long SIAPE) {
        this.SIAPE = SIAPE;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Este é o professor(a) + " + nome;
    }
}
