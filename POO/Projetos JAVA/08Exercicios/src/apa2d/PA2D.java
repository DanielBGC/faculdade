/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apa2d;

import java.util.Random;

/**
 *
 * @author eduardoasilvestre
 */
public class PA2D {

    public PA2D() {
        //exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        //exercicio6();
        //exercicio7();
        //exercicio8();
        exercicio9();

    }

    public static void main(String[] args) {
        new PA2D();

    }

    private void exercicio1() {
        int vetor[] = {-5, -6, -7, 8, 9, 0, 2, 20, -38, -40};

        //exibe os positivos, negativos e nulos
        int positivos = 0;
        int negativos = 0;
        int nulos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                positivos++;
            } else if (vetor[i] < 0) {
                negativos++;
            } else {
                nulos++;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Nulos: " + nulos);

        //exibe o maior e o menor
        int menor = vetor[0];
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

        }
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);

    }

    private void exercicio2() {
        String vetor[] = {"E", "U", "A", "M", "O", "P", "R", "O", "G", "R", "A", "M", "A", "R"};
        for (int i = vetor.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(vetor[i] + "\n");
            } else {
                System.out.print(vetor[i] + "-");
            }

        }
    }

    private void exercicio3() {
        int vetor[] = {20, 22, 25, 26, 27, 29, 21, 28, 24, 23};
        int pares[] = new int[5];
        int impares[] = new int[5];
        int auxPares = 0;//variável que ajuda a inserir os elementos no vetor na ordem correta
        int auxImpares = 0;//variável que ajuda a inserir os elementos no vetor na ordem correta

        //preenche um vetor de par e um vetor de impares
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares[auxPares++] = vetor[i];

            } else {
                impares[auxImpares++] = vetor[i];
            }
        }

        System.out.println("IMPARES:");
        for (int i = 0; i < impares.length; i++) {
            System.out.println(impares[i]);

        }
        System.out.println("PARES:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }

    }

    private void exercicio4() {
        int vetor[] = new int[20];

        //preenche o vetor com os numeros sorteados
        int i = 0;
        while (i < vetor.length) {
            int numeroSorteado = getRandomNumberInRange(1, 50);
            vetor[i] = numeroSorteado;
            i++;
        }
        //verifica se o número eh primo
        i = 0;
        while (i < vetor.length) {
            if (ehPrimo(vetor[i])) {
                System.out.println("O número " + vetor[i] + " eh primo");
            }
            i++;
        }

        //exibe a soma dos números sorteados
        i = 0;
        int soma = 0;
        while (i < vetor.length) {
            soma = soma + vetor[i];
            i++;
        }
        System.out.println("A soma dos números sorteados é: " + soma);

    }

    private int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    private boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }

    private void exercicio5() {
        double vetor[] = {4, 3, 2, 1, 0, 0, 2, 4, 3, 6};
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];

        }
        double media = soma / vetor.length;
        System.out.printf("%.2f", media);
    }

    private void exercicio6() {
        int v1[] = {20, 30, 40, 50, 60, 70};
        int maiores30V1 = 0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] > 30) {
                maiores30V1++;
            }
        }

        int v2[] = {25, 27, 29, 60, 71, 72};
        int maiores30V2 = 0;
        for (int i = 0; i < v2.length; i++) {
            if (v2[i] > 30) {
                maiores30V2++;
            }
        }

        int resposta[] = new int[maiores30V2 + maiores30V1];
        int posicao = 0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] > 30) {
                resposta[posicao++] = v1[i];
            }
        }
        for (int i = 0; i < v2.length; i++) {
            if (v2[i] > 30) {
                resposta[posicao++] = v2[i];
            }
        }

        for (int i = 0; i < resposta.length; i++) {
            System.out.println(resposta[i]);

        }

    }

    private void exercicio7() {
        int vetor[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, -10, -17, -17, -19, -20};

        //exibe o maior e o menor
        int menor = vetor[0];
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
    }

    private void exercicio8() {
        int vetor[] = {10, 20, 30, 40, 50, 60, 70};
        int i = 0;
        while (i < vetor.length) {
            vetor[i] = vetor[i] * 3;
            System.out.println(vetor[i]);
            i++;
        }

    }

    private void exercicio9() {
        int vetor[] = {10, 20, 25, 27, 30, 31, 70};

        //preenche o vetor com os numeros sorteados
        int i = 0;
        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                int numeroSorteado = 10;
                while (numeroSorteado % 2 == 0) {
                    numeroSorteado = getRandomNumberInRange(1, 99);
                }

                vetor[i] = numeroSorteado;
            }
            i++;
        }
        for (int j = 0; j < vetor.length; j++) {
            System.out.println(vetor[j]);

        }
    }
}
