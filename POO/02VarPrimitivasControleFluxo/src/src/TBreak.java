/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author eduardoasilvestre
 */
  //https://www.developer.com/java/data/understanding-the-java-labeled-statement.html
public class TBreak {
public static void main(String[] args) {

      int i = 0;

      for (i = 9999; i <= 99999; i++) {
         if (i % 397 == 0)
         break;
      }
      System.out.println("First number "
         + "divisible by 397 between "
         + "9999 and 99999 is = " + i);
   }
}
