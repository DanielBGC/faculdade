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
public class TestaAreaCalculavel2 {
    public static void recebeFiguraGeometrica(AreaCalculavel a) {
        double area = a.calculaArea();
        System.out.println("A área é:" + area);
    }
    public static void main(String[] args) {
        AreaCalculavel quadrado = new Quadrado(10);
        recebeFiguraGeometrica(quadrado);
		
        AreaCalculavel retangulo = new Retangulo(10,20);
	recebeFiguraGeometrica(retangulo);
        
        Circunferencia circunferencia = new Circunferencia(10);
        recebeFiguraGeometrica(circunferencia);
    }
}
