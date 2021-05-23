/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aheranca;

/**
 *
 * @author EDYA
 */
public class DTeste {
/*
    EXERCÍCIO
    1 Crie a classe FUNCIONARIO e a classe GERENTE idêntica a apostila.
    2 Crie a classe Secretaria igual ao Funcionaro e adicione o numero de horas extras
    3 Crie a classe Diretor igual ao Funcionario e adicione o valor da bonificacao, número de horas e o método que calcula a bonificação.
    4 Instancie todos os objetos, preencha todos os dados e exiba atributos e métodos
    */
    public static void main(String[] args) {
        DEngenheiro dEngenheiro = new DEngenheiro();
        dEngenheiro.setNome("joao");
        dEngenheiro.nome = "joao";
        DSecretario dSecretario = new DSecretario();
        dSecretario.setNome("maria");
        
        System.out.println("Nome do engenheiro: " + dEngenheiro.getNome());
        System.out.println("Nome da secretaria: " + dSecretario.getNome());
    }
}
