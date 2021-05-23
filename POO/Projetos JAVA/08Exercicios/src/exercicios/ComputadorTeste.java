/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author EDYA
 */
public class ComputadorTeste {

    public static void main(String[] args) {
        Computador c1 = new Computador();
        c1.modelo = "2080";
        c1.marca = "ASUS";

        Computador c2 = new Computador();
        c2.modelo = "VOSTRO 1000";
        c2.marca = "DELL";

        c1.enviaMensagem(c2, "E aí DELL ? Sou o PC da moda agora.");

        c1.enviaMensagem(c2, "Você já é passado.");

        c1.enviaMensagem(c2, "Diria uma quinquilharia.");

        c2.enviaMensagem(c1, "Tá tirando em maluco ???\nContinuo na crista da onda");

        c2.mostraMensagens();

        c1.mostraMensagens();
    }
}
