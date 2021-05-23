/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap6ex2;

/**
 *
 * @author eduardoasilvestre
 */
public class Teste {

    public static void main(String[] args) {
        //método getId não está static, mas pode ser colocado
        
        
        Conta c1 = new Conta();
        System.out.println(c1.getId());
        //resultado: 1

        Conta c2 = new Conta();
        System.out.println(c2.getId());
        //resultado: 2

        Conta c3 = new Conta();
        System.out.println(c3.getId());
        //resultado: 3

        System.out.println(c1.getId());
        //resultado: 1
    }
}
