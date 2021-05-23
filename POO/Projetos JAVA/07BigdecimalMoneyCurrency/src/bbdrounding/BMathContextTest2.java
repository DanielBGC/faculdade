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
public class BMathContextTest2 {
   public static void main(String[] args) {
       // create 2 BigDecimal Objects
      BigDecimal bg1 = new BigDecimal("333.3454");

      MathContext mc = new MathContext(6); // 6 precision
      //MathContext mc = new MathContext(5); // 5 precision
      //MathContext mc = new MathContext(4); // 4 precision
      //MathContext mc = new MathContext(3); // 3 precision

      // perform plus on bg1 using mc
      BigDecimal bg2 = bg1.plus(mc);

      String str = "The Result of plus using context settings is " + bg2;

      // print the value of bg2
      System.out.println( str );
    }  
}
