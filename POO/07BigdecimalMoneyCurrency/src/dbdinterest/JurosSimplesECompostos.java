/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdinterest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
//LIBRARY
//http://www.devmedia.com.br/java-bigdecimal-trabalhando-com-mais-precisao/30286
//https://www.journaldev.com/16409/java-bigdecimal
//https://www.concretepage.com/java/java-bigdecimal-tutorial-with-example
//http://www.javaworld.com/article/2075315/core-java/make-cents-with-bigdecimal.html
//http://www.stichlberger.com/software/java-bigdecimal-gotchas/#codesyntax_11
//https://agorandroid.blogspot.com/2012/04/java-valores-monetarios-float-double-e.html

public class JurosSimplesECompostos {
    /**
     * JUROS SIMPLES
     * https://www.somatematica.com.br/emedio/finan2.php 
     *
     * ABREVIAÇÕES:
     * J = juros
     * P = principal (capital)
     * i = taxa de juros
     * n = número de períodos
     * M = montante
     * JUROS => J = P . i . n
     * MONTANTE => M = P . ( 1 + ( i . n ) )
     */
    public BigDecimal calcularMontanteJuroSimples(BigDecimal capital, BigDecimal taxa, int tempo) {
        return capital.add(capital.multiply(taxa).multiply(new BigDecimal(tempo)));
    }
    public BigDecimal calcularJuroSimples(BigDecimal capital, BigDecimal taxa, int tempo) {
        return capital.multiply(taxa).multiply(new BigDecimal(tempo));
    }
    
    /**
     * JUROS COMPOSTOS
     * https://www.somatematica.com.br/emedio/finan3.php
     *
     * ABREVIAÇÕES:
     * J = juros
     * P = principal (capital)
     * i = taxa de juros
     * n = número de períodos
     * M = montante
     * JUROS => J = M - P
     * MONTANTE => M = P . (1 +  i) ^n
     *
     */
    public BigDecimal calcularMontanteJuroComposto(BigDecimal capital, BigDecimal taxa, int tempo) {
        return capital.multiply(taxa.add(BigDecimal.ONE).pow(tempo));
    }
    public BigDecimal calcularJuroComposto(BigDecimal capital, BigDecimal taxa, int tempo) {
        return this.calcularMontanteJuroComposto(capital, taxa, tempo).subtract(capital);
    }


    public JurosSimplesECompostos() {
        //para usar esta classe é só chamar este construtor
    }
    
    public JurosSimplesECompostos(String teste) {
        this.teste();
    }

    public static void main(String[] args) {
        JurosSimplesECompostos j = new JurosSimplesECompostos("eduardo teste");
 
    }
    
   private void teste() {
        //2% (agosto 2020)
        //CP (juros ao mês) = 2/100, /12, /70% => 0,0011666666666667
        //CDI(juros ao mês) = 2/100, /12       => 0,0016666666666667
       
        //TAXA = CDI (ex) => CDI JULHO 2018 = 0,5422% =>0,5422 /100 = 0,005422
        BigDecimal c0 = new BigDecimal("100000");
        BigDecimal i = new BigDecimal("0.0011666666666667"); 
        int n = 1;
        
        Locale BRAZIL = new Locale("pt","BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(BRAZIL); 

        //TESTE JUROS SIMPLES
        BigDecimal juroSimples = this.calcularJuroSimples(c0, i, n);
        System.out.println("Juro simples: " + nf.format(juroSimples.doubleValue()));
        
        //TESTE MONTANTE JUROS SIMPLES
        BigDecimal montanteJuroSimples = this.calcularMontanteJuroSimples(c0, i, n);
        System.out.println("Montante juro simples: " + nf.format(montanteJuroSimples.doubleValue()));
        
        //TESTE JUROS COMPOSTOS
        BigDecimal juroCompostos = this.calcularJuroComposto(c0, i, n);
        System.out.println("\nJuro composto: " + nf.format(juroCompostos.doubleValue()));
        
        //TESTE MONTANTE JUROS COMPOSTOS
        BigDecimal montanteJuroCompostos = this.calcularMontanteJuroComposto(c0, i, n);
        System.out.println("Montante juro compostos: " + nf.format(montanteJuroCompostos.doubleValue()));
    }
}

 
