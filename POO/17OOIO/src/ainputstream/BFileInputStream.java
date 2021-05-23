/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ainputstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author EDYA
 */
//http://tutorials.jenkov.com/java-io/index.html
//http://tutorials.jenkov.com/java-nio/index.html
//https://www.javatpoint.com/java-nio
//https://medium.com/@antonio.gabriel/java-io-java-nio-e-nio-2-quando-utilizar-8c900b1c57a1

public class BFileInputStream {

    public static void main(String[] args) throws IOException {
        //diretorio do projeto inicialmente
        InputStream is = new FileInputStream("src/files/arquivo.txt"); //lê byte

        /*Para recuperar um caractere, precisamos traduzir os bytes com o encoding dado para o respectivo código
         unicode, isso pode usar um ou mais bytes.*/
        InputStreamReader isr = new InputStreamReader(is); //lê char
         /*A classe BufferedReader é um Reader que recebe outro Reader pelo construtor e concatena os
         diversos chars padra formar uma String através do método readLine
         */
        BufferedReader br = new BufferedReader(isr); //lê string

        String s = br.readLine();

        /*
         Aqui, lemos apenas a primeira linha do arquivo. O método readLine devolve a linha que foi lida e muda
         o cursor para a próxima linha*/
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
        br.close();
    }
}
