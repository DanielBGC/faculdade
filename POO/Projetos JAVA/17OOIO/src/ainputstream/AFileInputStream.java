/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ainputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author EDYA
 */
//http://tutorials.jenkov.com/java-io/index.html
//http://tutorials.jenkov.com/java-nio/index.html
//https://www.javatpoint.com/java-nio
//https://medium.com/@antonio.gabriel/java-io-java-nio-e-nio-2-quando-utilizar-8c900b1c57a1
public class AFileInputStream {
    public static void main(String[] args) throws IOException  { //CHECKED EXCEPTION
        InputStream is = new FileInputStream("src/files/arquivo.txt");
        int b = is.read();
        System.out.println(b);
        System.out.println((char)b);
        
 }
}
