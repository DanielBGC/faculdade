/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printf;

/**
https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf
 
System.out.printf( “format-string” [, arg1, arg2, … ] ); 

Format String:
Composed of literals and format specifiers. Arguments are required only if there are format specifiers in the
format string. Format specifiers include: flags, width, precision, and conversion characters in the following
sequence:
% [flags] [width] [.precision] conversion-character ( square brackets denote optional parameters )

Flags:
- : left-justify ( default is to right-justify )
+ : output a plus ( + ) or minus ( - ) sign for a numerical value
0 : forces numerical values to be zero-padded ( default is blank padding )
, : comma grouping separator (for numbers > 1000)
 : space will display a minus sign if the number is negative or a space if it is positive

Width:
Specifies the field width for outputting the argument and represents the minimum number of characters to
be written to the output. Include space for expected commas and a decimal point in the determination of
the width for numerical values.

Precision:
Used to restrict the output depending on the conversion. It specifies the number of digits of precision when
outputting floating-point values or the length of a substring to extract from a String. Numbers are rounded
to the specified precision.

Conversion-Characters:
d : decimal integer [byte, short, int, long]
f : floating-point number [float, double]
c : character Capital C will uppercase the letter
s : String Capital S will uppercase all the letters in the string
h : hashcode A hashcode is like an address. This is useful for printing a reference
n : newline Platform specific newline character- use %n instead of \n for greater compatibility
Examples:

String class format( ) method:
You can build a formatted String and assign it to a variable using the static format method in the String class.
The use of a format string and argument list is identical to its use in the printf method. The format method
returns a reference to a String. Example:
String grandTotal = String.format("Grand Total: %,.2f", dblTotal);

* 
%c	Caractere simples (char)
%s	Cadeia de caracteres (String)
%d	Inteiro decimal com sinal (int)
%i	Inteiro decimal com sinal (int)
%ld	Inteiro decimal longo (long)
%f	Real em ponto flutuante (float ou double)
%e	Número real em notação científica com o "e" minúsculo (float ou double)
%E	Número real em notação científica com o "E" maiúsculo (float ou double)
%%	Imprimir o próprio caractere %
 */
public class Exemplo0 {
    public static void main(String[] args) {
        double dblTotal = 2240.23;
        int intValue = 240;
        String stringVal = "Joaozinho";
        ////////////////////////////////////////////////////////////
        System.out.printf("1.Total is: $%f%n", dblTotal); //flutuante, quebra linha e 0 casas decimais à direita
        System.out.printf("1.Total is: $%.2f%n", dblTotal); //flutuante, quebra linha e 2 casas decimais à direita
        System.out.printf("1.Total is: $%,.1f%n", dblTotal); //flutuante, quebra linha, 1 casas decimais à direita e separando milhar com ,
        System.out.printf("1.Total is: $%,.2f%n", dblTotal); //flutuante, quebra linha, 2 casas decimais à direita e separando milhar com ,
        
        ////////////////////////////////////////////////////////////
        System.out.printf("\n2.Total is: $%+.2f%n", dblTotal); //adicionando "+" ao número
       
        ////////////////////////////////////////////////////////////
        System.out.printf("\n3.Total: %-1.2fAQUI%n", dblTotal); //lagura de 1 e à esquerda
        System.out.printf("3.Total: %-5.2fAQUI%n", dblTotal); //lagura de 5 e à esquerda
        System.out.printf("3.Total: %-10.2fAQUI%n", dblTotal); //lagura de 10 e à esquerda
        System.out.printf("3.Total: %-20.2fAQUI%n", dblTotal); //lagura de 20 e à esquerda
        System.out.printf("3.Total: %20.1fAQUI%n", dblTotal); //lagura de 20 e à direita (default)
        ////////////////////////////////////////////////////////////
        System.out.printf("\nTotal: %4d%n", intValue); //largura de 4 à direita 
        System.out.printf("Total: %8d%n", intValue); //largura de 8 à direita 
        //%d %f %s
        ////////////////////////////////////////////////////////////
        System.out.printf("\nString: %20.10s\n", stringVal);//20 à esquerda, 10 de precisão
        
        ////////////////////////////////////////////////////////////
        String s = "Hello World";
        System.out.printf("\nThe String object %s is at hash code %h%n", s, s);//hashcode
        
        ////////////////////////////////////////////////////////////
        String grandTotal = String.format("\nGrand Total: %,.2f", dblTotal); 
        System.out.println(grandTotal);
     }
}
