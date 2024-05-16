package students.aleksandra_hodjuka.lesson_6.level_6;

public class ArtificialIntellect {
    public static void makeMove(int[][] board, int player) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == -1) { // Пустая клетка обозначается -1
                    board[i][j] = player;
                    return; //Этот искусственный интеллект будет начинать поиск пустых клеток с
                    // верхнего левого угла игрового поля и делать ход в первую попавшуюся пустую клетку.
                }
            }
        }
    }

}
