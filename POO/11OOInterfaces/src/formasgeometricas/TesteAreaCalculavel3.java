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
public class TesteAreaCalculavel3 {
    public static void main(String[] args) {
        //CALCULAR A ÁREA DE DIVERSAS FIGURAS GEOMÉTRICAS
        FigurasGeometricas fg = new FigurasGeometricas();
        
        AreaCalculavel quadrado = new Quadrado(10);
        AreaCalculavel retangulo = new Retangulo(10,20);
        AreaCalculavel trapezio = new Trapezio(10, 20, 8);
        AreaCalculavel circunferencia = new Circunferencia(10);
        
        fg.registra(quadrado);
        fg.registra(retangulo);
        fg.registra(trapezio);
        fg.registra(circunferencia);
        System.out.println("AREA TOTAL DA FIGURA: " + fg.getAreaTotal());
        
        
		
		
    }
}
