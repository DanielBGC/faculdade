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
public class FigurasGeometricas {
    double areaTotal = 0;
    public void registra(AreaCalculavel a) {
        areaTotal += a.calculaArea();
    }
    
    public double getAreaTotal() {
        return areaTotal;
    }
}
