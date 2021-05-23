package csimulacaodaolist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import csimulacaodaolist.Filmes;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author EDYA
 */
public class CRUD {
    Filmes filmes;
    public CRUD() {
        this.filmes = new Filmes(new ArrayList<Filme>());
        Filme filme = new Filme("a lagoa azul", LocalDate.of(1990, Month.MARCH, 20), BigDecimal.TEN);
        filme.setId(10);
        
        filmes.adiciona(filme);
        
        Filme f = filmes.encontraPorCodigo(10);
        System.out.println("nome do filme:" + f.getNome());
        
        
    }
    
    public static void main(String args[]) {
        new CRUD();
    
    }
}
