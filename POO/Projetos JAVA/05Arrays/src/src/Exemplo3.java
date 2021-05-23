package src;

public class Exemplo3 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int[] idades = new int[10];
        for (int i = 0; i < 10; i++) {
            idades[i] = i * 10;
        }
        // imprimindo toda a array
        for (int x : idades) {
            System.out.println(x);
        }
        /////////////////////////////////////////////////////////
        imprimeArray(idades);
        
        /////////////////////////////////////////////////////////
        imprimeArrayObjeto(new String[]{"Eduardo", "Augsto"});
        
        /////////////////////////////////////////////////////////
        String arrayObjetos[] = {"João", "Maria"};
        imprimeArrayObjeto(arrayObjetos);
        
        /////////////////////////////////////////////////////////
        String  arrayObjetos2 [] = new String[3];
        arrayObjetos2[0] = "Ana";
        arrayObjetos2[1] = "Maria";
        arrayObjetos2[2] = "Juliana";
        imprimeArrayObjeto(arrayObjetos2);
    }

    static void imprimeArray(int[] array) {
        for (int x : array) {
            System.out.println(x);
        }
    }
    
    static void imprimeArrayObjeto(String[] array) {
        for (String x : array) {
            System.out.println(x);
        }
    }
}
