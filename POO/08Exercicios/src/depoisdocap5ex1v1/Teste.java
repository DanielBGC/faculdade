/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap5ex1v1;

import java.util.Scanner;

/**
 *
 * @author EDUARDO A SILVESTRE
 */
public class Teste {

    static Scanner scanner = new Scanner(System.in);
    static Empresa empresa = null;
    
    public static void main(String[] args) {
                
        int opcaoMenu;
        do {
            opcaoMenu = pegaOpcaoUsuario();
            switch (opcaoMenu) {
                case 1:
                    if (empresa == null) {
                        empresa = new Empresa();
                        empresa.funcionarios = new Funcionario[5];

                        System.out.println("Nome da empresa");
                        empresa.nomeFantasia = scanner.nextLine();

                        System.out.println("CNPJ");
                        empresa.cnpj = scanner.nextLine();

                        System.out.println("Ramo");
                        empresa.ramo = scanner.nextLine();
                    } else {
                        System.out.println(empresa.toString());
                    }
                    break;

                case 2:
                    Funcionario f = new Funcionario();

                    System.out.println("Nome:");
                    f.nome = scanner.nextLine();

                    System.out.println("RG:");
                    f.rg = Integer.parseInt(scanner.nextLine());

                    System.out.println("Salário:");
                    f.salario = Double.parseDouble(scanner.nextLine());
                    
                    boolean valor = empresa.adiciona(f);
                    if (valor) {
                        System.out.println("Funcionário inserido com sucesso");
                    } else {
                        System.out.println("Array está cheio");
                    }
                    break;
                case 3:
                    System.out.print("Qual funcionário procura ? R:");
                    String nomeTemp = scanner.nextLine();
                    if (empresa.contem(nomeTemp) ) {
                        System.out.println("O(a) " + nomeTemp + " já foi cadastrado");
                    } else {
                        System.out.println("Funcionário não existente");
                    }
                        
                    break;
                case 4:
                    for (Funcionario funcionario : empresa.funcionarios) {
                        if (funcionario != null) {
                            System.out.println(funcionario.toString());
                        }
                    }
                    /*
                    for (int i = 0; i < empresa.funcionarios.length; i++) {
                        if (empresa.funcionarios[i] != null) {
                            System.out.println(empresa.funcionarios[i].toString());
                        }
                    }
                    
                    
                    Funcionario [] temp = empresa.funcionarios;
                    for (Funcionario funcionario : temp) {
                        if (funcionario != null) {
                        System.out.println(funcionario.toString());
                        }
                    }
                    */
                    break;
                case 5:
                     System.out.print("Qual funcionário deseja remover ? R:");
                    String nomeRemocao = scanner.nextLine();
                    if (empresa.remove(nomeRemocao) ) {
                        System.out.println("O(a) " + nomeRemocao + " foi removido");
                    } else {
                        System.out.println("Funcionário não encontrado");
                    }
                    break;

                case 6:
                    System.out.println("6");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        } while (opcaoMenu != 6);
        System.out.println("Volta outra vez...");

    }

    /*
        Empresa empresa = new Empresa();
        empresa.funcionarios = new Funcionario[5];
        
        Funcionario f1 = new Funcionario();
        f1.nome = "f1";
        f1.rg = 1;
        f1.salario = 1000;
        
        Funcionario f2 = new Funcionario();
        f2.nome = "f2";
        f2.rg = 2;
        f2.salario = 2000;
        
        Funcionario f3 = new Funcionario();
        f3.nome = "f3";
        f3.rg = 3;
        f3.salario = 3000;     
        
        Funcionario f4 = new Funcionario();
        f4.nome = "f4";
        f4.rg = 4;
        f4.salario = 4000;
        
        Funcionario f5 = new Funcionario();
        f5.nome = "f5";
        f5.rg = 5;
        f5.salario = 5000;
        
        Funcionario f6 = new Funcionario();
        f6.nome = "f6";
        f6.rg = 6;
        f6.salario = 6000;
        
        
        empresa.adiciona(f1);
        empresa.adiciona(f2);
        empresa.adiciona(f3);
        empresa.adiciona(f4);
        empresa.adiciona(f5);
        
        empresa.remove("f3");
        empresa.remove("f5");
        
        if (!empresa.adiciona(f6)) {
            System.out.println(f6.nome + " não foi adicionado.");
        }
        if (empresa.contem("f3")) {
            System.out.println("o f3 está lá");
        }
        
        empresa.altera("f4", "Funcionários Feliz Véspera Feriado");
        
        empresa.mostraFuncionarios();
    }
     */
    private static int pegaOpcaoUsuario() {
        String var = "________________________________________________";
        var += "\n1 - Configurar os dados da empresa (nome fantasia, cnpj, ramo,...) (caso os dados já estejam configurados exiba-os)";
        var += "\n2 - Adicionar um funcionário (nome, nascimento, sexo, ..).";
        var += "\n3 - Verificar se um dado funcionário existe na empresa.";
        var += "\n4 - Mostrar todos os funcionários cadastros por um método";
        var += "\n5 - Remover um funcionário específico da empresa";
        var += "\n6 - Sair";

        System.out.println(var);
        System.out.print("\n\nQual sua opção ? R: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
