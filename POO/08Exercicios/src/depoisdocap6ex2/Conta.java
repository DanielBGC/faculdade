/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap6ex2;

/**
 *
 * @author eduardoasilvestre
 */
public class Conta {
    
    private static long serial; //pertence a classe e não ao objeto
    private long id;
    public Conta() {
        //Conta.serial = Conta.serial + 1;
        this.id = ++Conta.serial;
    }

    public  long getId() {
        return id;
    }

}
