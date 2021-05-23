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
public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {

    int horasDeAula;

    @Override
    double getGastos() {
        return this.getSalario() + this.horasDeAula * 10;
    }

    @Override
    String getInfo() {
        String informacaoBasica = super.getInfo();
        String informacao = informacaoBasica + " horas de aula: "
                + this.horasDeAula;
        return informacao;
    }
// métodos de get, set e outros que forem necessários
}
