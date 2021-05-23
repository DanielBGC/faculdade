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
public class SubtractDemo {
	public static void main(String[] args) {
		BigDecimal b = new BigDecimal("50.345");
		BigDecimal bdec = b.subtract(new BigDecimal("34.765"));
		System.out.println("Subtract: " + bdec);
		//Using MathContext
		MathContext mc = new MathContext(2, RoundingMode.FLOOR);
		BigDecimal bdecMath = b.subtract(new BigDecimal("34.765"), mc);
		System.out.println("Subtract using MathContext: " + bdecMath);		
	}
}
