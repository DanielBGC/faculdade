/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author EDYA
 */
public class Pessoa {
    private TipoPessoa tipo;

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }
    
    enum TipoPessoa {
        MORADOR_COMUM, SINDICO, FUNCIONARIO
    }
    
}
