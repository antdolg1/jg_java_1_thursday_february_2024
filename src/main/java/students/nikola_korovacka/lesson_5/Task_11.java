package students.nikola_korovacka.lesson_5;
import java.util.Scanner;
public class Task_11 {
        public static void main(String[] args) {
            int[] numbers = new int[3];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Введите целое число для ячейки " + i + ": ");
                numbers[i] = scanner.nextInt();
            }

            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
        }


}
