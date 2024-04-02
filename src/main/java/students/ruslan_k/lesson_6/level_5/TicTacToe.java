package students.ruslan_k.lesson_6.level_5;

public class TicTacToe {
    public static boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[0][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][0] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean lrDiag = field[0][0] == field[1][1] && field[1][1] == field[2][2];
        boolean rlDiag = field[0][2] == field[1][1] && field[1][1] == field[2][0];
        return (lrDiag || rlDiag) && field[1][1] == playerToCheck;

    }

    public static boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForVerticals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck);
    }

    public static boolean isDrawPosition(int[][] field) {
        boolean win0;
        boolean win1;
        win0 = ticTacToeEndCheck(field) && isWinPosition(field, 0);
        win1 = ticTacToeEndCheck(field) && isWinPosition(field, 1);
        return !(win0 || win1);
    }

    public static boolean ticTacToeEndCheck(int[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1) return false;
            }
        }
        return true;
    }

    public static void ticTacToeErase(int[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = -1;
            }
        }
    }

    public static boolean ticTacToeFill(int[][] field, int x, int y, int player) {
        if (field[x][y] != -1) {
            field[x][y] = player;
            return true;
        }
        return false;
    }
    
}
