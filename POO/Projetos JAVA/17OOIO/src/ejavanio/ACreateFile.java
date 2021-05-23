/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejavanio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author EDYA
 */
public class ACreateFile {
     public static void main(String[] args) throws IOException {
        
         //creates a text file
        /*
        Path path = Paths.get("src/files/bar.txt");
        //Path path = Paths.get("src/files/files/bar.txt");

        //you can create the directory if the directory doens't exist
        Files.createDirectories(path.getParent());

        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            System.err.println("already exists: " + e.getMessage());
        }
        */
         
         
        //creates a text file
         
         /*
        List<String> lines = Arrays.asList("The first line", "The second line");
        Path file = Paths.get("src/files/text.txt");
        Files.write(file, lines, Charset.forName("UTF-8"));
        */
    }
}
