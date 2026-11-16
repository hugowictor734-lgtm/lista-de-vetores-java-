import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    static final Locale BR = Locale.forLanguageTag("pt-BR");

    // Função: IMC = peso / altura²
    static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Função: classificação pelo IMC
    static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    // Procedimento
    static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            System.out.printf(BR, "Pessoa %d: IMC %.2f - %s%n", (i + 1), imc, classificarImc(imc));
        }
    }

    // Lê um número aceitando vírgula ou ponto
    static double lerDecimal(Scanner sc) {
        return Double.parseDouble(sc.next().replace(',', '.'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Peso da pessoa " + (i + 1) + " (kg): ");
            pesos[i] = lerDecimal(sc);
            System.out.print("Altura da pessoa " + (i + 1) + " (m): ");
            alturas[i] = lerDecimal(sc);
        }

        System.out.println();
        exibirRelatorio(pesos, alturas);
        sc.close();
    }
}
