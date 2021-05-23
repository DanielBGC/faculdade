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
public interface CRUDFuncionario {

	public abstract Funcionario adiciona(Funcionario elemento);

	public List<Funcionario> lista(Funcionario elemento);

	public Funcionario altera(Funcionario elemento);

	public Funcionario exclui(Funcionario elemento);
}
