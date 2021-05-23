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
public class ETeste2 {
    public static void main(String[] args) {
        //POLIMORFISMO
        EGerente gerente = new EGerente();
        EFuncionario funcionario = gerente;
        funcionario.setSalario(5000.0);
        
        System.out.println(funcionario.getBonificacao());
        /////////////////////////////////////////////////////////////
       
        EFuncionario funcionario1 = new EGerente();
        funcionario1.setSalario(5000.0);
        
        System.out.println(funcionario1.getBonificacao());
        
        
        /**
         Reino: Animalia (o homem é um animal, e nesse grupo estão todos os animais).
        Filo: Chordata (possui notocorda - formação da coluna vertebral - no seu desenvolvimento embrionário, e aqui estão todos os vertebrados).
        Classe: Mammalia (seu filhos mamam, e nessa classe estão todos os mamíferos)
        Infraclasse: Placentalia (é um mamífero cuja fêmea possui placenta - mamíferos que não possuem placenta pertencem a outra infraclasse)
        Ordem: Primata
        Família: Hominidae (dentro desse grupo estão as subfamílias Gorilla (gorilas), Pan (chimpanzés), Ardipithecus (extinto), Australopithecus (extinto) , Pierolapithecus (extinto), Sahelanthropus (extinto), Paranthropus (extinto), Kenyanthropus (extinto), Orrorin (extinto), Homininae (seres humanos).
        Subfamília: Homininae
        Gênero: Homo.
        Na verdade, o gênero Homo contém diversas espécies, porém, com exceção do sapiens, todas estão extintas. São elas : Homo antecessor, Homo rhodesiensis, Homo rudolfensis, Homo habilis, Homo cepranensis, Homo ergaster, Homo erectus, Homo floresiensis, Homo georgicus, Homo heidelbergensis, Homo neanderthalensis, Homo sapiens.
        Espécie: Homo sapiens.
        Conforme os grupos se subdividem de acordo com as características compartilhadas, o número de animais enquadrados diminui. Ao mesmo tempo, estes apresentam cada vez mais características em comum.
        Cada grupo de classificação é chamado de táxon - de onde vem o nome taxonomia. Esse sistema de classificação permite que os seres vivos sejam agrupados conforme o seu grau de parentesco e permite compreender melhor a evolução da vida na Terra.
         */
    }
   
}
