/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acrudsemdao2;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class Locadora {
    private Filme [] filmes = new Filme[10];
   /* private Apartamento [] apartamentos = new Apartamento[10];
    private Pessoa [] pessoas = new Pessoa[10];
    private Pagamento [] pagamentos = new Pagamento[10];
    private Animal [] animais = Animal[10];
    */
    
    private Scanner s = new Scanner(System.in);
    int contador = 0;
    
    public Locadora() {
        fazTudao();
    
    }
    
    public static void main(String[] args) {
        new Locadora();
    }
    
    private void fazTudao() {
    
        int opcao = 10;
        while (opcao != 0) {
            
            
            opcao = this.pegaOpcaoUsuario();
            
            switch(opcao) {
                case 0:
                    System.out.println("Perdeu manezão...");
                    break;
                    
                case 1: 
                    Filme f = criarFilme();
                    if (insere(f)) {
                        System.out.println("Filme inserido com sucesso");   
                    } else {
                        System.out.println("Espacao acabou para inserir filme");
                    }
                    
                    break;
                    
                case 2: 
                    mostrar();
                    
                    break;
                    
                case 3: 
                    int alteraId = 10;
                    if (alterarFilme(alteraId)) {
                        System.out.println("Filme alterado com sucesso");   
                    } else {
                        System.out.println("Filme não alterado");
                    }
                    
                    break;
                case 4:
                    int excluiId = 9;
                    
                    if (excluirFilme(excluiId)) {
                        System.out.println("Filme excluído com sucesso");   
                    } else {
                        System.out.println("Filme não excluído");
                    }
                    
                    break;
                    
                default: break;
                   
            }
            
            
        
        
        }
        
        
    }

    private Filme criarFilme() {
        Filme f = new Filme();
        System.out.println("titulo do filme");
        f.setTitulo(s.nextLine());
        System.out.println("ano do filme");
        f.setAno(Integer.parseInt(s.nextLine()));
        System.out.println("valor do filme");
        f.setValor(new BigDecimal(s.nextLine()));
        
        return f;
    }

    private int pegaOpcaoUsuario() {
        System.out.println("BEM VINDO A MEU PROGRAMA MANEZÃO");    
        System.out.println("0 - sair");
        System.out.println("1 - cadastrar filme");
        System.out.println("2 - mostrar filmes");
        System.out.println("3 - alterar filmes");
        System.out.println("4 - excluir filmes");
        String temp = s.nextLine();
        return Integer.parseInt(temp);
    }

    private boolean insere(Filme f) {
        int posicao = this.proximaPosicaoLivre();
        if (posicao != -1) {
            filmes[posicao] = f;
            return true;
        } else  {
            return false;
        }
    }
    
    private int proximaPosicaoLivre() {
       for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] == null) {
                return i;
            }
            
        }
       return -1;
    
    }

    private void mostrar() {
        boolean temFilme = false;
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null) {
                temFilme = true;
                System.out.println(filmes[i].toString());
            }
        }
        //
        if (!temFilme) {
            System.out.println("Não existem filmes");
        }
    }
    
    private boolean alterarFilme(int supostoId) {
        for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null && filmes[i].getId() == supostoId) {
                /*
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
                        */
                return true;

            }
        }

        return false;

    }
    
     private boolean excluirFilme(int supostoId) {
       for (int i = 0; i < filmes.length; i++) {
            if (filmes[i] != null && filmes[i].getId() == supostoId) {
                filmes[i] = null;
                return true;

            }
        }

        return false;
    }
}
