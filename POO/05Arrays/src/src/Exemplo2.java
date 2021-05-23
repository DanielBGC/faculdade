package src;

public class Exemplo2 {

    public static void main(String[] args) {
        int[] idades = new int[10];
        for (int i = 0; i < 10; i++) {
            idades[i] = i * 10;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(idades[i]);
        }
        /////////////////////////////////////////////////////////
        int[] idades2 = new int[2];
        idades2[0]=10;
        idades2[1]=11;
        //idades2[2]=12; //CUIDADO
        
        imprimeArray(idades2); //descomentar
        idades2[1] = 900;
    }
    //Chamar método a partir da main
    /*void  imprimeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }*/
    
   static void  imprimeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
