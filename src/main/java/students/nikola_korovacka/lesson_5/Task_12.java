package students.nikola_korovacka.lesson_5;
import java.util.Random;
public class Task_12 {
        public static void main(String[] args) {
            int[] numbers = new int[3];
            Random random = new Random();

            // Заполнение каждой ячейки массива случайным числом
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(); // Генерация случайного числа
            }

            System.out.println("Values of the array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element " + i + ": " + numbers[i]);
            }
        }
}


