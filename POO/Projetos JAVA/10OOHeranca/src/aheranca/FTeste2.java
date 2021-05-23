/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aheranca;

/**
 *
 * @author eduardoasilvestre
 */
public class FTeste2 {
    public FTeste2() {
    metodo();
        
    }
    
    
    public static void main(String[] args) {
        new FTeste2();
        
    }

    private void metodo() {
        FControleDeBonificacoes bonificacoes = new FControleDeBonificacoes();
        
        
        FFuncionario funcionario = new FFuncionario();
        funcionario.salario = 1000;
        
        bonificacoes.registra(funcionario);
        
        FAjudanteDeProgramador deProgramador = new FAjudanteDeProgramador();
        deProgramador.salario = 8000;
        
        bonificacoes.registra(deProgramador);
        
        FProgramador programador = new FProgramador();
        programador.salario = 18000;
        
        bonificacoes.registra(programador);
        
        
        FEstagiario estagiario = new FEstagiario();
        estagiario.salario = 350;
        
        bonificacoes.registra(estagiario);
        
        
        
        System.out.println(bonificacoes.getTotalDeBonificacoes());
            
        
    
    }
    
    
}
