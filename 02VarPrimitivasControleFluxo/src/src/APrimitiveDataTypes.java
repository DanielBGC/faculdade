/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
*
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
http://www.tutorialspoint.com/java/java_basic_datatypes.htm
http://www.studytonight.com/java/datatypes-and-identifier
http://www.javacamp.org/javaI/primitiveTypes.html#float
http://docstore.mik.ua/orelly/java-ent/jnut/ch02_04.htm



* @author EDYA
 */
public class APrimitiveDataTypes {
    
    public static void main(String[] args) {
        byte a = 10;
        byte b = 127;
        byte c = -128;
        //byte b = 128;
        
        
        short d = 200;
        short e = 32767;
        //short f = 32768;
        
        int g = 1000;
        int h = 2147483647;
        //int i = 2147483648;
        
        long j = 200;
        long k = 9223372036854775807l;
        //long l = 9223372036854775808L;
        
        //float m = 3.6; //descomentar
        /*
        em java quando se escreve 3.6, ele é interpretado como um double
        Double tem 64 bits de precisão e float tem 32 bits. Como
        float é menos preciso a conversão não pode ser feita automaticamente.
        */
                
        float n = 3.6f;
        float o = (float) 3.6;
        
        double p = 3.6;
        
        boolean q = false;
        boolean r = true;
        
        char s = 'a';
        char t = 'Z';
        //char u = 'AS';
        
        
       /*
        In addition to the eight primitive data types listed above, the Java 
        programming language also provides special support for character strings
        via the java.lang.String class. Enclosing your character string within 
        double quotes will automatically create a new String object; for example,
        String s = "this is a string";. String objects are immutable, which means 
        that once created, their values cannot be changed. The String class is 
        not technically a primitive data type, but considering the special 
        support given to it by the language, you'll probably tend to think of 
        it as such. You'll learn more about the String class in Simple Data Objects
        */
        String v = "this is a string";
        
        
    }
}
