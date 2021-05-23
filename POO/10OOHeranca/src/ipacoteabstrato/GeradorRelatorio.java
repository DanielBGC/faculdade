/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipacoteabstrato;

import ipacoteabstrato.FiguraGeometrica;

/**
 *
 * @author EDYA
 */
public class GeradorRelatorio {
    private double totalAreas;

    public double getTotalAreas() {
        return totalAreas;
    }

    public void registraFigura(FiguraGeometrica figura) {
        this.totalAreas += figura.calculaArea();
    
    }
    
    
}
