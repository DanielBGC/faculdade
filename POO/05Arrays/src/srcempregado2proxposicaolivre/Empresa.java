/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcempregado2proxposicaolivre;


/**
 *
 * @author eduardoasilvestre
 */
public class Empresa {

    Funcionario[] empregados = new Funcionario[3];
    String cnpj;

    void mostraEmpregados() {
        for (Funcionario empregado : empregados) {
            if (empregado != null) {
                System.out.println(empregado.toString());
                
            }
        }
    }
    
   boolean contem(Funcionario f) {
       for (int i = 0; i < empregados.length; i++) {
             if (empregados[i] != null) {
                 if (empregados[i].nome.equals(f.nome)) {
                     return true;
                 }
                 
             }
       }
       return false;
   
   }
   void adiciona(Funcionario f) {
        int posicaoLivre = this.proximaPosicaoLivre();
        if (posicaoLivre != -1) {
            this.empregados[posicaoLivre] = f;
        } else {
            System.out.println("Elemento não inserido");
        }
    }
    int proximaPosicaoLivre() {
        for (int i = 0; i < empregados.length; i++) {
             if (empregados[i] == null) {
                 return i;
             }
        }
        return -1;
    }
}
