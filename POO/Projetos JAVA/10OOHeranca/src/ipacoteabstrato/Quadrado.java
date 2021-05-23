/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipacoteabstrato;

/**
 *
 * @author EDYA
 */
public class Quadrado extends FiguraGeometrica {
    private double lado;

    Quadrado(double i) {
        lado = i;
    }

    @Override
    public double calculaArea() {
     return lado *lado;   
    }
    
    
}
