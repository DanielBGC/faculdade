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
public class Pessoa {
    private long id;
    private static long serial;
    private String nome;
    private BigDecimal salario;
    
    public Pessoa() {
        
        this.id = ++Pessoa.serial;
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

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nome);
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
        return "Este(a) é o(a) " + this.nome;
    }

    
    
    
}
