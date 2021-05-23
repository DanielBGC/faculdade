/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbdformatting;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class DFormatting {

    public static void main(String[] args) {
        BigDecimal d = new BigDecimal("1115.32");
        BigDecimal days = new BigDecimal("30");
        BigDecimal d2 = d.divide(days, 2, BigDecimal.ROUND_HALF_UP);

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        double money = d2.doubleValue();
        String s = n.format(money);

        System.out.println(s);
    }
}
