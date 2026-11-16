import java.util.Scanner;

public class Exercicio09 {

    // Função recursiva, sem laço: fib(0)=0, fib(1)=1, fib(n)=fib(n-1)+fib(n-2)
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Função: soma os termos do array
    static int somar(int[] termos) {
        int soma = 0;
        for (int i = 0; i < termos.length; i++) {
            soma += termos[i];
        }
        return soma;
    }

    // Procedimento
    static void exibir(int[] termos) {
        for (int i = 0; i < termos.length; i++) {
            System.out.print(termos[i] + " ");
        }
        System.out.println("e soma " + somar(termos));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite N (1 a 30): ");
            n = sc.nextInt();
        } while (n < 1 || n > 30);

        int[] termos = new int[n];
        for (int i = 0; i < n; i++) {
            termos[i] = fibonacci(i);
        }

        System.out.println();
        exibir(termos);
        sc.close();
    }
}
