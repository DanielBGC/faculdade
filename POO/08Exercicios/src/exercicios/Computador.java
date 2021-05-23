/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author EDYA
 */
public class Computador {
    String mensagens="";
    String modelo;
    String marca;
    
   void enviaMensagem(Computador p, String msg) {
       p.mensagens = p.mensagens + msg + "\n";
       
   }
   void mostraMensagens() {
       String texto = "As mensagens são:\n";
       texto = texto + this.mensagens;
       System.out.println(texto);
   
   } 
}
