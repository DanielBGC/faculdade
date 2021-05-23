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
//LIBRARY
//http://www.devmedia.com.br/java-bigdecimal-trabalhando-com-mais-precisao/30286
//https://www.journaldev.com/16409/java-bigdecimal
//https://www.concretepage.com/java/java-bigdecimal-tutorial-with-example
//http://www.javaworld.com/article/2075315/core-java/make-cents-with-bigdecimal.html
//http://www.stichlberger.com/software/java-bigdecimal-gotchas/#codesyntax_11
//https://agorandroid.blogspot.com/2012/04/java-valores-monetarios-float-double-e.html

public class ARounding {
/*
*Precision != Scale
BigDecimal has two different notions for limiting numbers, they're completely 
different, even thought the method signatures would suggest otherwise. 
This is IMO a (yet another) design flaw in BigDecimal.

*Precision is the overall limit of, well, precision, in a number.
E.g. 1234 and 12.34 have the same precision (4 decimal digits)
*Scale is the limit of the digits after the decimal point 3.34 and 234.25 have 
the same scale (2 digits after the decimal point)
    
9999/10000 = 0.9999, scale = 4 and precision = 4
1/1000 = 0.0001, scale = 4 and precision = 1
0.000, special case and precision = 1
    
9999 with scale 4 = 0.9999
9999 with scale 1 = 999.9 
9999 with scale -1 = 99990   
*/
    
/*
 An enum RoundingMode provides several rounding modes for the BigDecimal type:

CEILING: Rounding mode to round towards positive infinity
DOWN: Rounding mode to round towards zero
FLOOR: Rounding mode to round towards negative infinity
HALF_DOWN: Rounding mode to round towards “nearest neighbor” unless both neighbors are equidistant, in which case round down
HALF_EVEN: Rounding mode to round towards the “nearest neighbor” unless both neighbors are equidistant, in which case, round towards the even neighbor
HALF_UP: Rounding mode to round towards “nearest neighbor” unless both neighbors are equidistant, in which case round up
UNNECESSARY: Rounding mode to assert that the requested operation has an exact result, hence no rounding is necessary
UP: Rounding mode to round away from zero
 */
/*
"ROUND_UP " Rounding mode to round away from zero.
    Arredonda para: o mais distante de zero, maior em valor absoluto
    Se valor negativo: arredonda para o menor valor
    Se valor positivo: arredonda para o maior valor
    -0.001 => -0.01
      0.001 => 0.01

"ROUND_DOWN " Rounding mode to round towards zero.
    Arredonda para: o mais próximo de zero, menor em valor absoluto 
    Se valor negativo: arredonda para o maior valor
    Se valor positivo: arredonda para o menor valor
   -0.009 => 0.00
    0.009 => 0.00

"ROUND_CEILING " Rounding mode to round towards positive infinity.
    Arredonda para: o maior valor
   -0.001 => 0.00
    0.001 => 0.01

"ROUND_FLOOR " Rounding mode to round towards negative infinity.
    Arredonda para: o menor valor
   -0.001 => -0.01
    0.001 => 0.00

"ROUND_HALF_DOWN " Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round down.
    Verifica o valor excedente: se diferente de 5, para o "vizinho mais próximo"
           se igual a 5 => para o valor absoluto menor
    -0.006 => -0.01
    -0.005 =>  0.00
    -0.004 =>  0.00
      0.004 => 0.00
      0.005 => 0.00
      0.006 => 0.01

"ROUND_HALF_UP " Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round up.
    Verifica o valor excedente: se diferente de 5, para o "vizinho mais próximo"
          se igual a 5 => para o valor absoluto maior
    -0.006 => -0.01
    -0.005 => -0.01
    -0.004 => 0.00
     0.004 => 0.00
     0.005 => 0.01
     0.006 => 0.01

"ROUND_HALF_EVEN " Rounding mode to round towards the "nearest neighbor" unless both neighbors are equidistant, in which case, round towards the even neighbor.
    Verifica o valor excedente: se diferente de 5, para o "vizinho mais próximo"
        se igual a 5 => verifica o digito a ser arredondado
            se impar => arredonda para o maior em valor absoluto
            se par     => arredonda para o menor em valor absoluto
 Esse tipo de arredondamento é indicado para evitar distorção no resultado devido aos arredondamentos cumulativos na mesma direção. Um uso seria em estatísticas, onde um grande volume de dados são manipulados.
    -0.015 => -0.02
    -0.025 => -0.02
     0.015 => 0.02
     0.025 => 0.02

"ROUND_UNNECESSARY" Rounding mode to assert that the requested operation has an exact result, hence no rounding is necessary.
    Quando não tem arredondamento a ser efetuado. Se tiver ocorre um ArithmeticException.
   -0.01 => -0.01
    0.01 => 0.01
    0.011 => ArithmeticException

 BigDecimal bd = new BigDecimal("10.001");
 bd = bd.setScale(2, BigDecimal.ROUND_UP); // = 10.01

*/
        
    public static void main(String[] args) {
        BigDecimal hundred = BigDecimal.valueOf(100);
        BigDecimal three = BigDecimal.valueOf(3);
        
        // 33.33
        System.out.println(hundred.divide(three, 2, RoundingMode.HALF_UP));
        // 33
        System.out.println(hundred.divide(three, new MathContext(2, RoundingMode.HALF_UP)));


        // 1.01
        System.out.println(new BigDecimal("1.005").setScale(2, RoundingMode.HALF_UP));
        // 1.00
        System.out.println(new BigDecimal("1.005").setScale(2, RoundingMode.HALF_DOWN));
    }


}
