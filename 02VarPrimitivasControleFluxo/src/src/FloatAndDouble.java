/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author EDYA
 */
public class FloatAndDouble {
   public static void main(String[] args) {
         float f = 6.02e23f; //represents 6.02 x 10^23
         System.out.println(f);
         
         double d = 1e-6; // represents 1 x 10^-6
         System.out.println(d);
         
         double d2 = 123.4; 
         System.out.println(d2);
         
         //no problem to compile. 
         //no exception thrown even if illegal operations
         double inf = 1/0; //infinity
         System.out.println(inf);
         
         double neginf = -1/0; // -infinity
         System.out.println(neginf);
         
         double negzero = -1/inf; // negative zero
         System.out.println(negzero);
         
         double NaN = 0/0; //NaN--not a number
         System.out.println(NaN);
         
  
     }
}
