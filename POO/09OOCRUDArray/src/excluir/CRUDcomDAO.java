package excluir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import acrudsemdao1.*;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class CRUDcomDAO {
    Scanner scanner = new Scanner(System.in);
    PessoaDAO pessoaDAO = new PessoaDAO();
    public CRUDcomDAO() {

        int opcaoUsuario = 10;

        while (opcaoUsuario != 9) {
            opcaoUsuario = this.recebeOpcaoUsuario();
            switch (opcaoUsuario) {
                case 0:
                    Pessoa p = this.criaPessoa();
                    if (pessoaDAO.inserir(p)) {
                        System.out.println("pessoa inserida com sucesso");
                    } else {
                        System.out.println("array cheio");
                    }
                    break;

                case 1:
                    pessoaDAO.mostrarPessoas();
                    break;

                case 2:
                    pessoaDAO.mostrarPessoas();
                    long idASerExcluido = menuExclusaoPessoa();

                    if (pessoaDAO.exclui(idASerExcluido)) {
                        System.out.println("excluido com sucesso");
                    } else {
                        System.out.println("não foi excluido");
                    }
                    
                    break;

                case 3:
                    pessoaDAO.mostrarPessoas();
                    long idASerAlterado = menuAlteracaoPessoa();
                    //Pessoa pessoaTemp = this.criaPessoa();
                    System.out.println("Qual é o novo nome ?");
                    String novoNome = scanner.nextLine();

                    if (pessoaDAO.altera(idASerAlterado, novoNome)) {
                        System.out.println("pessoa alterada com sucesso");
                    } else {
                        System.out.println("pessoa não encontrada");
                    }
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
        new CRUDcomDAO();
    }

    
    
    private long menuExclusaoPessoa() {
        System.out.println("qual pessoa deseja excluir: ");
        long idASerExcluido = Long.parseLong(scanner.nextLine());
        return idASerExcluido;
    }

    private long menuAlteracaoPessoa() {
        System.out.println("qual pessoa deseja alterar: ");
        long idASerAlterado = Long.parseLong(scanner.nextLine());
        return idASerAlterado;
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

    private Pessoa criaPessoa() {
        Pessoa p = new Pessoa();

        System.out.println("nome: ");
        p.setNome(scanner.nextLine());

        System.out.println("salario: ");
        p.setSalario(new BigDecimal(scanner.nextLine()));

        return p;
    }

}
