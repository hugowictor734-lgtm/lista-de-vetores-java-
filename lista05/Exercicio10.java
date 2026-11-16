import java.util.Scanner;

public class Exercicio10 {

    // Função recursiva: T(0) = 0 e T(n) = 2 * T(n-1) + 1
    static int contarMovimentos(int discos) {
        if (discos == 0) {
            return 0;
        }
        return 2 * contarMovimentos(discos - 1) + 1;
    }

    // Procedimento recursivo:
    // 1) leva os n-1 discos menores para o auxiliar
    // 2) move o maior disco para o destino
    // 3) leva os n-1 discos do auxiliar para o destino
    static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 0) {
            return;
        }
        hanoi(n - 1, origem, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        hanoi(n - 1, auxiliar, destino, origem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] jogos = new int[3];

        for (int i = 0; i < jogos.length; i++) {
            do {
                System.out.print("Quantidade de discos do jogo " + (i + 1) + " (1 a 10): ");
                jogos[i] = sc.nextInt();
            } while (jogos[i] < 1 || jogos[i] > 10);
        }

        for (int i = 0; i < jogos.length; i++) {
            System.out.println("\n=== Jogo " + (i + 1) + " (" + jogos[i] + " discos) ===");
            hanoi(jogos[i], 'A', 'C', 'B');
            System.out.println("Total: " + contarMovimentos(jogos[i]) + " movimentos");
        }
        sc.close();
    }
}
