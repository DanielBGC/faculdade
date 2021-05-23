/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author EDYA
 */
public class BCollectionsMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //CHAVE A UM VALOR
        //"MG" "MINAS GERAIS"
        //"SP" "SÃO PAULO"
        
        
        
        

        Map<String, String> map = new HashMap<>();
        map.put("MG", "MINAS GERAIS");
        map.put("SP", "SÃO PAULO");
        map.put("RJ", "RIO DE JANEIRO");
        map.put("MS", "MATO GROSSO DO SUL");
        map.get("MG"); //retorna o valor para a chave "MG"
        map.keySet(); //retorna as chaves
        map.values(); //retornas os valores do mapa
        
        Set<String> sets = map.keySet(); //chaves
        for (String a : sets ) {
            System.out.println(a);
        }
        for (Map.Entry<String, String> entrySet : map.entrySet()) {
            String key = entrySet.getKey(); //"MG"
            String value = entrySet.getValue(); //"MINAS GERAIS"
            System.out.println("Chave: " + key + " | Value:" + value);
        }
        /*
        String restult = map.get("RN");
        if (restult == null) {
            map.put("RN", "RIO GRANDE DO NORTE");
        }
        System.out.println(map.get("RN"));
        //CHECK SE EXISTE "RN", CASO NÃO EXISTA INSIRA NO MAPA E CHECK
        */
        ////////////////////////////////////////////////////////////////////////////////////
        Map<Integer, String> map2 = new HashMap<>();

        map2.put(1, "um");
        map2.put(2, "dois");
        System.out.println(map2.get(1));
        
       ////////////////////////////////////////////////////////////////////////////////////
        Map<String, List<Pessoa>> map3 = new HashMap<>();

        List<Pessoa> pessoasIFTM = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Eduardo");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Jefferson");

        pessoasIFTM.add(pessoa1);
        pessoasIFTM.add(pessoa2);

        map3.put("IFTM", pessoasIFTM);

        for (Map.Entry<String, List<Pessoa>> entrySet : map3.entrySet()) {
            String key = entrySet.getKey();
            List<Pessoa> value = entrySet.getValue();
            System.out.println("Pessoa do " + key + "\n");
            for (Pessoa pes : value) {
                System.out.println(key + "|" + pes.getNome());

            }

        }
    }
}
