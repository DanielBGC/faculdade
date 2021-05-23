/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdfoundation;

import java.math.BigDecimal;

/**
 *
 * @author EDYA
 */
public class DMyAppBigDecimal {
    //BigDecimal is immutable (coloque resultado em uma variável ou imprima direto)
    //BigDecimal is immutable (coloque resultado em uma variável ou imprima direto)

    public static void main(String[] args) {
        BigDecimal big1 = new BigDecimal("0.1");
        BigDecimal big2 = new BigDecimal("0.2");
        BigDecimal bigResult = big1.add(big2);
        System.out.println(big1.toString());
        System.out.println(bigResult.toString());

    }

}
