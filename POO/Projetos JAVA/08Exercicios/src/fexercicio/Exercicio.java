/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fexercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author EDYA
 */
public class Exercicio {
    
    
    public static void main(String args[]) {
    
        String welcome = "*****************************************\n" +
                "Seja bem vindo ao meu programinha\n" +
                "Use com cuidado !!\n\n" +
                "Autor: Eduardo\n" +
                "*****************************************";
        JOptionPane.showMessageDialog(null, welcome);
        
        String menu = "Escolha um das opções abaixo !\n\n";
        menu += "1 - Calcule o IMC\n";
        menu += "2 - A quantidade de caracteres de um nome\n";
        menu += "3 - A média das notas de uma disciplina\n";
        menu += "4 - Imprimir os caracteres do nome de maneira formatada\n";
        menu += "\n0 - Sair do programa";
        
        int op = 10;
        do {
        op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        
        switch(op) {
            case 1 :
                String nome = JOptionPane.showInputDialog("Entre com seu nome: ");
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso: "));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com sua altura: "));
                
                double imc = peso / (altura * altura);
                
                if (imc < 15) {
                    JOptionPane.showMessageDialog(null, "bulimia grave ");
                } else if (imc>=15 && imc <= 20) {
                    JOptionPane.showMessageDialog(null, "diminua as dorgas ");
                } else if (imc>=21 && imc <= 25) {
                    JOptionPane.showMessageDialog(null, "Saradinhoooo");
                } else {
                    JOptionPane.showMessageDialog(null, "Sou gordinho gostosoooo ");
                }
                
                break;
                
            case 2 :
                nome = JOptionPane.showInputDialog("Entre com seu nome completo: ");
                String resultado = "";
                resultado += "O meu nome tem " + nome.length() + " caracteres";
                
                
                for (int i = 0; i < nome.length(); i++) {
                    resultado += "\n" + nome.charAt(i);
                }
                JOptionPane.showMessageDialog(null, resultado);
                
                
                
                break;
                
                
            case 3 :
                break;
                
            case 4 :
                
                //definição de array de int
                int[] a;
                a = new int[3];
                //como preencher um array
                a[0] = 10;
                a[1] = 20;
                a[2] = 30;
                //como imprimir um array
                for (int i = 0; i< a.length; i++) {
                    System.out.println("ìndice: " + i + " tem valor " + a[i]);
                }
                
                String resu="";
                for (int x : a) {
                    resu += x + " ";
              
                }
                System.out.println(resu);
                

                //definição de array de char
                char[] sexo = new char[2];
                
                
                //definição de array de string
                String[] teste;
                teste = new String[5];
                teste[0] = "Emenegildo";
                teste[0] = "Roncato";
                
                
                
                //impressao de array a partir do java 5
                String[] names = {"Amor","Banana", "Colher", "Dama", "Escola", "Fadinha","Gato", "Hiato", "Igreja", "Juquinha", "Kellogs", "Luz", "Macaco", "Nair", "Ovo", "Pato", "Queijo", "Rato", "Sapo", "Tatu", "Uva", "Viúva", "Will", "Xiz", "Yellow", "Zebra"};
                
                for (String tempString : names)  {
                    System.out.println(tempString);
                }
                //alternativa para resolver o exercício 4 sem usar nada mais elaborado
                String meuNome = "EDUARDO";         
                
                char[] contador = new char[26];
                int contadorTemp = 0;
                for (char ch = 'A'; ch <= 'Z'; ch++) {
                    contador[contadorTemp++] = ch;
                }
                
                
                String resposta = "";
                for(int i = 0; i < meuNome.length(); i++) {
                    char caracter = meuNome.charAt(i);
                    for (int j = 0; j < contador.length; j++) {
                        if (contador[j] == caracter) {
                            resposta += names[j] + "\n";
                            break;
                        }
                    }
                }
                System.out.println(resposta);
                
                
                break;
            case 0 :
                break;
            
        
        
        }
        
        
        } while (op != 0);
        
        
        
    
    }
    
}
