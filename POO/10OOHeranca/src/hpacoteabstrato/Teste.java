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
public class Teste {
    public static void main(String[] args) {
        ControleDeValores controleDeValores = new ControleDeValores();

        Corvett corvett = new Corvett();
        corvett.setAno(2000);
        corvett.setValor(3000);
        
        Amarok amarok = new Amarok();
        amarok.setAno(2007);
        amarok.setValor(2000);
        
        
        
        controleDeValores.registra(corvett);
        controleDeValores.registra(amarok);
    
        System.out.println("Total de valores: " + controleDeValores.getValorTotal());
    }
}
