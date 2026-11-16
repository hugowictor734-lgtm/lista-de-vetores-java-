import java.util.Scanner;

public class Exercicio03 {

    // Função: primo é maior que 1 e não tem divisor entre 2 e a raiz dele
    static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Procedimento
    static void exibirPrimos(int[] numeros) {
        System.out.print("Primos:");
        boolean achou = false;
        for (int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.print(" " + numeros[i]);
                achou = true;
            }
        }
        if (!achou) {
            System.out.print(" nenhum");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        exibirPrimos(numeros);
        sc.close();
    }
}
