/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aencapsulamento;


/**
 *
 * @author EDYA
 */
public class BClienteTesteValidaCPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BCliente p = new BCliente();
       
       //descomentar para testes
       //p.cpf = "11416107797";
       p.mudaCPF("11416107797"); //cpf correto
       p.mudaCPF("11416107799"); //cpf incorreto
      
     }
}
