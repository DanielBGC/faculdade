package printf;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String args[]) {
        //instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o Peso Corporal em kg: ");
        double pc = Double.parseDouble(ler.nextLine()); // 3.3 entrada de dados (lendo um valor real)

        //ler.nextLine();
        System.out.println("Informe a Altura em metros...: ");
        double alt = Double.parseDouble(ler.nextLine()); // 3.3 entrada de dados (lendo um valor real)

        System.out.println("\n========================================\n");
        double vlrIMC = IMC(pc, alt);
        System.out.printf("IMC = %.2f (%s)\n", vlrIMC, interpretacaoIMC(vlrIMC));
        System.out.println("========================================\n");
    }

    public static double IMC(double pc, double alt) {
        return (pc / (alt * alt));
    }

    public static String interpretacaoIMC(double vlrIMC) {
        if (vlrIMC < 20) {
            return ("Magro");
        } else if ((vlrIMC >= 20) && (vlrIMC <= 24)) {
            return ("Normal");
        } else if ((vlrIMC >= 25) && (vlrIMC <= 29)) {
            return ("Acima do peso");
        } else if ((vlrIMC >= 30) && (vlrIMC <= 34)) {
            return ("Obeso");
        } else {
            return ("Muito obeso");
        }
    }
}
