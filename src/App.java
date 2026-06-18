import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] matriz = { { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' } };
        Scanner sc = new Scanner(System.in);

        for (int jogada = 0; jogada < 9; jogada++) {
            System.out.println("Qual a linha?");
            int linha = sc.nextInt();

            System.out.println("Qual a coluna?");
            int coluna = sc.nextInt();
            
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
