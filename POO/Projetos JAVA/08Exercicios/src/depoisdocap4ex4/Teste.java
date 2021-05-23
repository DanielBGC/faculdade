/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap4ex4;

/**
 *
 * @author eduardoasilvestre
 */
public class Teste {
    public static void main(String[] args) {
        Computador dell = new Computador();
        dell.nome = "dell";
        
   
        
        
        Computador vaio = new Computador();
        vaio.nome = "vaio";
        
        dell.enviaMensagem(vaio,"vamos no habibs tbm");
        dell.enviaMensagem(vaio, "comer um pastel de belém");
        
        vaio.enviaMensagem(dell, "oi, vamos no heraldo.");
        vaio.enviaMensagem(dell, "conhece o rei do hot dog ?");
        
        System.out.println("msg do computador " + dell.nome);
        System.out.println(dell.mensagensEnviadas);
        System.out.println(dell.mensagensRecebidas);
        
        System.out.println("msg do computador " + vaio.nome);
        System.out.println(vaio.mensagensEnviadas);
        System.out.println(vaio.mensagensRecebidas);
        
    }
           
}
