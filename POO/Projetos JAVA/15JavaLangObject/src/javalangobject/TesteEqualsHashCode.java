/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalangobject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
//classe string
//http://hg.openjdk.java.net/jdk7u/jdk7u6/jdk/file/8c2c5d63a17e/src/share/classes/java/lang/String.java
//http://hg.openjdk.java.net/jdk7u/jdk7u6/jdk/file/8c2c5d63a17e/src/share/classes/java/lang/String.java
    
//http://blog.caelum.com.br/ensinando-que-e-o-hashcode/
//http://blog.caelum.com.br/ensinando-que-e-o-hashcode/
* 
 * @author EDYA
 */
public class TesteEqualsHashCode {
    public TesteEqualsHashCode() {
        //method1();
        //method2();
        //method3();
        //method4();
        //method5();
        //method6();
        method7();
        //method8();
        //method9();
        //method10();
        //method11();
    }

    public static void main(String args[]) {

        new TesteEqualsHashCode();

        /**
         * *
         * RESUMO: IMPLEMENTE O EQUALS E O HASHCODE PARA OS ATRIBUTOS QUE
         * CONSIDERA IMPORTANTE COMPARAR A IGUALDADE
         */
    }

    /**
     * a comparação com == compara apenas a referência no java
     *
     */
    private void method1() {
        Pessoa2 a = new Pessoa2();
        Pessoa2 b = a;
        if (a == a) {
            System.out.println("mesma referência");
        } else {
            System.out.println("referências diferentes");
        }

        if (a == b) {
            System.out.println("mesma referência");
        } else {
            System.out.println("referências diferentes");
        }
    }

    /**
     * a comparação com == compara apenas a referência no java
     *
     */
    private void method2() {
        Pessoa2 a = new Pessoa2();
        a.setNome("eduardo");
        a.setIdade(10);
        a.setCpf("1234");

        Pessoa2 b = a;
        if (b == a) {
            System.out.println("mesma referência");
        } else {
            System.out.println("referências diferentes");
        }

    }

    /**
     * uma confusão com ==
     *
     */
    private void method3() {

        Pessoa2 a = new Pessoa2();
        a.setNome("edu");

        Pessoa2 b = new Pessoa2();
        b.setNome("edu");
        if (b == a) {
            System.out.println("mesma referência");
        } else {
            System.out.println("referências diferentes");
        }
    }

    /**
     * CONFUSÃO com equals PORQUE COMPARA A MESMA INSTÂNCIA The equals method
     * EQUALS DEFINITION:
     * for class Object implements the most discriminating possible equivalence
     * relation on objects; that is, for any non-null reference values x and y,
     * this method returns true if and only if x and y refer to the same object
     * (x == y has the value true).
     */
    private void method4() {

        Pessoa2 a = new Pessoa2();
        a.setNome("edu");

        Pessoa2 b = new Pessoa2();
        b.setNome("edu");
        
        if (b.getNome().equals(a.getNome())) {
            System.out.println("mesma referência");
        } else {
            System.out.println("referências diferentes");
        }

        if (b.equals(a)) {
            System.out.println("mesma referência");
        } else {
            System.out.println("referências diferentes");
        }


        System.out.println("hashcode a: " + a.hashCode());
        System.out.println("hashcode b: " + b.hashCode());
    }

    /**
     *
     * equals sobreescrito simples (ENSINANDO AO OBJETO COMO ELE DEVE SE
     * COMPARAR)
     */
    private void method5() {
        //5 
        Pessoa3 a = new Pessoa3();
        a.setNome("edu");

        Pessoa3 b = new Pessoa3();
        b.setNome("edu");

        if (b.equals(a)) {
            System.out.println("meu critério de comparação gera igual");
        } else {
            System.out.println("meu critério de comparação gera diferente");
        }
        System.out.println("hashcode a: " + a.hashCode());
        System.out.println("hashcode b: " + b.hashCode());

    }

    /**
     *
     * utiliza apenas o equals para comparação, o hashcode não é relevante
     * HASHCODE:
     * If two objects are equal according to the equals(Object) method,
     * then calling the hashCode method on each of the two objects must produce the same integer result
     */
    
    private boolean containsMeu(  List<Pessoa3> c, Pessoa3 parametro ) {
        for(int i = 0; i< c.size(); i++) {
            Pessoa3 p1 = c.get(i);
            if (p1.equals(parametro)) {
                return true;
            }
        
        }
        return false;
    }
        

    
    private void method6() {
        List<Pessoa3> c = new ArrayList<>();

        Pessoa3 a = new Pessoa3();
        a.setNome("edu");

        Pessoa3 b = new Pessoa3();
        b.setNome("edu");

        System.out.println("antes de inserir a\n");
        for (Pessoa3 p : c) {
            System.out.println(p);
        }

        if (!c.contains(a)) {
            c.add(a);
        }
        
        
        

        System.out.println("depois de inserir a");
        for (Pessoa3 p : c) {
            System.out.println(p);
        }

        if (!c.contains(b)) {
            c.add(b);
        }

        System.out.println("\ndepois de inserir b");
        for (Pessoa3 p : c) {
            System.out.println(p);
        }

        System.out.println("hashcode a: " + a.hashCode());
        System.out.println("hashcode b: " + b.hashCode());
    }
    


