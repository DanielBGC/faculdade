package printf;



import java.io.IOException;
import java.util.Scanner;

public class Exemplo4 {
// através da cláusula throws indicamos que não iremos
// tratar possíveis erros na entrada de dados realizada
// através do método "read" do pacote de classes System.in

    public static void main(String[] args) throws IOException {
// 2. instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);

        String nome;
        char sexo;

        System.out.printf("Informe um nome:\n");
        nome = ler.nextLine(); // 

        System.out.printf("\nInforme o sexo (M/F): ");
        sexo = (char) System.in.read(); //le o próximo byte (entre 0 e 255)

        System.out.printf("\nResultado:\n");
        if ((sexo == 'M') || (sexo == 'm')) { //CHAR: TIPO PRIMITIVO
            System.out.printf("Seja bem vindo Sr. \"%s\".\n", nome); //imprimir aspas:\"
        } else {
            System.out.printf("Seja bem vinda Sra. \"%s\".\n", nome);
        }
    }

}
