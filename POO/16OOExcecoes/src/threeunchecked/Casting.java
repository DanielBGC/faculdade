/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeunchecked;

/**
 *
 * @author EDYA
 */
public class Casting {
    public static void main(String[] args) {
        Pessoa5 p = (Pessoa5) metodo();
    }
    
    public static Object metodo(){
        return 10;
    }
}
