/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dserializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author EDYA
 */
public class ASerializeDemo {
    
//http://www.tutorialspoint.com/java/java_serialization.htm
//http://www.devmedia.com.br/use-a-serializacao-em-java-com-seguranca/29012
//https://imasters.com.br/artigo/17576/java/entendendo-serializacao-em-java?trace=1519021197&source=single
//https://www.ibm.com/developerworks/br/library/j-5things1/
    public static void main(String[] args) {
        AEmployee e = new AEmployee();
        e.setName("CORONINHA");
        e.setAddress("Phokka Kuan, Ambehta Peer");
        e.setSSN(11122333);
        e.setNumber(101);

        try (OutputStream fileOut = new FileOutputStream("src/files/employee.ser"); 
                ObjectOutputStream out = new ObjectOutputStream(fileOut)){
                out.writeObject(e);
                
            System.out.println("Serialized data is saved in src/files/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
