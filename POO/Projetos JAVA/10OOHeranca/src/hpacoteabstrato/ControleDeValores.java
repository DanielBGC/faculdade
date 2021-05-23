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
public class ControleDeValores {
    
    private double totalValorCarros = 0;

    public void registra(Carro carro) {
        this.totalValorCarros += carro.getValorAgregado();
    }

    public double getValorTotal() {
        return this.totalValorCarros;
    }
}
