/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixjava7;

/**
 *
 * @author EDYA
 */
public class CDemoMulticatch {
//http://blog.globalcode.com.br/2011/10/o-novo-try-no-java-7-por-uma-linguagem.html
//http://tutorials.jenkov.com/java-exception-handling/try-with-resources.html

//try-with-resources
    public static void main(String[] args) {
        Object o = null;
        try {
            Class clazz = Class.forName("java.lang.String");
            o = clazz.newInstance();
            System.out.println(o.getClass());
            
            //TODO muticatch
            //TODO muticatch
            //TODO muticatch
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.err.println("Erro na criação do objeto: " + ex.getMessage());
        }
    }
}
