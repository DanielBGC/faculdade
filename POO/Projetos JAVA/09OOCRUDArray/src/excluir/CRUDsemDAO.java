package excluir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class CRUDsemDAO {

    Scanner scanner = new Scanner(System.in);
    Pessoa[] pessoas = new Pessoa[3];

    public CRUDsemDAO() {
        
        int opcaoUsuario = 10;

        while (opcaoUsuario != 9) {
            opcaoUsuario = this.recebeOpcaoUsuario();
            switch (opcaoUsuario) {
                case 0:
                    int posicaoLivre = this.proximaPosicaoLivre();

                    if (posicaoLivre != -1) {
                        Pessoa p = this.criaPessoa();
                        pessoas[posicaoLivre] = p;
                        System.out.println("pessoa inserida com sucesso");
                    } else {
                        System.out.println("array cheio");
                    }

                    break;

                case 1:
                    mostrarPessoas();
                    break;

                case 2:
                    mostrarPessoas();

                    long idASerExcluido = menuExclusaoPessoa();

                    if (this.exclui(idASerExcluido)) {
                        System.out.println("excluido com sucesso");
                    } else {
                        System.out.println("não foi excluido");
                    }
                    break;

                case 3:
                    mostrarPessoas();
                    long idASerAlterado = menuAlteracaoPessoa();
                    //Pessoa pessoaTemp = this.criaPessoa();
                    System.out.println("Qual é o novo nome ?");
                    String novoNome = scanner.nextLine();

                    if (this.altera(idASerAlterado, novoNome)) {
                        System.out.println("pessoa alterada com sucesso");
                    } else {
                        System.out.println("pessoa não encontrada");
                    }
                    break;
                case 4:
                    Pessoa[] maioresQue5000 = this.buscaPessoasPorSalario(new BigDecimal("5000"));
                    for (Pessoa pessoa : maioresQue5000) {
                        System.out.println(pessoa);
                    }
                    break;
                case 9:
                    System.out.println("sair");
                    break;
                default:
                    break;
            }
        }
        System.out.println("tchau brigado");
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

    public static void main(String[] args) {
        new CRUDsemDAO();
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

    private void mostrarPessoas() {
        System.out.println("Imprimindo as possíveis pessoas:");

        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa);
            }
        }
    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa pessoa = pessoas[i];
            if (pessoa == null) {
                return i;
            }
        }
        return -1;
    }

    private boolean exclui(long idASerExcluido) {
        for (int i = 0; i < pessoas.length; i++) {

            if (pessoas[i].getId() == idASerExcluido) {
                pessoas[i] = null;
                return true;
            }
        }
        return false;
    }

    private boolean altera(long idASerAlterado, String novoNome) {
        for (int i = 0; i < pessoas.length; i++) {

            if (pessoas[i].getId() == idASerAlterado) {
                pessoas[i].setNome(novoNome);
                return true;
            }
        }
        return false;

    }

    private Pessoa[] buscaPessoasPorSalario(BigDecimal parametro) {
        int quantidadeDePessoas = 0;
        for (int j = 0; j < pessoas.length; j++) {
            Pessoa pessoa = pessoas[j];
            if (pessoa.getSalario().compareTo(parametro) > 0) {
                quantidadeDePessoas++;
            }
        }
        if (quantidadeDePessoas == 0) {
            return null;
        } else {
            Pessoa[] pessoasSalarioMaior = new Pessoa[quantidadeDePessoas];

            int contadorNovo = 0;
            for (int j = 0; j < pessoas.length; j++) {
                Pessoa pessoa = pessoas[j];
                if (pessoa.getSalario().compareTo(parametro) > 0) {
                    pessoasSalarioMaior[contadorNovo++] = pessoa;
                }
            }
            return pessoasSalarioMaior;

        }
    }

}
