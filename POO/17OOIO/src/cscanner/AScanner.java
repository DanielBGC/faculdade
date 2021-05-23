/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cscanner;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class AScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("src/files/arquivosScanner.txt");

        System.out.println("");
        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }
    }

}
