import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        char[][] matriz = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };

        Scanner sc = new Scanner(System.in);

        for (int jogada = 0; jogada < 9; jogada++) {

            int linha;
            int coluna;

            while (true) {
                System.out.println("Qual a linha? (0-2)");
                linha = sc.nextInt();

                System.out.println("Qual a coluna? (0-2)");
                coluna = sc.nextInt();

                if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                    System.out.println("Posição inválida!");
                    continue;
                }

                if (matriz[linha][coluna] != ' ') {
                    System.out.println("Posição ocupada!");
                    continue;
                }

                break;
            }

            matriz[linha][coluna] = (jogada % 2 == 0) ? 'X' : 'O';

            if (FuncoesVerificacao.ganhou(matriz, 'X')) {
                System.out.println("X ganhou!");
                break;
            }

            if (FuncoesVerificacao.ganhou(matriz, 'O')) {
                System.out.println("O ganhou!");
                break;
            }

            System.out.println("Tabuleiro:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}