package students.aleksandra_hodjuka.lesson_6.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void testIsWinPositionForVerticals() {
        TicTacToe game = new TicTacToe();
        int[][] field = {
                {0, 1, 0},
                {0, 1, 1},
                {0, 1, 0}
        };
        assertTrue(game.isWinPositionForVerticals(field, 0));
    }

    @Test
    public void testIsWinPositionForHorizontals() {
        TicTacToe game = new TicTacToe();
        int[][] field = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 0, 1}
        };
        assertTrue(game.isWinPositionForHorizontals(field, 0));
    }

    @Test
    public void testIsWinPositionForDiagonals() {
        TicTacToe game = new TicTacToe();
        int[][] field = {
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };
        assertTrue(game.isWinPositionForDiagonals(field, 0));
    }

    @Test
    public void testIsWinPosition() {
        TicTacToe game = new TicTacToe();
        int[][] field = {
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };
        assertTrue(game.isWinPosition(field, 0));
    }

    @Test
    public void testIsDrawPosition() {
        TicTacToe game = new TicTacToe();
        int[][] field = {
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };
        assertFalse(game.isDrawPosition(field));
    }

}