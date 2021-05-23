/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrudjava8;


import ainicio.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class EmpresaDAO {
     
        //DESCRIÇÃO
    //adição simples (sem retorno de id ou objeto) java 8
    public Empresa adiciona(Empresa elemento) {
        String sql = "insert into empresa "
                + "(nome,idcontatofk)" + " values (?,?)";

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1, elemento.getNome());
            stmt.setLong(2, elemento.getContato().getId());
            
            stmt.execute();
            
            System.out.println("Elemento inserido com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //na verdade deveria retornar o elemento que foi inserido agora
        return elemento;
    }
   
    
    //DESCRIÇÃO
    //lista de todos os elementos sem algum critério
    public List<Empresa> lista(Empresa elemento) {
        String sql = "select * from empresa";
        ContatoDAO contatoDAO = new ContatoDAO();
        List<Empresa> empresas = new ArrayList<>();

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                long idcontato = rs.getLong("idcontatofk");
                
                Contato contato = contatoDAO.buscaPorCriterioAlternativa1(idcontato);
                
                Empresa empresa = new Empresa();
                empresa.setId(id);
                empresa.setNome(nome);
                empresa.setContato(contato);
                        
                empresas.add(empresa);
            }
        } catch (SQLException e) {
             throw new RuntimeException(e);
        }
        return empresas;
    }
}
