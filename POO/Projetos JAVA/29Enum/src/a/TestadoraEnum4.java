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
public class TestadoraEnum4 {

    public static void comparaEnum(COpcoesMenu opcao) {
        if (opcao.equals(COpcoesMenu.SALVAR)) {
            System.out.println("Foi escolhido a opção Salvar");
        } else if (opcao.equals(COpcoesMenu.ABRIR)) {
            System.out.println("Foi escolhido a opção ABRIR");
        } else if (opcao.equals(COpcoesMenu.FECHAR)) {
            System.out.println("Foi escolhido a opção FECHAR");
        }
    }

    public static void main(String[] args) {
        comparaEnum(COpcoesMenu.SALVAR);
    }
}
