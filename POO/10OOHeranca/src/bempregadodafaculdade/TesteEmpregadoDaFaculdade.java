/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bempregadodafaculdade;

/**
 *
 * @author EDYA
 */
public class TesteEmpregadoDaFaculdade {
    public static void main(String args[]) {
        
    EmpregadoDaFaculdade empregadoDaFaculdade = new EmpregadoDaFaculdade();
    empregadoDaFaculdade.setNome("Joao");
    empregadoDaFaculdade.setSalario(2000);
    
    ProfessorDaFaculdade professorDaFaculdade = new ProfessorDaFaculdade();
    professorDaFaculdade.setNome("Hugo");
    professorDaFaculdade.setSalario(40000);
    professorDaFaculdade.horasDeAula = 20;
    
    Reitor reitor = new Reitor();
    reitor.setNome("Roberto Gil");
    reitor.setSalario(50000);
    
    Terceirizado terceirizado1 = new Terceirizado();
    terceirizado1.setNome("vandair");
    
    Terceirizado terceirizado2 = new Terceirizado();
    terceirizado2.setNome("cicero");
    
    Terceirizado terceirizado3 = new Terceirizado();
    terceirizado3.setNome("zuma");
    
    GeradorDeRelatorio geradorDeRelatorio = new GeradorDeRelatorio();
    
    geradorDeRelatorio.adiciona(terceirizado1);
    geradorDeRelatorio.adiciona(terceirizado2);
    geradorDeRelatorio.adiciona(terceirizado3);
    
    geradorDeRelatorio.adiciona(empregadoDaFaculdade);
    
    geradorDeRelatorio.adiciona(professorDaFaculdade);
    
    geradorDeRelatorio.adiciona(reitor);
    }
}
