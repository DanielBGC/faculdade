/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jherancacomposicao;

/**
 *
 * @author EDYA
 */
public class DPessoa {
    private String nome;
    private int idade;
    private double salario;
    private String cpf;
    
    public double getBOnificacao() {
        return this.salario * 0.10;
    }
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
