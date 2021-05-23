/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalangobject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDYA
 */
public class Wrappers {
    public static void main(String[] args) {

        String nome = "joao";
        nome += " jose ";
        nome += "maria";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        nome += "sebastiana";
        
        StringBuilder builder = new StringBuilder();
        builder.append("sebastiana ");
        builder.append(" maria");
        
        builder.toString();
        
        String palavra = "fj11";
        String retorno = palavra.toUpperCase();
        System.out.println(retorno);
        System.out.println(palavra);
        
        
        String frase = "java é demais";
        String palavras[] = frase.split(" ");
        
        System.out.println(palavras[0]);
        System.out.println(palavras[1]);
        System.out.println(palavras[2]);
        
        
        String palavra2 = "fj11";
        palavra2 = palavra2.toUpperCase();
        palavra2 = palavra2.replace("1", "2");
        System.out.println(palavra2);
        
        byte b;
        Byte b1;
        
        long l;
        Long l1;
        
        boolean o;
        Boolean o1;

        int z;
        Integer z1;
        
        double a;
        Double a1;
        
        char c;
        Character d;
        
        float f;
        Float e;
        
        System.out.println(Math.PI);
        
        int x =  (int)(100 * Math.random());
        
        System.out.println(x);
        
    }
}
