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
public class TrianguloDoEduardo extends  FiguraGeometrica{
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
           
    @Override
    public double calculaArea() {    
        System.out.println("calculando a area do triangulo do "+ this.getNome());
            return ((base * altura)/ 3);
    }
    
}
