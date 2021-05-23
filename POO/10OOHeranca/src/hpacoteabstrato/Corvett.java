/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hpacoteabstrato;

/**
 *
 * @author EDYA
 */
public class Corvett extends Carro{

    @Override
    public double getValorAgregado() {
        System.out.println("Executando " + this.getClass());
       return (getValor() + getAno() + 1000);
    }
    
}
