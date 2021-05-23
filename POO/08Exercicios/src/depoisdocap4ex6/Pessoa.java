/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap4ex6;

/**
 *
 * @author eduardoasilvestre
 */
public class Pessoa {
    String nome;
    int peso;
    int idade;

    void dizerAlgo() {
        System.out.println("ola");
    }

    void mostraEstadoPessoa() {
        if (peso > 60) {
            System.out.println("gordinha");
        } else {

            System.out.println("magrinha");
        }
    }

    int pegaIdadeEm2019() {
        return (idade + 1);
    }
}
