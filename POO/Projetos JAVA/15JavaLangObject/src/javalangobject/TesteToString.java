/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalangobject;

/**
 *
 * @author EDYA
 */
public class TesteToString {
     public static void main(String args[]) {
      
      Pessoa pessoa = new Pessoa();
      pessoa.setNome("Maria");
      
      System.out.println(pessoa.toString());
      System.out.println(pessoa);
         
      Pessoa1 pessoa1 = new Pessoa1();
      pessoa1.setNome("Maria");
      
      
      System.out.println(pessoa1.toString());
      System.out.println(pessoa1);
  }
}
