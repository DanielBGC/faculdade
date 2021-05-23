/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringXbufferXbuilder;

/**
 *
 * @author EDYA
 */
 public class ConcatenaString4 {
     //http://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865       
         public static void main (String[] args){
               
               /*
                * A nossa string abaixo é um uso ideal para o operador '+', 
                * pois não estamos criando nenhum novo objeto em memória, 
                * apenas melhorando a
                * legibilidade do código.
                * */
               String strFinal = "Feliz " +
                                            "Natal " +
                                            "Aos Leitores "+
                                            "da DEVMEDIA "+
                                            "hohoho...";
               
               //Também poderiamos usar desta forma sem 
               //prejudicar a performance do programa
               int x = 10;
               int y = 20;
               System.out.println("x:"+x+" y:"+y);
         }
  }
