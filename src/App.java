import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] matriz = { { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' } };
        Scanner sc = new Scanner(System.in);

        for (int jogada = 0; jogada < 9; jogada++) {
            int linha;
            int coluna;

            while (true) {
                System.out.println("Qual a linha? (0-2)");
                linha = sc.nextInt();

                System.out.println("Qual a coluna? (0-2)");
                coluna = sc.nextInt();

                if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
                    break; // posição existe
                }

                System.out.println("Posição inválida! Tente novamente.");
            }

            if (jogada % 2 == 0) {
                matriz[linha][coluna] = 'X';
            } else {
                matriz[linha][coluna] = 'O';
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println();
            }
        }

    }

}
