/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barraylistXlinkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author EDYA
 */
public class Main {

    Main() {
        method1();

    }

    public static void main(String args[]) {
        new Main();

    }

    private void method1() {
        System.out.println("Iniciando...");
        //Collection<Integer> teste = new ArrayList<>();        
        Collection<Integer> teste = new HashSet<>();
        //Collection<Integer> teste = new LinkedList<>();
        
        long inicio = System.currentTimeMillis();
        int total = 3000000;
        
        long inicioInsercao = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.add(i);

        }
        long fimInsercao = System.currentTimeMillis();
        System.out.println("tempo de inserção: " + (fimInsercao - inicioInsercao));
        
        
        long inicioBusca = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long fimBusca = System.currentTimeMillis();
        System.out.println("tempo de busca: " + (fimBusca - inicioBusca));
        
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
    
  
}
