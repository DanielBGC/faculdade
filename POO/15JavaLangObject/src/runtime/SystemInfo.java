/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

/**
 *
 * @author EDYA
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class SystemInfo {
 
    public static String execute(String command) {
        String s;
        StringBuilder result = new StringBuilder();
        BufferedReader stdInput = null;
 
        try {
            Process p = Runtime.getRuntime().exec(command);
            stdInput = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
 
            while ((s = stdInput.readLine()) != null) {
                result.append(s).append("\n");
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (stdInput != null) {
                try {
                    stdInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result.toString();
    }
 
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
 
        System.out.println("Número de processadores disponíveis: "
                + rt.availableProcessors() + " \n");
 
        System.out.println(execute("free"));
 
        System.out.println("Memória disponível na JVM antes do GC: "
                + rt.freeMemory() + " bytes de " + rt.totalMemory()
                + " bytes - Máximo: " + rt.maxMemory() + " bytes");
        rt.gc();
        System.out.println("Memória disponível na JVM após o GC: "
                + rt.freeMemory() + " bytes de " + rt.totalMemory()
                + " bytes - Máximo: " + rt.maxMemory() + " bytes");
        rt.exit(0);
 
    }
 
}
