/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipacoteabstrato;

/**
 *
 * @author eduardoasilvestre
 */
public class Trapezio extends FiguraGeometrica {
    private double ladoMaior;
    private double ladoMenor;
    private double altura;
    
    public Trapezio(double ladoMaior,     double ladoMenor,     double altura) {
        this.ladoMaior = ladoMaior;
        this.ladoMenor = ladoMenor;
        this.altura = altura;
    }
    
    
    
    @Override
    public double calculaArea() {
       return (ladoMaior + ladoMenor) * altura/2;
    }
    
}
