package students.nikola_korovacka.lesson_5;
import java.util.Random;
public class Task_14 {
        public static void main(String[] args) {
            int[] numbers = new int[3];
            Random random = new Random();
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100); //Генерация случайного числа от 0 до 99
                sum += numbers[i]; //Добавление числа к сумме
            }
            //Расчет среднего значения
            double average = (double) sum / numbers.length;
            // Вывод среднего значения на консоль
            System.out.println("Average of all elements: " + average);
        }
}
