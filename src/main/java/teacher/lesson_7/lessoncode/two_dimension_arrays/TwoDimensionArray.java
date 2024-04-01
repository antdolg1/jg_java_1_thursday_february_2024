package teacher.lesson_7.lessoncode.two_dimension_arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {

        //создание пустого двумерного массива размером 3 на 3
        int[][] matrix = new int[3][3];

        //создание и инициализация двумерного массива
        int[][] table = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 19, 20, 2},
                {4}
        };

        //доступ к элементам двумерных массивов
//        table[0][0];
//        table[0][1];
//        table[1][0];
        System.out.println(table[0][0]);
        table[0][0] = 12;
        System.out.println(table[0][0]);

        //итерация по двумерным массивам
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }
    }
}
