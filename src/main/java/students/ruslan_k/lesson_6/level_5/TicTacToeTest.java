package students.ruslan_k.lesson_6.level_5;

public class TicTacToeTest {
    public static void main(String[] args) {

        int[][] field= {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};

        ticTacToeFillHorizontal(field,0);
        boolean result= TicTacToe.isWinPositionForHorizontals(field,0);
        System.out.printf("Player \"0\" %s\n", result? "is Win by H": "yet not Win");
        result= TicTacToe.isWinPosition(field,0);
        System.out.printf("Player \"0\" %s\n", result? "is Win ": "yet not Win");

        TicTacToe.ticTacToeErase(field);
        ticTacToeFillVertical(field,0);
        result= TicTacToe.isWinPositionForVerticals(field,0);
        System.out.printf("Player \"0\" %s\n", result? "is Win by V": "yet not Win");
        result= TicTacToe.isWinPosition(field,0);
        System.out.printf("Player \"0\" %s\n", result? "is Win ": "yet not Win");

        TicTacToe.ticTacToeErase(field);
        ticTacToeFillRLDiag(field,0);
        result= TicTacToe.isWinPositionForDiagonals(field,0);
        System.out.printf("Player \"0\" %s\n", result? "is Win by RL Diag": "yet not Win");
        result= TicTacToe.isWinPosition(field,0);
        System.out.printf("Player \"0\" %s\n", result? "is Win ": "yet not Win");

        TicTacToe.ticTacToeErase(field);
        ticTacToeFillLRDiag(field,0);
        result= TicTacToe.isWinPositionForDiagonals(field,0);
        System.out.printf("Player \"0\" %s\n", result? "is Win by LR Diag": "yet not Win");
        result= TicTacToe.isWinPosition(field,0);
        System.out.printf("Player \"0\" %s\n", result? "is Win ": "yet not Win");

        ticTacToeFillLDraw(field);
        result=TicTacToe.isDrawPosition(field);
        System.out.println(result?"Draw": "More check");

    }

    public static void ticTacToeFill(int[][]field, int x, int y, int player){
        field[x][y]=player;
    }

    public static void ticTacToeFillHorizontal(int[][]field, int player){
        ticTacToeFill(field,0,1,player);
        ticTacToeFill(field,1,1,player);
        ticTacToeFill(field,2,1,player);
    }

    public static void ticTacToeFillVertical(int[][]field, int player){
        ticTacToeFill(field,1,0,player);
        ticTacToeFill(field,1,1,player);
        ticTacToeFill(field,1,2,player);
    }
    public static void ticTacToeFillRLDiag(int[][]field, int player){
        ticTacToeFill(field,0,0,player);
        ticTacToeFill(field,1,1,player);
        ticTacToeFill(field,2,2,player);
    }
    public static void ticTacToeFillLRDiag(int[][]field, int player){
        ticTacToeFill(field,0,2,player);
        ticTacToeFill(field,1,1,player);
        ticTacToeFill(field,2,0,player);
    }
    public static void ticTacToeFillLDraw(int[][]field){
        ticTacToeFill(field,0,0,0);
        ticTacToeFill(field,1,0,0);
        ticTacToeFill(field,2,1,0);
        ticTacToeFill(field,0,2,0);
        ticTacToeFill(field,2,0,1);
        ticTacToeFill(field,0,1,1);
        ticTacToeFill(field,1,1,1);
        ticTacToeFill(field,1,2,1);
        ticTacToeFill(field,2,2,1);
    }


}
