import java.util.Scanner;

public class Exercicio01 {

    // Função: divide por 10 até chegar a 0, contando as divisões
    static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        int contador = 0;
        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }
        return contador;
    }

    // Procedimento
    static void exibirDigitos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " tem " + contarDigitos(numeros[i]) + " dígito(s)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Digite o número " + (i + 1) + " (inteiro positivo): ");
                numeros[i] = sc.nextInt();
            } while (numeros[i] < 0);
        }

        System.out.println();
        exibirDigitos(numeros);
        sc.close();
    }
}
