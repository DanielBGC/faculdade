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
public class MultiplyDemo {
    	public static void main(String[] args) {
		BigDecimal bdec = new BigDecimal("50.23");
		BigDecimal bdecRes = bdec.multiply(new BigDecimal("30.44"));
		System.out.println("Multiply:" + bdecRes);
		//Using MathContext
		MathContext mc = new MathContext(2, RoundingMode.DOWN);
		BigDecimal bdecMath = bdec.multiply(new BigDecimal("30.44"), mc);
		System.out.println("Multiply using MathContext: " + bdecMath);		
	}
}
