/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bempregadodafaculdade;

import java.time.LocalDate;

/**
 *
 * @author eduardoasilvestre
 */
public class Terceirizado extends EmpregadoDaFaculdade{
    private String empresa;
    private LocalDate dataInicio;

    @Override
    String getInfo() {
        return super.getInfo() + " | a empresa terceirizada e : " + this.empresa;
    }

    @Override
    double getGastos() {
        return super.getGastos(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
