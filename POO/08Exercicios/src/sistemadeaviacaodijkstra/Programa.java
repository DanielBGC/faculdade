/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeaviacaodijkstra;

/**
 *
 * @author eduardoasilvestre
 */
public class Programa {
    public Programa() {
    String origem = "uberaba";
    String destino  = "paris";
    //forma de associar a cidade a um número
    
    RodaDijkstra roda = new RodaDijkstra();
    
        for (String cidade : roda.executa(0,2)) {
            System.out.println(cidade);
        }
        
        System.out.println("\n");
        
        for (String cidade : roda.executa(2,0)) {
            System.out.println(cidade);
        }
    
    }
    public static void main(String[] args) {
        new Programa();
    }
}
