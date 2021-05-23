/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daodesignpattern;
import java.util.List;
/**
 *
 * @author EDYA
 */
public interface DAO <T> {

	public T adiciona(T elemento);

	public List<T> lista(T elemento);

	public T altera(T elemento);

	public T exclui(T elemento);
    
}
