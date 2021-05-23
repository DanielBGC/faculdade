/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdrounding;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class BMathContextTest1 {
   public static void main(String[] args) {
        System.out.println(new BigDecimal("354.765", new MathContext(2, RoundingMode.CEILING)));
        System.out.println(new BigDecimal("354.765", new MathContext(2, RoundingMode.DOWN)));
        System.out.println(new BigDecimal("354.765", new MathContext(1, RoundingMode.FLOOR)));
        System.out.println(new BigDecimal("354.765", new MathContext(3, RoundingMode.HALF_EVEN)));
        System.out.println(new BigDecimal("354.765", new MathContext(3, RoundingMode.HALF_UP)));
        System.out.println(new BigDecimal("354.765", new MathContext(1, RoundingMode.UP)));
    }  
}
