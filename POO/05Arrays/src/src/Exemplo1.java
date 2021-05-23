package src;

public class Exemplo1 {

    public static void main(String[] args) {
        //Diversas variáveis similares. Não parece produtivo...
        int idade1;
        int idade2;
        int idade3;
        int idade4;

        //Array é sempre um objeto. Preciso do "new".
        int[] idades;
        idades = new int[10];
        
        int[] idades2 = new int[10]; //ou assim
        
        idades[5] = 10;
        idades[6] = 10;
        System.out.println("Array posição 5:" + idades[5]);
        
        /////////////////////////////////////////////////////////
        //RESULTADO DA IMPRESSÃO DO ARRAY DE TIPOS PRIMITIVOS
        for (int i = 0; i < idades.length; i++) {
            System.out.print("_" + idades[i]);
        }
        //0 inicialização default do int
        System.out.println("");
        
        /////////////////////////////////////////////////////////
        //CUIDADO (descomentar): java.lang.ArrayIndexOutOfBoundsException
        //System.out.println("Posição 12 do array é: " + idades[12]);
        
        /////////////////////////////////////////////////////////
        int n = 90;
        int numerosDoBilhete[] = new int[idades.length];
        
        /////////////////////////////////////////////////////////
        //P: Quantas contas foram criadas ?
        //R: Nenhuma !
        AConta[] minhasContas;
        minhasContas = new AConta[10];
        
        AConta[] minhasContas2 = new AConta[10];  //ou assim
        
        AConta contaNova = new AConta();
        contaNova.saldo = 1000.0;
        minhasContas[0] = contaNova;

        minhasContas[1] = new AConta();
        minhasContas[1].saldo = 3200.0;
        System.out.println("Saldo conta 1: " + minhasContas[1].saldo);
        
        /////////////////////////////////////////////////////////
        for (int i = 0; i < minhasContas.length; i++) {
            System.out.println("Objetos: " + minhasContas[i]);
        }
        
        /////////////////////////////////////////////////////////
        for (int i = 0; i < minhasContas.length; i++) {
            //cuidado (descomentar)
            System.out.println("Dados dos objetos: " + minhasContas[i].saldo);
        }
    }
}
