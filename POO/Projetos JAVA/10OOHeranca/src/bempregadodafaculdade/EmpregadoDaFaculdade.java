/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bempregadodafaculdade;

/**
 *
 * @author EDYA
 */
public class EmpregadoDaFaculdade {

    private String nome;
    private double salario;

    double getGastos() {
        return this.getSalario();
    }

    String getInfo() {
        return "Nome: " + this.getNome() + " | Salário " + this.getSalario();
    }
    
    
    // métodos de get, set e outros

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
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
