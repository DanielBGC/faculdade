/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printf;

/**
 * http://www.homeandlearn.co.uk/java/java_formatted_strings.html
 * @author EDYA
 */
public class Exemplo1 {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////
        /*
        The first column is left-justified, and the second column is right-justified.
        To get the left-justified column, you need a percentage symbol, a minus symbol, the number of characters, and then the letter "s" (lowercase). So ''%-15s'' means fifteen characters left-justified.
        To get a right-justified column the same sequence of characters are used, except for the minus sign.
        To get a newline %n is used.
        */
        String heading1 = "Exam_Name";
        String heading2 = "Exam_Grade";
        String course1 = "Java"; String grade1 = "A";
        String course2 = "PHP"; String grade2 = "B";
        String course3 = "VB NET"; String grade3 = "A";
        String divider = "-----------------------------";
        
        System.out.println("");
        System.out.printf("%-15s %15s %n", heading1, heading2);  
        System.out.println(divider);
        System.out.printf( "%-15s %10s %n", course1, grade1); 
        System.out.printf( "%-15s %10s %n", course2, grade2); 
        System.out.printf( "%-15s %10s %n", course3, grade3); 
        System.out.println(divider);
        System.out.println(""); 
 
        ////////////////////////////////////////////////////////////
        int x = 121;
        System.out.printf("Valor de x: %d%n", x); 
        System.out.printf("Valor de x: %8d%n", x); 
        System.out.printf("Valor de x: %08d%n", x); 
        ////////////////////////////////////////////////////////////
        double y = 121;
        System.out.printf("\nValor de y: %f%n", y); 
        System.out.printf("Valor de y: %.2f%n", y); 
        System.out.printf("Valor de y: %10.3f%n", y); 
        ////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////
    }
}
