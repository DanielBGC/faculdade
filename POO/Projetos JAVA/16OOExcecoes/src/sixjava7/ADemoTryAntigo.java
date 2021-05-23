/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixjava7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author EDYA
 */
public class ADemoTryAntigo {
//http://blog.globalcode.com.br/2011/10/o-novo-try-no-java-7-por-uma-linguagem.html
//http://tutorials.jenkov.com/java-exception-handling/try-with-resources.html

    public static void main(String[] args) {
        FileReader in = null;
        BufferedReader buff = null;

        try {
            in = new FileReader("/home/yaw/teste.txt"); //caminho do arquivo
            buff = new BufferedReader(in, 1024);

            StringBuilder builder = new StringBuilder();
            String s = null;
            while ((s = buff.readLine()) != null) {
                builder.append(s).append("\n");
            }
            System.out.println("Conteudo do arquivo:\n\n" + builder);
        } catch (IOException iox) {
            System.out.println("Falha ao ler arquivo: " + iox.getMessage());
        } finally {
            //TODO bloco sempre será executado
            //TODO bloco sempre será executado
            //TODO bloco sempre será executado
            if (buff != null) {
                try {
                    buff.close();
                } catch (IOException bufx) {
                    System.out.println("Falha ao fechar buffer: " + bufx.getMessage());
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException inx) {
                    System.out.println("Falha ao fechar arquivo: " + inx.getMessage());
                }
            }
        }
    }
}