    /**
     * PROBLEMA UTILIZAÇÃO DO EQUALS HASHSET e HASHMAP utilizam tabela hash
     * (google: HASH TABLE), como hashcode serão diferentes ele permitirá a
     * inserção
     */
    private void method7() {
        
        Set<Pessoa3> c = new HashSet<Pessoa3>();
                
        Pessoa3 a = new Pessoa3();
        a.setNome("edu");
        
        Pessoa3 b = new Pessoa3();
        b.setNome("edu");
        
        System.out.println("antes de inserir a\n");
        for (Pessoa3 p : c) {
            System.out.println(p);
        }
        if (!c.contains(a)) {
            c.add(a);
        }
        System.out.println("depois de inserir a");
        for (Pessoa3 p : c) {
            System.out.println(p);
        }
        if (!c.contains(b)) {
            c.add(b);
        }
        System.out.println("\ndepois de inserir b");
        for (Pessoa3 p : c) {
            System.out.println(p);
        }

        System.out.println("hashcode a: " + a.hashCode());
        System.out.println("hashcode b: " + b.hashCode());

    }

    /**
     * SOLUÇÃO COM HASHCODE = IDENTIFICA OBJETOS IGUAIS
     *
     */
    private void method8() {
        Set<Pessoa4> c = new HashSet<Pessoa4>();

        Pessoa4 a = new Pessoa4();
        a.setNome("edu");

        Pessoa4 b = new Pessoa4();
        b.setNome("edu");

        System.out.println("antes de inserir a\n");
        for (Pessoa4 p : c) {
            System.out.println(p);
        }

        if (!c.contains(a)) {
            c.add(a);
        }

        System.out.println("depois de inserir a");
        for (Pessoa4 p : c) {
            System.out.println(p);
        }

        if (!c.contains(b)) {
            c.add(b);
        }

        System.out.println("\ndepois de inserir b");
        for (Pessoa4 p : c) {
            System.out.println(p);
        }
        System.out.println("hashcode a: " + a.hashCode());
        System.out.println("hashcode b: " + b.hashCode());
    }

    /**
     *
     * equals e hashcode funcionando mas não está comparando os dados
     * necessários
     */
    private void method9() {

        Set<Pessoa4> c = new HashSet<Pessoa4>();

        Pessoa4 a = new Pessoa4();
        a.setNome("edu");
        a.setIdade(10);

        Pessoa4 b = new Pessoa4();
        b.setNome("edu");
        b.setIdade(11);

        System.out.println("antes de inserir a\n");
        for (Pessoa4 p : c) {
            System.out.println(p);
        }

        if (!c.contains(a)) {
            c.add(a);
        }

        System.out.println("depois de inserir a");
        for (Pessoa4 p : c) {
            System.out.println(p);
        }

        if (!c.contains(b)) {
            c.add(b);
        }

        System.out.println("\ndepois de inserir b");
        for (Pessoa4 p : c) {
            System.out.println(p);
        }

        System.out.println("hashcode a: " + a.hashCode());
        System.out.println("hashcode b: " + b.hashCode());
    }

    /**
     *
     * equals e hashcode funcionando e comparando nome e idade
     */
    private void method10() {
        Set<Pessoa5> c = new HashSet<Pessoa5>();

        Pessoa5 a = new Pessoa5();
        a.setNome("edu");
        a.setIdade(10);

        Pessoa5 b = new Pessoa5();
        b.setNome("edu");
        b.setIdade(11);

        System.out.println("antes de inserir a\n");
        for (Pessoa5 p : c) {
            System.out.println(p);
        }

        if (!c.contains(a)) {
            c.add(a);
        }

        System.out.println("depois de inserir a");
        for (Pessoa5 p : c) {
            System.out.println(p);
        }

        if (!c.contains(b)) {
            c.add(b);
        }

        System.out.println("\ndepois de inserir b");
        for (Pessoa5 p : c) {
            System.out.println(p);
        }
        System.out.println("hashcode a: " + a.hashCode());
        System.out.println("hashcode b: " + b.hashCode());

    }

    /**
     * equals e hashcode funcionando e comparando nome e idade iguais
     *
     */
    private void method11() {
        Set<Pessoa5> c = new HashSet<Pessoa5>();

        Pessoa5 a = new Pessoa5();
        a.setNome("edu");
        a.setIdade(10);

        Pessoa5 b = new Pessoa5();
        b.setNome("edu");
        b.setIdade(10);

        System.out.println("antes de inserir a\n");
        for (Pessoa5 p : c) {
            System.out.println(p);
        }

        if (!c.contains(a)) {
            c.add(a);
        }

        System.out.println("depois de inserir a");
        for (Pessoa5 p : c) {
            System.out.println(p);
        }

        if (!c.contains(b)) {
            c.add(b);
        }

        System.out.println("\ndepois de inserir b");
        for (Pessoa5 p : c) {
            System.out.println(p);
        }
        System.out.println("hashcode a: " + a.hashCode());
        System.out.println("hashcode b: " + b.hashCode());
    }
}
