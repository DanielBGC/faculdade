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
 * @author Ernani
 */
public class DivideDemo {
    	public static void main(String[] args) {
		BigDecimal bdec = new BigDecimal("706");
		BigDecimal bdecRes = bdec.divide(new BigDecimal("20"));
		System.out.println("Divide: " + bdecRes);
		//Using MathContext
		MathContext mc = new MathContext(2, RoundingMode.HALF_UP);	
		BigDecimal bdecMath = bdec.divide(new BigDecimal("20"), mc);
		System.out.println("Divide using MathContext: " + bdecMath);		
	}
}
