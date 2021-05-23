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
 * @author Ernani
 */
public class BFormatting {
    public static void main(String[] args) {
      BigDecimal d = new BigDecimal("1115.32");
      BigDecimal taxRate = new BigDecimal("0.0049");
      BigDecimal d2 = d.multiply(taxRate);
      System.out.println("Unformatted: " + d2.toString()); 
      NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US); 
      double money = d2.doubleValue();
      String s = n.format(money);
      System.out.println("Formatted:  " + s);
   }
}
