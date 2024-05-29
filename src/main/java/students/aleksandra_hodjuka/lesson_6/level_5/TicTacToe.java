package students.aleksandra_hodjuka.lesson_6.level_5;

public class TicTacToe {
    public boolean isWinPositionForLines(int[][] field, int playerToCheck, boolean checkVerticals) {
        int size = field.length;

        for (int line = 0; line < size; line++) {
            boolean isWinningLine = true;
            for (int i = 0; i < size; i++) {
                int value = checkVerticals ? field[i][line] : field[line][i];
                if (value != playerToCheck) {
                    isWinningLine = false;
                    break;
                }
            }
            if (isWinningLine) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isWinPositionForLines(field, playerToCheck, true) || isWinPositionForLines(field, playerToCheck, false);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) || isWinPositionForLines(field, playerToCheck, true);
    }

    public boolean isDrawPosition(int[][] field) {
        for (int[] row : field) {
            for (int cell : row) {
                if (cell == -1) {
                    return false; // Есть пустая клетка, позиция не ничья
                }
            }
        }

        // Проверяем, не является ли позиция победной для какого-либо игрока
        if (isWinPosition(field, 0) || isWinPosition(field, 1)) {
            return false; // Позиция победна для одного из игроков, не ничья
        }

        return true; // Все клетки заполнены, но нет победителя, позиция ничья
    }
}

