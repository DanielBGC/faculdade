package sorting;

import java.util.Random;

public class TestaSorting {

    public TestaSorting() {
        //teste 1: comum
        /*
        int elementos[] = generateRandomArray(100000);
        Sorting s = new Quicksort();
        Chronometer.start();
        s.ordena(elementos);
        Chronometer.stop();
        System.out.println("Tempo: " + Chronometer.elapsedTime());
        */
        
        //E, se o quicksort não está atendendo mais as necessidades ?
        //teste 2: com array já ordenado
        
        int elementos[] = generateRandomArray(10000);
        Sorting s = new Quicksort(); //depois testa com outro
        int elementos2 [] = s.ordena(elementos);
        Chronometer.start();
        s.ordena(elementos2);
        Chronometer.stop();
        System.out.println("Tempo: " + Chronometer.elapsedTime());
        

        
        //imprimeVetorInteiro(elementos);
    }

    

    /**
     * @param args
     */
    public static void main(String[] args) {
        new TestaSorting();
    }

    private void imprimeVetorInteiro(int vetor[]) {
        System.out.print("O vetor ordenado e: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    private int[] generateRandomArray(int tamanho) {
        int elementos[] = new int[tamanho];
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = getRandomNumberInRange(1, tamanho);
        }
        return elementos;
    }
}
