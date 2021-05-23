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
public class TBreakLabeled {
public static void main(String[] args) {
      int counter = 0;
      start: {
         for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
               if (i == 5) {
                    System.out.println("j=" + j);
                           
                  break start;
               }
            }
            System.out.println("i=" + i);
            counter++;
         }
      }
      System.out.println(counter);
   }
}
