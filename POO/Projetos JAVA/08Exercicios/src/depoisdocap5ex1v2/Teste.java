/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocap5ex1v2;

import java.util.Scanner;

/**
 *
 * @author eduardoasilvestre
 */
public class Teste {

    static Scanner s = new Scanner(System.in);
    static Empresa empresa = null;
    public static void main(String[] args) {

        /*
        
        Empresa empresa = new Empresa();
        empresa.cnpj = "123";
        empresa.nomeFantasia = "IFTM";
        empresa.ramo = "Educacao";

        Funcionario f = new Funcionario();
        f.nome = "Eduardo";
        f.salario = 38000;
        empresa.funcionarios = new Funcionario[5];
        empresa.funcionarios[0] = f;

        System.out.println(empresa.toString());
         */
        int opcaoMenu;
        
        do {
            opcaoMenu = pegaOpcaoUsuario();

            switch (opcaoMenu) {
                case 1:

                    if (empresa == null) {
                        empresa = criaEmpresa();
                    } else {
                        System.out.println(empresa.toString());
                    }

                    break;

                case 2:
                    Funcionario f = criaFuncionario();
                    boolean adicionou = empresa.adiciona(f);
                    if (adicionou) {
                        System.out.println("Funcionário adicionado com sucesso");
                    
                    } else {
                        System.out.println("Funcionário NÃO adicionado");
                    }
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    Funcionario f1 = criaFuncionarioRemocao();
                    
                    if (empresa.remove(f1)) {
                        System.out.println("Funcionário removido com sucesso");
                    
                    } else {
                        System.out.println("Funcionário NÃO removido");
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
    }

    private static Empresa criaEmpresa() {
        Empresa temp = new Empresa();
        System.out.println("Nome da emprea: ");
        temp.nomeFantasia = s.nextLine();
        
        System.out.println("CNPJ: ");
        temp.cnpj = s.nextLine();
        
        System.out.println("Ramo: ");
        temp.ramo = s.nextLine();
        return temp;
    }
    
    private static Funcionario criaFuncionario() {
        Funcionario temp = new Funcionario();
        System.out.println("Nome: ");
        temp.nome = s.nextLine();
        
        System.out.println("RG: ");
        temp.rg = Integer.parseInt(s.nextLine());
        
        System.out.println("Salário: ");
        temp.salario = Double.parseDouble(s.nextLine());
        return temp;
    }

    private static int pegaOpcaoUsuario() {

        String menu = "ERP do IFTM";
        menu += "\n1 - Configurar os dados da empresa (nome fantasia, cnpj, ramo,...)";
        menu += "\n2 - Adicionar um funcionário (nome, nascimento, sexo, ..).";
        menu += "\n3 - Verificar se um dado funcionário existe na empresa.";
        menu += "\n4 - Mostrar todos os funcionários cadastros por um método";
        menu += "\n5 - Remover um funcionário específico da empresa";
        menu += "\n6 - Sair";
        menu += "\n\nQul sua opção ? R: ";
        System.out.println(menu);
        return Integer.parseInt(s.nextLine());

    }

    private static Funcionario criaFuncionarioRemocao() {
        Funcionario temp = new Funcionario();
        System.out.println("Nome: ");
        temp.nome = s.nextLine();
        
       return temp;
    }
}
