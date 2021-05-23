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
public class TesteCastingReferencias {
//class object  
//http://hg.openjdk.java.net/jdk7/jdk7/jdk/file/tip/src/share/classes/java/lang/Object.java
  public static void main(String args[]) {
      GuardadorDeObjetos guardadorDeObjetos = new GuardadorDeObjetos();
      
      Pessoa pessoa = new Pessoa();
      pessoa.setNome("Eduardo");
      pessoa.toString();
      
      //1
      
      guardadorDeObjetos.adicionaObjeto(pessoa);
      Object obj =  guardadorDeObjetos.pegaObjeto(0);
      System.out.println(obj);
      
      
      
      //2
      /*
      guardadorDeObjetos.adicionaObjeto(pessoa);
      Object obj =  guardadorDeObjetos.pegaObjeto(0);
      Pessoa p1 = (Pessoa)obj;
      System.out.println(p1.getNome());
      */
      
      
      //3
      /*
      guardadorDeObjetos.adicionaObjeto(pessoa);
      //Pessoa p3 = guardadorDeObjetos.pegaObjeto(0);
      //System.out.println(p3.getNome());
      */
 
      
      //4
      /*
      guardadorDeObjetos.adicionaObjeto(pessoa);
      Pessoa p4 = (Pessoa)guardadorDeObjetos.pegaObjeto(0);
      System.out.println(p4.getNome()); //test 2
       */
      
      
  }
}
