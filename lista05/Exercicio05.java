import java.util.Scanner;

public class Exercicio05 {

    // Função: percorre o texto e conta as vogais (com ou sem acento)
    static int contarVogais(String texto) {
        String vogais = "aeiouáàâãéêíóôõúü";
        texto = texto.toLowerCase();
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Procedimento
    static void exibirContagem(String[] frases) {
        for (int i = 0; i < frases.length; i++) {
            System.out.println(frases[i] + " → " + contarVogais(frases[i]) + " vogais");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a palavra/frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }

        System.out.println();
        exibirContagem(frases);
        sc.close();
    }
}
