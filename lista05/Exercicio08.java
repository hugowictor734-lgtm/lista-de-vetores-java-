public class Exercicio08 {

    // Função: verifica se o valor já está no array
    static boolean contem(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return true;
            }
        }
        return false;
    }

    // Função: sorteia sem repetir (sorteios começam em 1, então 0 = posição vazia)
    static int[] sortear(int quantidade, int maximo) {
        int[] sorteados = new int[quantidade];
        int preenchidos = 0;

        while (preenchidos < quantidade) {
            int numero = (int) (Math.random() * maximo) + 1;
            if (!contem(sorteados, numero)) {
                sorteados[preenchidos] = numero;
                preenchidos++;
            }
        }
        return sorteados;
    }

    // Procedimento
    static void exibir(int[] numeros) {
        System.out.print("Números sorteados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = sortear(6, 60);
        exibir(numeros);
    }
}
