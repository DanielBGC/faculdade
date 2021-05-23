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
public class UsuarioDAORAM {
    //http://www.oracle.com/technetwork/java/dataaccessobject-138824.html

    private Usuario[] usuarios = new Usuario[10];

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public UsuarioDAORAM() {
        Usuario chair = new Usuario();
        chair.setTipo("CHAIR");
        this.inserir(chair);

        Usuario eu = new Usuario();
        eu.setTipo("USUARIO");
        this.inserir(eu);

    }

    public int inserir(Usuario f) {
        int posicaoLivre = proximaPosicaoLivre();
        if (posicaoLivre == -1) {
            return -1;
        }
        usuarios[posicaoLivre] = f;
        return (int) f.getId();
    }

    public void listar() {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                System.out.println(usuarios[i]);
            }
        }
    }

    public boolean delete(Filme f) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null && usuarios[i].getId() == f.getId()) {
                usuarios[i] = null;
                return true;

            }
        }
        return false;
    }

    public boolean update(Usuario f) {
        return false;
    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
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
