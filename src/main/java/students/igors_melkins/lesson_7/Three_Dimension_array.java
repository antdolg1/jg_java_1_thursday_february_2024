package students.igors_melkins.lesson_7;

public class Three_Dimension_array {
    public static void main (String [] args ){
        //создание трехмерного массива
        int [][][] matrixArray = new int [3][4][5];//3 матрицы.4строки.5 столбков

        //инициализация трезмерного массива
        for (int i=0;i<matrixArray.length;i++){//проходим по матрицам
            for (int j=0;j<matrixArray[i].length;j++){//проходим по строкам
                for (int k =0 ;k < matrixArray[i][j].length;k++){
                    matrixArray[i][j][k] = i+j+k;
                }

            }
        }
    }
}
