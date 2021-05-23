package acrudsemdao1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class CRUD {

    private Pessoa[] pessoas = null;
    Scanner scanner = new Scanner(System.in);

    public CRUD() {
        pessoas = new Pessoa[5];
        int opcaoUsuario = 10;

        System.out.println("Pessoas criadas: " + Pessoa.contadorPessoas);

        while (opcaoUsuario != 0) {
            opcaoUsuario = this.recebeOpcaoUsuario();

            switch (opcaoUsuario) {
                case 0:
                    break;

                case 1:
                    int posicaoLivre = this.proximaPosicaoLivre();
                    if (posicaoLivre != -1) {
                        Pessoa p = this.inserirPessoa();
                        pessoas[posicaoLivre] = p;
                    } else {
                        System.out.println("O limite de armazenamento estourou. Exclua um pessoa");
                    }
                    break;

                case 2:
                    listarPessoas();
                    break;

                case 3:
                    listarPessoas();

                    System.out.println("Entre com a pessoa  (id) que deseja alterar: ");
                    int elementoASerAlterado = Integer.parseInt(scanner.nextLine());

                    if (this.alterarPessoa(elementoASerAlterado)) {
                        System.out.println("Pessoa alterada com sucesso");
                    } else {
                        System.out.println("Pessoa não alterada");
                    }
                    break;
                case 4:
                    listarPessoas();

                    System.out.println("Entre com a pessoa  (id) que deseja excluir: ");
                    int elementoASerExcluido = Integer.parseInt(scanner.nextLine());

                    if (this.excluirPessoa(elementoASerExcluido)) {
                        System.out.println("Pessoa alterada com sucesso");
                    } else {
                        System.out.println("Pessoa não alterada");
                    }
                    break;
            }
        }
        System.out.println("Saí do menu");
    }

    public static void main(String[] args) {
        new CRUD();
    }

    private int recebeOpcaoUsuario() {
        
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

    private Pessoa inserirPessoa() {
        Pessoa pessoa = new Pessoa();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Salário: ");
        double salario = Double.parseDouble(scanner.nextLine());

        System.out.println("Sexo: ");
        char sexo = scanner.nextLine().charAt(0);

        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setSalario(salario);
        pessoa.setIdade(idade);
        pessoa.setSexo(sexo);

        return pessoa;
    }

    private boolean alterarPessoa(int supostoId) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null && pessoas[i].getId() == supostoId) {
                
                System.out.println("Nome: ");
                String nome = scanner.nextLine();

                System.out.println("CPF: ");
                String cpf = scanner.nextLine();

                System.out.println("Idade: ");
                int idade = Integer.parseInt(scanner.nextLine());

                System.out.println("Salário: ");
                double salario = Double.parseDouble(scanner.nextLine());

                System.out.println("Sexo: ");
                char sexo = scanner.nextLine().charAt(0);

                pessoas[i].setNome(nome);
                pessoas[i].setCpf(cpf);
                pessoas[i].setSalario(salario);
                pessoas[i].setIdade(idade);
                pessoas[i].setSexo(sexo);
                return true;

            }
        }

        return false;

    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                return i;

            }
        }
        return -1;

    }

    private void listarPessoas() {
        int contadorNulas = 0;

        for (int i = 0; i < pessoas.length; i++) {

            if (pessoas[i] != null) {
                contadorNulas++;
                System.out.println(pessoas[i].toString());

            }
        }
        if (contadorNulas == 0) {
            System.out.println("Array vazio");
        }
    }

    private boolean excluirPessoa(int supostoId) {
       for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null && pessoas[i].getId() == supostoId) {
                pessoas[i] = null;
                return true;

            }
        }

        return false;
    }
}
