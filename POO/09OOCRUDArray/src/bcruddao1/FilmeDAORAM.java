/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcruddao1;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author EDYA
 */
public class FilmeDAORAM {
    //http://www.oracle.com/technetwork/java/dataaccessobject-138824.html

    //simular uma classe que faz operações no banco de dados

    private Filme[] filmes = new Filme[5]; //simulação do banco de dados
    //
    Object ar[] = new Object[10];
    private int contador = 0;
    
    FilmeDAORAM() {
        Filme f1 = new Filme("jason no massacre", LocalDate.now(), new BigDecimal("5.0"));
        Filme f2 = new Filme("crepusculo", LocalDate.now(), new BigDecimal("6.0"));
        Filme f3 = new Filme("frozen", LocalDate.now(), new BigDecimal("7.0"));
        
        this.inserir(f1);
        this.inserir(f2);
        this.inserir(f3);
        
    }
    
    public Filme buscarFilme(String nome) {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null && filmes[i].getTitulo().equals(nome)) {
                return filmes[i];

            }
        }
        return null;
    }

    public int inserir(Filme f) {
        f.setId(contador++);

        int posicaoLivre = proximaPosicaoLivre();
        if (posicaoLivre == -1) {
            return -1;
        }
        filmes[posicaoLivre] = f;
        return (int) f.getId();
    }

    public void listar() {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null) {
                System.out.println(filmes[i]);
            }
        }
    }

    public boolean delete(Filme f) {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null && filmes[i].getId() == f.getId()) {
                filmes[i] = null;
                return true;

            }
        }
        return false;
    }
    
    public boolean update(Filme f) {
        return false;
    }
    
    private int proximaPosicaoLivre() {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    /*
  public int insertCustomer(...) {
    // Implement insert customer here.
    // Return newly created customer number
    // or a -1 on error
  }
  
  public boolean deleteCustomer(...) {
    // Implement delete customer here
    // Return true on success, false on failure
  }

  public Customer findCustomer(...) {
    // Implement find a customer here using supplied
    // argument values as search criteria
    // Return a Transfer Object if found,
    // return null on error or if not found
  }

  public boolean updateCustomer(...) {
    // implement update record here using data
    // from the customerData Transfer Object
    // Return true on success, false on failure or
    // error
  }

  public RowSet selectCustomersRS(...) {
    // implement search customers here using the
    // supplied criteria.
    // Return a RowSet. 
  }

  public Collection selectCustomersTO(...) {
    // implement search customers here using the
    // supplied criteria.
    // Alternatively, implement to return a Collection 
    // of Transfer Objects.
  }
    */
}
