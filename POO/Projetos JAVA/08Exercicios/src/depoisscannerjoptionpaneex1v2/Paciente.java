/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisscannerjoptionpaneex1v2;

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
        return "O nome do paciente e " + nome;
    }

    
    
    double calculaIMC() {
        return peso / (altura * altura);
    }
    
    
    
    
}
