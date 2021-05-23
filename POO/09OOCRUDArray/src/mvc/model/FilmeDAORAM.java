/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;


/**
 *
 * @author EDYA
 */
public class FilmeDAORAM {
    //http://www.oracle.com/technetwork/java/dataaccessobject-138824.html
    public FilmeDAORAM() {
        Filme f1 = new Filme();
        this.inserir(f1);
        Filme f2 = new Filme();
        this.inserir(f2);
    }
        
   private Filme[] filmes = new Filme[5]; //simulação do banco de dados

    public Filme[] getFilmes() {
        return filmes;
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
    
    public boolean update(Filme f, long id) {
        for (int i = 0; i < filmes.length; i++) {
            Filme filme = filmes[i];
            if (filme != null && filme.getId() == id) {
                if (f.getTitulo() != null) {
                    filme.setTitulo(f.getTitulo());
                }
                if (f.getValor() != null) {
                    filme.setValor(f.getValor());
                }
                if (f.getDataLancamento() != null) {
                    filme.setDataLancamento(f.getDataLancamento());
                }
                return true;
            }
        }
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
    
    public void metodoQualquerUsaUsuarios1(UsuarioDAORAM usuarioDAORAM) {
    
    
    }
    public void metodoQualquerUsaUsuarios2(Usuario [] usuarios) {
    
    
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
