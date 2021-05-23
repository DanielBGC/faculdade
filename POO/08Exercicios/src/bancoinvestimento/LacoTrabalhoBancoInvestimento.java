/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoinvestimento;

/**
 *
 * @author eduardoasilvestre
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author eduardoasilvestre
 */
public class LacoTrabalhoBancoInvestimento {
    LocalDate hoje = LocalDate.of(2017, Month.JULY, 1);
    
 
    public LacoTrabalhoBancoInvestimento() {
     incrementaDias();
 }
    public static void main(String[] args) {
        new LacoTrabalhoBancoInvestimento();
    }
    
    private void incrementaDias() {
        int valor = 30;
        
        
        LocalDate antiga = hoje;        
        hoje =  hoje.plusDays(30);
        
        
        imprimeData(antiga);
        imprimeData(hoje);
        System.out.println("\n");
        
        String [] arrayExemplo = new String[10];
        
        calculaJurosCP(antiga, hoje, arrayExemplo);
        
    
    }

    private void calculaJurosCP(LocalDate antiga, LocalDate hoje, String[] arrayExemplo) {
        LocalDate antigaAux = antiga;
        
        while(antigaAux.isBefore(hoje) || antigaAux.isEqual(hoje)) { //ouwhile(!antigaAux.isEqual(hoje)) {
            
            for (int i = 0; i < arrayExemplo.length; i++) {
                //if (arrayExemplo[i] != null) {
                    //int diaCorrente = 10; //só para compilar
                    //int diaDeposito = 20;
                    
                    
                    int diaCorrente =  antigaAux.getDayOfMonth();
                    int diaDeposito = 30;//só para compilar;
                    //na verdade seria
                    //int diaDeposito = arrayExemplo[i].getDataDeposito().getDayOfMonth()
                   
                    if(diaCorrente == diaDeposito) {
                     //agora tem juros   
                     System.out.println("TESTE");
                    }
                
                
                //}
                
            }
            imprimeData(antigaAux);
            imprimeData(hoje);
            System.out.println("\n");
           antigaAux = antigaAux.plusDays(1);
            
        }
    }
    
    void imprimeData(LocalDate data) {
            
            System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
