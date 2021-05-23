/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excluir;

/**
 *
 * @author eduardoasilvestre
 */
public class Paciente {
    String nome;
    double altura;
    double peso;

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Peso: " + this.peso;
    }
    
    double calculaImc() {
        return (peso / Math.pow(altura, 2));
    }
    
    
    void exibirPaciente() {
        System.out.println("");
                
    }
    String retornaPaciente() {
        return "";
    }
}
