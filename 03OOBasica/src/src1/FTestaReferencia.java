/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src1;

/**
 *
 * @author EDYA
 */
public class FTestaReferencia {

    public static void main(String args[]) {
        /* C1   */
        CConta c1 = new CConta();
        c1.dono = "Duke";
        c1.saldo = 227;
        
        /* C2   */
        CConta c2 = new CConta();
        c2.dono = "Duke";
        c2.saldo = 227;
        
        /* C3   */
        CConta c3 = new CConta();
        c2.dono = "Aline";
        c2.saldo = 100;
        
        /* C4   */
        CConta c4 = c3;
        
        if (c1 == c1) {
            System.out.println("Referências iguais c1-c1");
        } else {
            System.out.println("Referências diferentes  c1-c1");
        }
        
        if (c1 == c2) {
            System.out.println("Referências iguais  c1-c2");
        } else {
            System.out.println("Referências diferentes  c1-c2");
        }
        
        if (c1 == c3) {
            System.out.println("Referências iguais  c1-c3");
        } else {
            System.out.println("Referências diferentes c1-c3");
        }
        
        if (c3 == c4) {
            System.out.println("Referências iguais  c3-c4");
        } else {
            System.out.println("Referências diferentes c3-c4");
        }
        
        //Mas eu quero comparar duas contas pelo seu dono !! Como faço??? 
        //R: equals e hashcode
        
        System.out.println("Leite das crianças");
        c1.saca(2000);

        System.out.println("Baladinha...");
        c1.saca(1000);

        System.out.println("Mc Donalds");
        c1.saca(100);

        System.out.println("Saldo anterior  " + c1.saldo);

        System.out.println("Ganhou na mega sena...");
        c1.deposita(1000000);
        System.out.println("Saldo  " + c1.saldo);

        System.out.println("Casar....");
        c1.saca(1000000);
        System.out.println("1 ano após seu casamento...");

        System.out.println("Saldo pos casamento  " + c1.saldo);
        System.out.println("Dinheiro insuficiente...");
        
        /*CUIDADO: Strings são imutáveis. Quando é feito nome1="augusto" é criado
        uma nova área na memória e nome1 aponta para ela. Enquanto isso nome2
        continua apontando para a área antiga*/
       
        String nome1 = "eduardo";
        String nome2 = nome1;
        //System.out.println("nome1 hash code: " + nome1.hashCode());
        //System.out.println("nome2 hash code: " + nome2.hashCode());
        System.out.println("(1)");
        System.out.println("Nome1: " + nome1);
        System.out.println("Nome2: " + nome2);
        
        nome1="augusto";
        //System.out.println("nome1 hash code: " + nome1.hashCode());
        //System.out.println("nome2 hash code: " + nome2.hashCode());
        System.out.println("(2)");
        System.out.println("Nome1: " + nome1);
        System.out.println("Nome2: " + nome2);
        
        String na = "maria";
        
        String nb = na;
        String nd = "maria";
        if (na == nb) {
            System.out.println("Iguais.");
        } else {
            System.out.println("Diferentes.");
        }
        //quando crio uma literal o java pesquisa se já existe outra criada
        if (na == nd) {
            System.out.println("Iguais.");
        } else {
            System.out.println("Diferentes.");
        }
        String nc = "josé";
        //if ("josé".equals(nc)) {
        if (nc.equals("josé")) {
            System.out.println("Iguais.");
        } else {
            System.out.println("Diferentes.");
        }
        
        
    }
}
