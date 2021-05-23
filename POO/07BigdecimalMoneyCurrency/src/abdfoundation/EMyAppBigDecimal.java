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
public class EMyAppBigDecimal {

    //BigDecimal is immutable
    //BigDecimal is immutable
    public static void main(String[] args) {
        BigDecimal big1 = new BigDecimal(0.1);
        BigDecimal big2 = new BigDecimal(0.2);
        BigDecimal bigResult = big1.add(big2);
        System.out.println(bigResult.toString());

        /**
         * Acontece que os números 0.1, e 0.2 já são do tipo double e ao passar
         * para o construtor do BigDecimal ocorre uma transformação com
         * imprecisão, que é exatamente o que não queremos. Então fica o
         * conselho: utilize sempre Strings no construtor do BigDecimal.
         */
        /**
         * valueof também pode ser usado 
         * valueof => return new BigDecimal(Double.toString(val));
         */
        System.out.println("--------------------------------");
        BigDecimal big3 = BigDecimal.valueOf(0.1);
        BigDecimal big4 = BigDecimal.valueOf(0.2);
        BigDecimal bigResult2 = big3.add(big4);
        System.out.println(bigResult2.toString());

        /**
         * BigDecimal.valueOf(double) will use the canonical String
         * representation of the double value passed in to instantiate the
         * BigDecimal object. In other words: The value of the BigDecimal object
         * will be what you see when you do System.out.println(d).
         *
         * If you use new BigDecimal(d) however, then the BigDecimal will try to
         * represent the double value as accurately as possible. This will
         * usually result in a lot more digits being stored than you want.
         * Strictly speaking, it's more correct than valueOf(), but it's a lot
         * less intuitiv
         */
    }

}
