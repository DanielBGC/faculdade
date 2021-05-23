/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aencapsulamento;

/**
 *
 * @author EDYA
 */
public class ATestaContaEstouro3 {

    public static void main(String args[]) {
        AConta minhaConta = new AConta();
        minhaConta.limite = 100;
        minhaConta.saldo = 100;

        // quero mudar o saldo para -200
        double novoSaldo = -200;
        // testa se o novoSaldo ultrapassa o limite da conta
        //Ex: limite = 200, -500 < -200
        if (novoSaldo < -minhaConta.limite) { //
            System.out.println("Não posso mudar para esse saldo");
        } else {
            minhaConta.saldo = novoSaldo;
        }
        
        /*
        Esse código iria se repetir ao longo de toda nossa aplicação e, pior, 
        alguém pode esquecer de fazer essa comparação em algum momento,
        deixando a conta na situação inconsistente. A melhor forma de resolver
        isso seria forçar quem usa a classe Conta a invocar o método saca e não 
        permitir o acesso direto ao atributo.
        */
    }
}
