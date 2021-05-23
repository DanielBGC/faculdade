/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catributosdeclasse;

/**
 *
 * @author EDYA
 */
public class BContaTeste {
    public static String nome = "Eduardo";
    public static void main(String[] args) {
        //ALTERNATIVA A: preciso criar um objeto para usar a variável
        //(mas a variável é da classe e não do objeto)   
        
        BConta conta1 = new BConta();
        int total1 = conta1.getTotalDeContas();
        System.out.println("Total 1: " + total1);
        
        BConta conta2 = new BConta();
        int total2 = conta2.getTotalDeContas();
        System.out.println("Total 2: " + total2);
        
        //ALTERNATIVA B (descomentar aqui e outra classe)
        /*
        int total2 = BConta.getTotalDeContas();
        System.out.println("Total 2: " + total2);
        
        BConta bconta = new BConta();
        total2 = BConta.getTotalDeContas();
        System.out.println("Total 2: " + total2);
        */
    }
}
