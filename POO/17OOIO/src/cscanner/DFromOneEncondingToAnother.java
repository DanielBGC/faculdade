/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cscanner;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author EDYA
 */
public class DFromOneEncondingToAnother {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // ç escrito em UTF-8 mas lido em ISO-8859-1
System.out.println(new String("ç".getBytes("UTF-8"), "ISO-8859-1"));
// ç escrito em ISO-8859-1 mas lido em UTF-8
System.out.println(new String("ç".getBytes("ISO-8859-1"), "UTF-8"));


System.out.println(new String("canção".getBytes("UTF-8"), "ISO-8859-1"));
// ç escrito em ISO-8859-1 mas lido em UTF-8
System.out.println(new String("canção".getBytes("ISO-8859-1"), "UTF-8"));


    }
}
