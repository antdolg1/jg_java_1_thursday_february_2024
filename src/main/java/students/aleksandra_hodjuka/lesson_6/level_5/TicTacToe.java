package students.aleksandra_hodjuka.lesson_6.level_5;

public class TicTacToe {
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int col = 0; col < field[0].length; col++) {
            boolean isVerticalWin = true;
            for (int row = 0; row < field.length; row++) {
                if (field[row][col] != playerToCheck) {
                    isVerticalWin = false;
                    break;
                }
            }
            if (isVerticalWin) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int row = 0; row < field.length; row++) {
            boolean isHorizontalWin = true;
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] != playerToCheck) {
                    isHorizontalWin = false;
                    break;
                }
            }
            if (isHorizontalWin) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        // Проверка диагоналей слева направо (\)
        boolean leftDiagonalWin = true;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                leftDiagonalWin = false;
                break;
            }
        }
        if (leftDiagonalWin) {
            return true;
        }

        // Проверка диагоналей справа налево (/)
        boolean rightDiagonalWin = true;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - 1 - i] != playerToCheck) {
                rightDiagonalWin = false;
                break;
            }
        }
        if (rightDiagonalWin) {
            return true;
        }

        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        // Проверяем наличие пустых клеток
        for (int[] row : field) {
            for (int cell : row) {
                if (cell == -1) {
                    return false; // Есть пустая клетка, позиция не ничейная
                }
            }
        }

        // Проверяем, не является ли позиция победной для какого-либо игрока
        if (isWinPosition(field, 0) || isWinPosition(field, 1)) {
            return false; // Позиция победна для одного из игроков, не ничейная
        }

        return true; // Все клетки заполнены, но нет победителя, позиция ничейна
    }
}

