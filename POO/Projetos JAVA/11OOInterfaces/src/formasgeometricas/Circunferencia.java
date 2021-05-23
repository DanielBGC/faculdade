/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formasgeometricas;

/**
 *
 * @author EDYA
 */
public class Circunferencia implements AreaCalculavel {
    public double raio;
    public double pi = Math.PI;
    
    public Circunferencia(double raio) {
        this.raio = raio;
    
    }
    

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public double calculaArea() {
       return pi * Math.pow(raio, 2);
    }
    
    
    
}
