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
public class Triangulo extends FiguraGeometrica {

    private double altura;
    private double base;

    Triangulo(double i, double i0) {
        altura = i;
        base = i0;
    }

    @Override
    public double calculaArea() {

        return (base * altura) / 2;
    }

}
