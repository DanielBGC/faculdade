/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdfoundation;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author EDYA
 */
public class HMyAppBigDecimal {

    public static void main(String[] args) {
        /*
        este não faz nenhum tipo de arredondamento por si próprio, ou seja,
        você precisa especificar como deseja arredondar determinado valor se
        for necessário
         */
        System.out.println("Divide");
        System.out.println(new BigDecimal("1.00").divide(new BigDecimal("1.3"), 3, RoundingMode.UP));
        
        System.out.println("");
        
        System.out.println("Divide");
        MathContext context = new MathContext(3, RoundingMode.UP);
        System.out.println(new BigDecimal("1.00").divide(new BigDecimal("1.3"), context));

    }
}
