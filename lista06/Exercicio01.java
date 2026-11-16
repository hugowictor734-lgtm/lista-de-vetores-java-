public class Exercicio01 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        // leitura: i = linha, j = coluna
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Digite o elemento [" + i + "][" + j + "]: "));
            }
        }

        // exibição em forma de tabela
        IO.println("");
        for (int i = 0; i < 3; i++) {
            String linha = "";
            for (int j = 0; j < 3; j++) {
                linha += m[i][j] + " ";
            }
            IO.println(linha.trim());
        }
    }
}
