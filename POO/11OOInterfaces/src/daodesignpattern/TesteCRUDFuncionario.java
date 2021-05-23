/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daodesignpattern;

/**
 *
 * @author EDYA
 */
public class TesteCRUDFuncionario {
    public static void main(String args[]) {
        CRUDFuncionario cRUDFuncionarioMySQL = new CRUDFuncionarioMySQL();
        //CRUDFuncionario cRUDFuncionarioMySQL = new CRUDFuncionarioORACLE();
        
        
        cRUDFuncionarioMySQL.adiciona(null);
        cRUDFuncionarioMySQL.exclui(null);
        
        //E, se depois de um tempo resolverem trocar o banco para ORACLE ?
    }
}
