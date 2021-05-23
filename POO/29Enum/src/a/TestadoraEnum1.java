/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author EDYA
 */
public class TestadoraEnum1 {

    public static void escolheOpcao(COpcoesMenu opcao) {
        if (opcao == COpcoesMenu.SALVAR) {
            System.out.println("Salvando o arquivo!");
        } else if (opcao == COpcoesMenu.ABRIR) {
            System.out.println("Abrindo o arquivo!");
        }
    }

    public static void main(String[] args) {
        
        
        escolheOpcao(COpcoesMenu.ABRIR);
    }
}
