/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingcollectionscomparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author EDYA
 */
public class TestaSorting {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("joao");
        f1.setSalario(2000);
        f1.idade = 30;
        
        Funcionario f2 = new Funcionario();
        f2.setNome("maria");
        f2.setSalario(3000);
        f2.idade = 20;
        
        Funcionario f3 = new Funcionario();
        f3.setNome("josé");
        f3.setSalario(1000);
        f3.idade = 29;
        
        Funcionario f4 = new Funcionario();
        f4.setNome("sebastiao");
        f4.setSalario(2300);
        f4.idade = 50;
        
        Funcionario f5 = new Funcionario();
        f5.setNome("marcela");
        f5.setSalario(1200);
        f5.idade = 18;
                 
        //Collection<Funcionario> funcionarios = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);
        
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
        
        Collections.sort(funcionarios);
        
        System.out.println("\nSegunda impressão...");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
