/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dexemploiniciartrabalho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDYA
 */
public class TissueDAORAM {
    static long ID = 1;
    
    private List<Tissue> tissues = new ArrayList<>();
    
    
    
    public int inserir(Tissue tissue) {
        if (tissue == null) {
            return -1;
        
        }
        tissue.setId(ID++);
        
        tissues.add(tissue);
        return (int) tissue.getId();
  }
    
    public List<Tissue> listarTodos() {
        return tissues;
    }/*
  
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
  }*/
}
