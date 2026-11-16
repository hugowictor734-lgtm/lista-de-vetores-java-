import java.util.Scanner;

public class Exercicio02 {

    // Função: pega o último dígito (% 10) e monta o número invertido
    static int inverterNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            int ultimoDigito = numero % 10;
            invertido = invertido * 10 + ultimoDigito;
            numero = numero / 10;
        }
        return invertido;
    }

    // Procedimento
    static void exibirInvertidos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ao contrário: " + inverterNumero(numeros[i]));
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
        exibirInvertidos(numeros);
        sc.close();
    }
}
