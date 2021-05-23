/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ainicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author EDYA
 */
public class AAJDBCExemplo {

    public static void main(String[] args) throws SQLException {
        //opcao 1
        /*
         Connection conexao = DriverManager.getConnection(
            "jdbc:mysql://localhost/fj21");
         System.out.println("Conectado!");
         conexao.close();
         */

        //opcao 2
        /*
         Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "root");
         System.out.println("Conectado!");
         conexao.close();
         */
        
        //opcao 3
        /* try (Connection conexao = DriverManager.getConnection(
                        "jdbc:mysql://localhost/fj21", "root", "root")) {
               System.out.println("Conectado!");
        }*/
        
        
        //opcao 4
        /*
        String stringDeConexao = 
        "jdbc:mysql://localhost/fj21?useSSL=false&useTimezone=true&serverTimezone=UTC";
        try (Connection conexao = DriverManager.getConnection(stringDeConexao, "root", "root")) {
            System.out.println("Conectado!");
        }
        */
        
        //opcao 5
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "root");
        properties.setProperty("useSSL", "false");
        properties.setProperty("useTimezone", "true");
        properties.setProperty("serverTimezone", "UTC");
        properties.setProperty("allowPublicKeyRetrieval","true");
        
        String con = "jdbc:mysql://localhost/fj21";
        try (Connection conexao = DriverManager.getConnection(con, properties)) {
            System.out.println("Conectado!");
        }
        
        //MySQL 06/05/2019
        //Com NetBeans 8.2 é necessário baixar a última versão do Driver no site do MySQL
        
        //ORACLE 06/05/2019
        /*
        //STRINGS DE CONEXÃO
        //driver ojdbc8.jar
        String myDB = "jdbc:oracle:thin:@localhost:1521:XE";
        */
        
        //SQL SERVER  06/05/2019
        /*
        //STRINGS DE CONEXÃO
        //driver 
        String myDB = 
        */

    }
}
