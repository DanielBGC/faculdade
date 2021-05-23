/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



/**
 *
 * @author EDYA
 */
public class ACollectionsListSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List nomes = new ArrayList<>();
        nomes.add("Eduardo");
        nomes.add("Norayane");
        nomes.add(1);
        nomes.add("Norayane");
        nomes.add("Norayane");
        nomes.add(2l);
        nomes.add(new Cliente("joao"));
        
        
        System.out.println("nome " + nomes.get(0));      
        System.out.println("nome " + nomes.get(1)); 
        
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("nome " + nomes.get(i)); 
        }
        
        for (Object nome : nomes) {
            System.out.println(nome);
        }
        
        
        ////////////////////////////////////////////////////////////////////////////////////
        //java 5: list com generics
        List<Pessoa> pessoas = new ArrayList();
        
        Pessoa p1 = new Pessoa();
        p1.setNome("eduardo");
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
                
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        
        Pessoa p = pessoas.get(0);
        
        for(Pessoa pesso : pessoas) {
            System.out.println(pesso.getNome());
            pesso.getCpf();
            pesso.getIdade();
        
        }
        
        ////////////////////////////////////////////////////////////////////////////////////
        List<String> lista = new ArrayList<>();
        lista.add("Sérgio");
        lista.add("Paulo");
        lista.add("Guilherme");
        // repare que o toString de ArrayList foi sobrescrito:
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        
        ListIterator<String> li =  lista.listIterator();
        while (li.hasNext()) {
            String next = li.next();
            System.out.println(next);
            //System.out.println(li.previous());
            
        }
        
        
        ////////////////////////////////////////////////////////////////////////////////////
        Set<String> cargos = new HashSet<>();
        cargos.add("Gerente");
        cargos.add("Diretor");
        cargos.add("Presidente");
        cargos.add("Secretária");
        cargos.add("Funcionário");
        cargos.add("Diretor"); // repetido!
        // imprime na tela todos os elementos
        System.out.println(cargos);
        
        
        
        System.out.println("utilização do set");
        for (String n : cargos) {
            System.out.println(n);
        }
        ////////////////////////////////////////////////////////////////////////////////////
        Set<String> conjunto = new HashSet<>();
        conjunto.add("item 1");
        conjunto.add("item 2");
        conjunto.add("item 3");
        
        
        // retorna o iterator
        Iterator<String> i = conjunto.iterator();
        while (i.hasNext()) {
            // recebe a palavra
            String palavra = i.next();
            System.out.println(palavra);
        }
        
        
    }
}
