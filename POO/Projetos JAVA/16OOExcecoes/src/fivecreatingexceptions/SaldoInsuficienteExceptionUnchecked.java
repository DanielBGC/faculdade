/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecreatingexceptions;

/**
 *
 * @author EDYA
 */
public class SaldoInsuficienteExceptionUnchecked extends RuntimeException {
    SaldoInsuficienteExceptionUnchecked(String message) {
        super(message);
    }
}
