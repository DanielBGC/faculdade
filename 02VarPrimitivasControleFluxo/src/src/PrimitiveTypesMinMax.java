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
public class PrimitiveTypesMinMax {
   //http://www.ntu.edu.sg/home/ehchua/programming/java/j2_basics.html
   public static void main(String[] args) {
      // int (32-bit signed integer)
      System.out.println("int(min) = " + Integer.MIN_VALUE);
      System.out.println("int(max) = " + Integer.MAX_VALUE);
      System.out.println("int(bit-length) = " + Integer.SIZE);
      // byte (8-bit signed integer)
      System.out.println("\nbyte(min) = " + Byte.MIN_VALUE);
      System.out.println("byte(max) = " + Byte.MAX_VALUE);
      System.out.println("byte(bit-length)=" + Byte.SIZE); 
      // short (16-bit signed integer)
      System.out.println("\nshort(min) = " + Short.MIN_VALUE);
      System.out.println("short(max) = " + Short.MAX_VALUE);
      System.out.println("short(bit-length) = " + Short.SIZE);
      // long (64-bit signed integer)
      System.out.println("\nlong(min) = " + Long.MIN_VALUE); 
      System.out.println("long(max) = " + Long.MAX_VALUE);
      System.out.println("long(bit-length) = " + Long.SIZE);
      // char (16-bit character or 16-bit unsigned integer)
      System.out.println("\nchar(min) = " + (int)Character.MIN_VALUE);
      System.out.println("char(max) = " + (int)Character.MAX_VALUE);
      System.out.println("char(bit-length) = " + Character.SIZE);
      // float (32-bit floating-point)
      System.out.println("\nfloat(min) = " + Float.MIN_VALUE);
      System.out.println("float(max) = " + Float.MAX_VALUE);
      System.out.println("float(bit-length) = " + Float.SIZE);
      // double (64-bit floating-point)
      System.out.println("\ndouble(min) = " + Double.MIN_VALUE);
      System.out.println("double(max) = " + Double.MAX_VALUE);
      System.out.println("double(bit-length) = " + Double.SIZE);
   }
}
