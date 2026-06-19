public class FuncoesVerificacao {

    public static boolean ganhou(char[][] m, char jogador) {

        for (int i = 0; i < 3; i++) {
            if (m[i][0] == jogador && m[i][1] == jogador && m[i][2] == jogador)
                return true;
        }

        for (int j = 0; j < 3; j++) {
            if (m[0][j] == jogador && m[1][j] == jogador && m[2][j] == jogador)
                return true;
        }

        if (m[0][0] == jogador && m[1][1] == jogador && m[2][2] == jogador)
            return true;

        if (m[0][2] == jogador && m[1][1] == jogador && m[2][0] == jogador)
            return true;

        return false;
    }
}