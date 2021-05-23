/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src1;

/**
 *
 * @author EDYA
 */
public class ICarroTesteFabrica {
    public static void main(String args[]) {
    
        ICarro c = new ICarro();
        c.cor = "Vermelho";
        c.modelo = "Fusca";
        c.velocidadeAtual = 10;
        
        c.liga();
        
        c.acelera(10);
        System.out.println("Marcha atual é " + c.pegaMarcha());
        
        c.acelera(10);
        System.out.println("Marcha atual é " + c.pegaMarcha());
        
        c.acelera(10);
        System.out.println("Marcha atual é " + c.pegaMarcha());
        
        c.acelera(10);
        System.out.println("Marcha atual é " + c.pegaMarcha());
        
        c.acelera(10);
        System.out.println("Marcha atual é " + c.pegaMarcha());
        
        c.acelera(10);
        System.out.println("Marcha atual é " + c.pegaMarcha());

    
    }
}
