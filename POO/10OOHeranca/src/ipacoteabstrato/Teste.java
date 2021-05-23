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
public class Teste {
    public static void main(String[] args) {
        GeradorRelatorio geradorRelatorio = new GeradorRelatorio();
         //FiguraGeometrica fg = new FiguraGeometrica();
        
        Triangulo triangulo = new Triangulo(10, 20);
        
        Quadrado quadrado  = new Quadrado(10);
        
        Retangulo retangulo = new Retangulo(10, 20);
        
        geradorRelatorio.registraFigura(quadrado);
        geradorRelatorio.registraFigura(triangulo);
        geradorRelatorio.registraFigura(retangulo);
        
        Trapezio trapezio = new Trapezio(20, 10, 7);
        //geradorRelatorio.registraFigura(trapezio);
        
        TrianguloDoEduardo doEduardo = new TrianguloDoEduardo();
        doEduardo.setBase(10);
        doEduardo.setAltura(20);
        doEduardo.setNome("eduardo");
        geradorRelatorio.registraFigura(doEduardo);
        
        System.out.println(geradorRelatorio.getTotalAreas());
                
    }
}
