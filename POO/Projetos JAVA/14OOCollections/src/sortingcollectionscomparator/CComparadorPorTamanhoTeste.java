/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingcollectionscomparator;

import acollections.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author EDYA
 */
public class CComparadorPorTamanhoTeste {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Sérgio");
        lista.add("Paulo");
        lista.add("Guilherme");
        Collections.sort(lista);
        // invocando o sort passando o comparador
        CComparadorPorTamanho comparador = new CComparadorPorTamanho();
        Collections.sort(lista, comparador);
        System.out.println(lista);
    }
    
}
