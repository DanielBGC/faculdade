package beansuteis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Está classe é minha. Estou em 10/04/2017 !!!!
 * @author EDUARDO
 * 
 */
public class Amarok extends Carro {
    
    /**
    * Este método retorna o valor agregado do carro AMAROK
    * @author AUGUSTO
    * @since  14/09/2015
    * @return um double que representa o valor agregado
    */
    @Override
    public double getValorAgregado() {
        return (getValor() * getAno()) - 1000;
    
    }
    public static void main(String[] args) {
        System.out.println(0 % 3);
        System.out.println(1 % 3);
        System.out.println(2 % 3);
    }
    
}
