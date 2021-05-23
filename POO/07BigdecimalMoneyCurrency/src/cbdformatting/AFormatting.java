/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbdformatting;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author EDYA
 */
//LIBRARY
//http://www.devmedia.com.br/java-bigdecimal-trabalhando-com-mais-precisao/30286
//https://www.journaldev.com/16409/java-bigdecimal
//https://www.concretepage.com/java/java-bigdecimal-tutorial-with-example
//http://www.javaworld.com/article/2075315/core-java/make-cents-with-bigdecimal.html
//http://www.stichlberger.com/software/java-bigdecimal-gotchas/#codesyntax_11
//https://agorandroid.blogspot.com/2012/04/java-valores-monetarios-float-double-e.html

public class AFormatting {
      public static void main(String[] args) {
        BigDecimal payment = new BigDecimal("1115.37");
        
        //BRASIL: escolha uma opção
        Locale BRAZIL = new Locale("pt","BR");
        NumberFormat n = NumberFormat.getCurrencyInstance(BRAZIL); 
        
        //USA: escolha uma opção
        //NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US); 
        
        //UK: escolha uma opção
        //NumberFormat n = NumberFormat.getCurrencyInstance(Locale.UK); 
        
        //EUROPA: escolha uma opção
        //NumberFormat n = NumberFormat.getCurrencyInstance(Locale.GERMANY); 
        
        double doublePayment = payment.doubleValue();
        String s = n.format(doublePayment);
        System.out.println(s);
       }
}
