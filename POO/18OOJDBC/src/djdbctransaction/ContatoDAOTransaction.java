/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djdbctransaction;

import ainicio.ConnectionFactory;
import ccrudjava8.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * http://docs.oracle.com/javase/tutorial/jdbc/basics/transactions.html
 * https://www.mkyong.com/jdbc/jdbc-transaction-example/
 * https://stackoverflow.com/questions/4940648/how-to-start-a-transaction-in-jdbc
 * https://www.tutorialspoint.com/jdbc/jdbc-transactions.htm
 * https://stackoverflow.com/questions/15761791/transaction-rollback-on-sqlexception-using-new-try-with-resources-block
 * https://stackoverflow.com/questions/9260159/java-7-automatic-resource-management-jdbc-try-with-resources-statement
 * https://stackoverflow.com/questions/8066501/how-should-i-use-try-with-resources-with-jdbc
 */
public class ContatoDAOTransaction {

    public void adicionaEAltera(Contato elemento, String novoEndereco) {
        String insert = "insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)";
        String update = "update contatos set endereco = ? where id = ?";
        //1 faça o teste sem nenhum problema e veja que foi INSERIDO  e ALTERADO no banco
        //2 faça o teste com INSERT e UPDATE (endereco1 ao invés de endereco => erro)
        try (Connection connection = new ConnectionFactory().getConnection()) {
            connection.setAutoCommit(false);
            try (PreparedStatement preparedInsert = connection.prepareStatement(insert);
                 PreparedStatement preparedUpdate = connection.prepareStatement(update)) {
                
                preparedInsert.setString(1, elemento.getNome());
                preparedInsert.setString(2, elemento.getEmail());
                preparedInsert.setString(3, elemento.getEndereco());
                preparedInsert.setDate(4, java.sql.Date.valueOf(elemento.getDataNascimento()));

                preparedInsert.execute();

                preparedUpdate.setString(1, novoEndereco);
                preparedUpdate.setLong(2, 62);
                
                preparedUpdate.execute();

                connection.commit();
                
                System.out.println("Elemento inserido com sucesso.");
            } catch (SQLException e) {
                connection.rollback();
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
