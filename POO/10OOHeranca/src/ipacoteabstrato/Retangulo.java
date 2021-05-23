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
public class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    Retangulo(double i, double i0) {
        altura = i;
        base = i0;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }
    
    
}
