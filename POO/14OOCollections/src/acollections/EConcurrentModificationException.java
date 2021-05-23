/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author EDYA
 */
public class EConcurrentModificationException {
    //http://blog.caelum.com.br/concurrentmodificationexception-e-os-fail-fast-iterators/
    //http://blog.caelum.com.br/concurrentmodificationexception-e-os-fail-fast-iterators/
    //http://blog.caelum.com.br/concurrentmodificationexception-e-os-fail-fast-iterators/
    
    /*
    EXERCÍCIO:
    1 - Criar uma lista/conjunto de pessoas;
    2 - Criar 6 pessoas com nomes diferentes (obedecendo boas práticas de programação);
    OBS1: obedeça boas práticas de orientação a objetos.
    OBS2: insira os seguintes nomes: aline, mariana, priscila, mayla, patricia e camila
    3 - Adicionar 3 pessoas a lista/conjunto de pessoas (adicione apenas a aline, mariana e priscila);
    4 - Para cada atividade a seguir imprima a lista/conjunto antes e a lista/conjunto depois de realizar a atividade.
    OBS1: utilize toString
    5 - Atividade 1: faça um for melhorado, encontre a mariana e troque seu nome para mariana_transgenica;
    6 - Atividade 2: faça um for melhorado, encontre a aline e a remova da lista/conjunto;
    7 - Atividade 3: faça um for contador, encontre a priscila e a remova da lista/conjunto
    8 - Adicione as 3 pessoas restantes: mayla, patrica e camila e refaça o teste.
    9 - Utilize o iterator (com for ou while) e refaça o teste.
    */
    
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList();
        
        Pessoa p1 = new Pessoa();
        p1.setNome("eduardo");
        
        Pessoa p2 = new Pessoa();
        p2.setNome("mayla");
        
        Pessoa p3 = new Pessoa();
        p3.setNome("mariana");
        
        Pessoa p4 = new Pessoa();
        p4.setNome("patricia");
        
        Pessoa p5 = new Pessoa();
        p5.setNome("priscila");
        
        Pessoa p6 = new Pessoa();
        p6.setNome("aline");
                
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3); //este
        
        pessoas.add(p4); 
        pessoas.add(p5); //este
        pessoas.add(p6); //este
        
        
        /*
        ORDEM DAS TAREFAS
        1 - deixe a coleção com 3 elementos e execute o primeiro bloco de código
        2 - deixe a coleção com 6 elementos e execute o primeiro bloco de código
        3 - deixe a coleção com 6 elementos e execute o segundo bloco de código
        */
        
        /*
        System.out.println("for antes alteração:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        for (Pessoa pessoa : pessoas) {
            if ("mariana".equals(pessoa.getNome())) {
                pessoa.setNome("mariana_transgênica");
            }
        }
        System.out.println("\nfor depois alteração:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        
        System.out.println("\n\n-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("for antes da remoção com for-each:");
        for (Pessoa pessoa : pessoas) {
            if ("mayla".equals(pessoa.getNome())) {
                //pessoa.remove(); não existe
                pessoas.remove(pessoa);
                
            }
        }
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        System.out.println("\nfor antes da remoção com índice:");
        for (int i = 0; i < pessoas.size(); i++) {
            String nomeTemp = pessoas.get(i).getNome();
            if ("eduardo".equals(nomeTemp)) {
                pessoas.remove(i);
            }
        }
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        */
        
        
        
        //To safely remove from a collection while iterating over it you should use an Iterator.
        System.out.println("for antes alteração:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        //MESMO COMPORTAMENTO FOR e WHILE
        for (Iterator<Pessoa> iterator = pessoas.iterator(); iterator.hasNext();) {
            Pessoa next = iterator.next();
            if ("mariana".equals(next.getNome())) {
                next.setNome("mariana_transgênica");
            }
        }
        System.out.println("\nfor depois alteração:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        
        System.out.println("\n\n-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("for antes da remoção com for-each:");
        //MESMO COMPORTAMENTO FOR e WHILE
        Iterator<Pessoa> it = pessoas.iterator();
        while (it.hasNext()) {
            Pessoa next = it.next();
            if ("priscila".equals(next.getNome())) {
                //pessoa.remove(); não existe
                it.remove();
            }
        }
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        
        
    }
}
