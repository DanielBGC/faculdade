/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleremoto;

/**
 *
 * @author EDYA
 */
public class TVSamsumg {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemotoDuduCorporation();
        
        controle.ligar();
        controle.trocarCanal(2);
        controle.desligar();
        

    }
}
