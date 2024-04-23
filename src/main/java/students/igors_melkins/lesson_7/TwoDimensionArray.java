package students.igors_melkins.lesson_7;

public class TwoDimensionArray {
    public static void main(String[] args) {
        // создадим двехмернй массив 3 на 3

        int [] [] matrix = new int[3][3];

        // создание интилицазия двухмерного массива

        int [] [] table = {
                {1,2,3},
                {4,5,6},
                {7,8,9,19,20,2},
                {4}
        };

        // доступ к жлементам двухмерных массивов
//        table[0][0];
//        table[0][1];
//        table[1][0];

        System.out.println(table[0][0]);
        table[0][0] = 12;
        System.out.println(table[0][0]);

        //итерация по двумерным массивам
        for (int row = 0;row < table.length;row++ ){
            for (int col =0;col < table.length;col++){
                System.out.println(table[row][col] + "");
            }
            System.out.println();
        }

    }
}
