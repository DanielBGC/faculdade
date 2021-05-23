/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acollections;

import java.util.Properties;

/**
 *
 * @author EDYA
 */
public class FProperties {

    public static void main(String[] args) {
        Properties config = new Properties();
        config.setProperty("database.login", "scott");
        config.setProperty("database.password", "tiger");
        config.setProperty("database.url", "jdbc:mysql:/localhost/teste");
        
        // muitas linhas depois...
        
        String login = config.getProperty("database.login");
        String password = config.getProperty("database.password");
        String url = config.getProperty("database.url");

        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
        System.out.println("URL: " + url);

    }
}
