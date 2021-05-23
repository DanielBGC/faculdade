/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixjava7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author EDYA
 */
public class BDemoNovoTryJDBC {
//http://blog.globalcode.com.br/2011/10/o-novo-try-no-java-7-por-uma-linguagem.html
//http://tutorials.jenkov.com/java-exception-handling/try-with-resources.html

    public static void main(String[] args) throws SQLException, Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "select nome, cpf from clientes";
        String urlDB = "jdbc:mysql://localhost:3306/testdb";

        try (Connection con = DriverManager.getConnection(urlDB, "user", "user");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");

                System.out.printf("Nome:%s\t Cpf:%s %n", nome, cpf);
            }
        }
    }
}
