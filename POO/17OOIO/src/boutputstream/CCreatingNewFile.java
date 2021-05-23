/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutputstream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author EDYA
 */
public class CCreatingNewFile {
    

    public static void main(String[]args) {
    try {
        
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmm"));
//        String now = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy"));
        String fileName = "../arquivo" +now +".txt";
        
        File statText = new File(fileName);
        
        OutputStream os = new FileOutputStream(statText);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(now);
        bw.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file");
        }
    }
}