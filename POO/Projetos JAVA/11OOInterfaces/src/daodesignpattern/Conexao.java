/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daodesignpattern;

import java.sql.Connection;

/**
 *
 * @author EDYA
 */
public interface Conexao {
    Connection getConnection();
}
