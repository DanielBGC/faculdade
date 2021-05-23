/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;
import mvc.model.Filme;
import mvc.model.Usuario;

/**
 *
 * @author EDYA
 */
public class GUI {
    Scanner scanner = new Scanner(System.in);

    
    
      public int menuBoasVindas() {
        
        StringBuilder builder = new StringBuilder("");
        
        builder.append("SEJA BEM VINDO AO MEU PROGRAMA\n\n");
        builder.append("0 - Para sair do programa\n");
        builder.append("\n1 - Login");
        builder.append("\n2 - Ainda não é cadastrado");

        System.out.print(builder.toString());

        return Integer.parseInt(scanner.nextLine());
    }
    
    
    
    public int recebeOpcaoUsuario() {
        
        StringBuilder builder = new StringBuilder("");
        
        builder.append("SEJA BEM VINDO AO MEU PROGRAMA\n\n");
        builder.append("0 - Para sair do programa\n");
        builder.append("\n1 - Para inserir pessoa");
        builder.append("\n2 - Listar pessoas");
        builder.append("\n3 - Alterar um pessoa");
        builder.append("\n4 - Excluir um pessoa");
        builder.append("\nQual sua opção ? R: ");
        System.out.print(builder.toString());

        return Integer.parseInt(scanner.nextLine());
    }
    
    public Filme criaFilme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do filme:");
        String titulo = scanner.nextLine();
        
        Filme f = new Filme();
        f.setTitulo(titulo);
        f.setDataLancamento(LocalDate.MIN);
        f.setValor(BigDecimal.ZERO);
        
        return f;
    
    }

    
        public Filme criaFilmeAlteracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do filme:");
        String titulo = scanner.nextLine();
        
        Filme f = new Filme();
        f.setTitulo(titulo);
        f.setDataLancamento(LocalDate.MIN);
        f.setValor(BigDecimal.ZERO);
        
        return f;
    
    }
}
