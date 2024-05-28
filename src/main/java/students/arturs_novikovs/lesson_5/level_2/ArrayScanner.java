package students.arturs_novikovs.lesson_5.level_2;
 import java.util.Scanner;
public class ArrayScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        for(int i=0; i< array.length; i++){
            System.out.print("Пожалуйста введите число : ");
            array[i]=scan.nextInt();
            System.out.printf("Новый элемент массива - %s\n", array[i]);
        }
    }
}

