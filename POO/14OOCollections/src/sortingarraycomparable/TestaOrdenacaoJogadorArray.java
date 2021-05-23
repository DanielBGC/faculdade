/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingarraycomparable;


import java.util.Arrays;

import java.util.Comparator;


/**
 *
 * @author EDYA
 */
public class TestaOrdenacaoJogadorArray {

    public static void main(String[] args) {
        Jogador j1 = new Jogador("Romulo", 45);
        Jogador j2 = new Jogador("Sandro", 40);
        Jogador j3 = new Jogador("Artur", 50);
        Jogador j4 = new Jogador("Fabricio", 23);
        Jogador j5 = new Jogador("Bruno", 44);
        Jogador j6 = new Jogador("Fernando", 1);

        Jogador[] jogadores = new Jogador[6];
        jogadores[0] = j1;
        jogadores[1] = j2;
        jogadores[2] = j3;
        jogadores[3] = j4;
        jogadores[4] = j5;
        jogadores[5] = j6;
        
        System.out.println("Antes da ordenação...");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
                
        Arrays.sort(jogadores);

        System.out.println("Depois da ordenação...");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }
}
