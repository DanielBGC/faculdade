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
 public class ConcatenaString5 {
         //http://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865   
        public static void main (String[] args){
               
               
               /*
                * ###########################################
                * INICIO BLOCO CONCATENAÇÃO COM StringBuilder
                * ###########################################
                * */
               StringBuilder strBuilder = new StringBuilder();
               long tStart1 = System.currentTimeMillis();
               for(int i = 0; i < 5000000; i ++){
                      strBuilder.append("c");                 
               }
               long tEnd1 = System.currentTimeMillis();
               long tResult1 = tEnd1 - tStart1;
               System.out.println("Tempo de Execução com StringBuilder = "+tResult1+" ms");
               /*
                * ###########################################
                 * FIM BLOCO CONCATENAÇÃO COM StringBuilder
                * ###########################################
                * */
               
               /*
                * ###########################################
                * INICIO BLOCO CONCATENAÇÃO COM StringBuffer
                * ###########################################
                * */
               StringBuffer strBuffer = new StringBuffer();
               long tStart2 = System.currentTimeMillis();
               for(int i = 0; i < 5000000; i ++){
                      strBuffer.append("d");                  
               }
               long tEnd2 = System.currentTimeMillis();
               long tResult2 = tEnd2 - tStart2;
               System.out.println("Tempo de Execução com StringBuffer ="+tResult2+" ms");
               /*
                * ###########################################
                * FIM BLOCO CONCATENAÇÃO COM StringBuffer
                * ###########################################
                * */
         }
  }
