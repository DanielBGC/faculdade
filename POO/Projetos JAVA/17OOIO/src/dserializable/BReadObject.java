/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dserializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author EDYA
 */
public class BReadObject {

 
   public static void main (String args[]) {
	   
	   /*
	    * Apenas criamos o objeto address sem instanciá-lo 
	    * pois pegaremos a instância do arquivo address.ser
	    * */
	   BAddress address;
 
	   try{
		   
		   /*
		    * Responsável por carregar o arquivo address.ser
		    * */
		   FileInputStream fin = new FileInputStream("src/files/address.ser");
		   
		   /*
		    * Responsável por ler o objeto referente ao arquivo
		    * */
		   ObjectInputStream ois = new ObjectInputStream(fin);
		   
		   /*
		    * Aqui a mágica é feita, onde os bytes presentes no arquivo address.ser
		    * são convertidos em uma instância de Address.
		    * */
		   address = (BAddress) ois.readObject();
		   ois.close();
 
		   System.out.println(address);
 
	   }catch(Exception ex){
		   ex.printStackTrace(); 
	   } 
   }
}
