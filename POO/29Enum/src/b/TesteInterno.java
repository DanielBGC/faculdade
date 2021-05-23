/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

/**
 *
 * @author EDYA
 */
public class TesteInterno {
    public static void main(String args []) {
         System.out.println(MesNovo.JANEIRO);
         System.out.println(MesNovo.FEVEREIRO);
    }
   
    enum MesNovo {
	JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, 
       JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, 
       NOVEMBRO, DEZEMBRO
    }
}
