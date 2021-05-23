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
public class TContinueLabeled {
    public static void main(String[] args) {

      start: for (int i = 0; i < 5; i++) {
         System.out.println();
         for (int j = 0; j < 10; j++) {
            System.out.print("#");
            if (j >= i)
               continue start;
         }
         System.out.println("This will never"
            + " be printed");
      }
   }
}
