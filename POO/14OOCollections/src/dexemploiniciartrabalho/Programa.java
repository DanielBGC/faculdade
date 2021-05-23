/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dexemploiniciartrabalho;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class Programa {
    public Programa () {
    
        
        TissueDAORAM tissueDAO = new TissueDAORAM();
        int opcaoDoUsuario = 0;
        do {
        opcaoDoUsuario = this.menu();
        
            switch(opcaoDoUsuario) {
                case 1 : 
                    
                    Tissue tissue = this.recebeTecido();
                    
                    int id = tissueDAO.inserir(tissue);
                    
                    
                    System.out.println("ola");
                    break;
                    
                case 2 : 
                    //listar tecidos
                    
                    break;


            }
        
        } while(opcaoDoUsuario != 0);
    
    
    }
    
   public static void main(String args[]) {
       new Programa();
   
   }

    private int menu() {
        StringBuilder builder = new StringBuilder();
        builder.append("0 - sair");
        builder.append("\n1 - cadastrar tecido");
        builder.append("\n2 - listar tecidos");
        builder.append("\n\nDiite sua opçção deseada");
        System.out.println(builder.toString());
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
        
    }

    private Tissue recebeTecido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o nome do tecido:");
        
        String nomeTecido = scanner.nextLine();
        
        Tissue tissue = new Tissue();
        tissue.setNome(nomeTecido);
        tissue.setCor("blue marinho");
        tissue.setDataCriacao(LocalDateTime.now());
        tissue.setDataModificacao(LocalDateTime.now());
        tissue.setPreco(new BigDecimal(30));
        tissue.setTextura("poliéster");
        
        
        return tissue;
    }
          
}
