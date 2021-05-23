/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aencapsulamento;


/**
 *
 * @author EDYA
 */
public class CContaTestaAcessoDireto {
     public static void main(String args[]) {
        CConta minhaConta = new CConta();
        
        //não compila! você não pode acessar o atributo privado de outra classe
        //descomentar
       // minhaConta.saldo = 1000;
  
        
        //Como se comunicar com objetos agora ?
        //R.: troca de mensagens entre métodos
        
        //minhaConta.alteraSaldo(20000);
        //System.out.println(minhaConta.minhaConta.pegaSaldo());
}
}
