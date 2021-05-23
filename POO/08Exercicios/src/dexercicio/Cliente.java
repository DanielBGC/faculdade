/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dexercicio;

/**
 *
 * @author EDYA
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    Cliente() {

    }
    
    Cliente(String nome) {
        this.nome = nome;
    
    }
    
    Cliente(String nome, String sobreNome) {
        this.nome = nome;
        this.sobrenome = sobreNome;
    
    }

    Cliente(String nome,String sobrenome, String cpf) {
        this(nome);
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    
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
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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
    
    
    
}
