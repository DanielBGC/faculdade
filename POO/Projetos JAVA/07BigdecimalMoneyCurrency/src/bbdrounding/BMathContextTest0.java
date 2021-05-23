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
public class BMathContextTest0 {

    public static void main(String[] args) {
        MathContext mc = new MathContext(2, RoundingMode.CEILING);
        BigDecimal b = new BigDecimal("215.87", mc);
        System.out.println(b);
    }
}
