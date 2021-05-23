/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebdoperations;

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

public class AddDemo {
    	public static void main(String[] args) {
		BigDecimal b = new BigDecimal("234.43");
		BigDecimal bres = b.add(new BigDecimal("450.23"));
		System.out.println("Add: " + bres);
		//Using MathContext
		MathContext mc = new MathContext(2, RoundingMode.DOWN);		
		BigDecimal bdecMath = b.add(new BigDecimal("450.23"), mc);
		System.out.println("Add using MathContext: " + bdecMath);
	}
}
