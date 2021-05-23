/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipacoteabstrato;

/**
 *
 * @author EDYA
 */
public abstract class FiguraGeometrica {
    
    private String nome;
    public void setNome(String nome)  {
        this.nome = nome;
        
    }
    public String getNome(){
        return this.nome;
    }
    
    public abstract double  calculaArea();
}
