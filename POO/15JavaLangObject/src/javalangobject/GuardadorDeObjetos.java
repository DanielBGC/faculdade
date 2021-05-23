/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalangobject;

/**
 *
 * @author EDYA
 */
public class GuardadorDeObjetos {
    

    private Object[] arrayDeObjetos = new Object[100];
    private int posicao = 0;

    public void adicionaObjeto(Object object) {
        this.arrayDeObjetos[this.posicao] = object;
        this.posicao++;
    }

    public Object pegaObjeto(int indice) {
        return this.arrayDeObjetos[indice];
    }
}
