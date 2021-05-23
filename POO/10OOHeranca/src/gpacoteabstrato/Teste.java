/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacoteabstrato;

/**
 *
 * @author EDYA
 */
public class Teste {
    public static void main(String[] args) {
        
        //Pessoa p = new Pessoa();
        
        RegistraPessoas registraPessoas = new RegistraPessoas();
        
        registraPessoas.registra(new PessoaFisica());
        registraPessoas.registra(new PessoaJuridica());
    }
}
