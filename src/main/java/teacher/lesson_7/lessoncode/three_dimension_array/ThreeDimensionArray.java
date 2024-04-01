package teacher.lesson_7.lessoncode.three_dimension_array;

public class ThreeDimensionArray {
    public static void main(String[] args) {

        //создание трёхмерного массива
        int[][][] matrixArray = new int[3][4][5]; // 3 матрицы, 4 строки, 5 столбцов

        //инициализация трёхмерного массива
        for (int i = 0; i < matrixArray.length; i++) { //проходим по матрицам
            for (int j = 0; j < matrixArray[i].length; j++) { //проходим по строкам
                for (int k = 0; k < matrixArray[i][j].length; k++) { //проходим по столбикам
                    matrixArray[i][j][k] = i + j + k; //заполняем значениями
                }
            }
        }

        //вывод трёхмерного массива
        for (int i = 0; i < matrixArray.length; i++) {
            System.out.println("Матрица №" + (i + 1));
            for (int j = 0; j < matrixArray[i].length; j++) {
                for (int k = 0; k < matrixArray[i][j].length; k++) {
                    System.out.print(matrixArray[i][j][k] + " ");
                }
                System.out.println(); //новая пустая строка после каждой строки матрицы
            }
            System.out.println(); //новая пустая строка между матрицами
        }

    }
}
