/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author EDYA
 */
public class TestadoraEnum2 {

    public static void main(String[] args) {
        DMarcasEnum hp = DMarcasEnum.HP;
        DMarcasEnum samsung = DMarcasEnum.SAMSUNG;
                
        System.out.println("Nome da Marca = " + hp.name());
        System.out.println("Nome da Marca = " + samsung.name());
        
        System.out.println("\nOrdinal = " + hp.ordinal());
        System.out.println("Ordinal = " + samsung.ordinal());
        
        System.out.println("\nValueOf = " + DMarcasEnum.valueOf("HP"));
        System.out.println("ValueOf = " + DMarcasEnum.valueOf("SAMSUNG"));
        
        System.out.println("\ntoString = " + hp.toString());
        System.out.println("toString = " + samsung.toString());
        
        System.out.println("\nNome da Marca = " + hp.compareTo(hp));
        System.out.println("Nome da Marca = " + hp.compareTo(samsung));
        System.out.println("Nome da Marca = " + samsung.compareTo(hp));
        System.out.println("Nome da Marca = " + samsung.compareTo(samsung));
    }
}
