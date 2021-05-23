/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dserializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author EDYA
 */
public class BWriteObject {
	public static void main (String args[]) {
	
	 /*
	 * Criamos o objeto Address na memória e setamos os valores
	 * de seus atributos
	 * */
	   BAddress address = new BAddress();
	   address.setStreet("RUA LEOPOLDINO");
	   address.setCountry("BRASIL");
	   ///////////////////////////////////////////////
 
	   try{
		
		/*
		 * A Classe FileOutputStream é responsável por criar
		 * o arquivo fisicamente no disco, assim poderemos realizar a 
		 * escrita neste. 
		 * */
		FileOutputStream fout = new FileOutputStream("src/files/address.ser");
		
		/*
		 * A Classe ObjectOutputStream escreve os objetos no FileOutputStream
		 * */
		ObjectOutputStream oos = new ObjectOutputStream(fout);   
		
		/*
		 * Veja aqui a mágica ocorrendo: Estamos gravando um objeto 
		 * do tipo Address no arquivo address.ser. Atenção: O nosso 
		 * objeto Address que está sendo gravado, já é gravado de forma 
		 * serializada
		 * */
		oos.writeObject(address);
		
		oos.close();
		System.out.println("Done");
 
	   }catch(Exception ex){
		   ex.printStackTrace();
	   } 
	}
}
