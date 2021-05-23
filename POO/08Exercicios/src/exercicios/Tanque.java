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
public class Tanque {
    int volume;
    int gasolina;
    
    void abastecer(int quantidade) {
        if (this.gasolina + quantidade > this.volume) {
            this.gasolina = this.volume;
        } else {
            this.gasolina = this.gasolina + quantidade;
        }
    }
    
    boolean consumirGasolina(int quantidade) {
        if (this.gasolina - quantidade > 0) {
            this.gasolina -= quantidade;
            return true;
        } else {
        
        }
        return false;
    }
}
