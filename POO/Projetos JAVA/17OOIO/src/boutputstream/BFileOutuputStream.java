/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutputstream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author EDYA
 */
public class BFileOutuputStream {

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("src/files/arquivoEscrita.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        try (BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write("caelum caelum");
        }

    }
}
