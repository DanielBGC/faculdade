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
 public class ConcatenaString {
      //http://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865   
         public static void main (String[] args){
               
               //Cria um objeto em memória
               String str = "hello";
               
               /*
                * Sabemos que nossa string agora será: "hello world".
                *
                * Ocorre que é criada a String "world" em memória,
                 * depois a JVM cria um outro objeto "hello world".
                * No total vão ser 3 objetos para que essa 'concatenação'
                * ocorra.
                * */
               str.concat(" world");
               
               
               /*
                * O mesmo conceito é aplicado acima. É criada uma string 
                 * "from java" em memória, depois é criada uma
                * nova juntando "hello world from java".
                * No total temos agora 5 objetos em memória,
                * sendo que apenas 1 estamos utilizando, 
                * veja que desperdício.
                * */
               str += " from Java";
               
         }
   
  }
