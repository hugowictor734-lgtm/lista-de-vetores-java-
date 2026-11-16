public class Exercicio05 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Digite o elemento [" + i + "][" + j + "]: "));
            }
        }

        String diagonal = "";
        for (int i = 0; i < 3; i++) {
            diagonal += m[i][i] + " ";
        }

        IO.println("Diagonal principal: " + diagonal.trim());
    }
}
