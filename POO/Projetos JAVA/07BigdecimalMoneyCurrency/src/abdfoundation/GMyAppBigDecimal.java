/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdfoundation;

import java.math.BigDecimal;

/**
 *
 * @author EDYA
 */
public class GMyAppBigDecimal {

    public static void main(String[] args) {
        /*
             este não faz nenhum tipo de arredondamento por si próprio, ou seja,
             você precisa especificar como deseja arredondar determinado valor se
             for necessário
         */
        System.out.println("Divide");
        System.out.println(new BigDecimal("1.00").divide(new BigDecimal("1.3")));

    }
}
