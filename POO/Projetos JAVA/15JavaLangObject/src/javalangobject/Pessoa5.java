/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalangobject;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author EDYA
 */
public class Pessoa5{
    static long contadorPessoas;
    
    private long id;    
    private String nome;
    private String cpf;
    private int idade;
    private BigDecimal salario;
    private char sexo;
    
    
    public Pessoa5() {
        id = ++Pessoa.contadorPessoas;
    }
 
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the salario
     */
    public BigDecimal getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    /*
    @Override
    public String toString() {
        return "Pessoa{Id" + contadorPessoas + " + nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", salario=" + salario + ", sexo=" + sexo + '}';
    }*/
    
    @Override
    public String toString() {
        return "Meu nome e " + this.nome + " e minha idade e " + this.idade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + this.idade;
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
        final Pessoa5 other = (Pessoa5) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.idade != other.idade) {
            return false;
        }
        return true;
    }







}
