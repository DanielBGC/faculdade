package aamodeloloop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import acrudsemdao1.*;
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class LoopInfinitoModelo {
    Scanner scanner = new Scanner(System.in);
    public LoopInfinitoModelo() {

        int opcaoUsuario = 10;

        while (opcaoUsuario != 9) {
            opcaoUsuario = this.recebeOpcaoUsuario();
            switch (opcaoUsuario) {
                case 0:
                    System.out.println("criar");
                    break;

                case 1:
                    System.out.println("mostrar");
                    break;

                case 2:
                    System.out.println("excluir");
                    
                    break;

                case 3:
                    System.out.println("alterar o nome");
                    break;
                case 4:
                    System.out.println("buscar salários > 5000");
                case 9:
                    System.out.println("sair");
                    break;
                default:
                    break;
            }
        }
        System.out.println("Saí do menu");
    }

    public static void main(String[] args) {
        new LoopInfinitoModelo();
    }

    private int recebeOpcaoUsuario() {

        StringBuilder builder = new StringBuilder("");

        builder.append("SEJA BEM VINDO AO MEU PROGRAMA\n\n");
        builder.append("\n0 - Para inserir pessoa");
        builder.append("\n1 - Listar pessoas");
        builder.append("\n2 - Excluir um pessoa");
        builder.append("\n3 - Alterar um pessoa");
        builder.append("\n4 - Buscar salários > 5000");
        builder.append("\n9 - Para sair do programa\n");
        builder.append("\nQual sua opção ? R: ");
        
        System.out.print(builder.toString());

        return Integer.parseInt(scanner.nextLine());
    }

}
