/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

/**
 *
 * @author EDYA
 */
public class Exemplo7 {
    public static void main(String[] args) {
        //EXERCÍCIO DESCRITO EM LUGAR ESPECÍFICO        
        
        //alternativa 1: ler o dia, depois o mês, depois o ano
        
        //alternativa 2: fazer um laço e pegar as últimas 4 posições
        String idade1 = "21/11/1996";
        String ano1="";
        for(int i=6; i < idade1.length(); i++) {
            ano1 += idade1.charAt(i) + "";
        }
        System.out.println("ANO1: " + ano1);
        
        //alternativa 3: utilizar charAt
        String idade2 = "21/11/1996";
        String ano2 = idade2.charAt(6) + "" + idade2.charAt(7); //...
        System.out.println("ANO2: " + ano2);
        
        //alternativa 4: utilizar split
        String idade3 = "21/11/1996";
        String array[] = idade3.split("/");
        System.out.println("ANO3: " + array[2]);
        
        //alternativa 5: substring
        String idade4 = "21/11/1996";
        String ano4 = idade4.substring(6, idade4.length());
        System.out.println("ANO4: " + ano4);
        
        
    }

}
