package students.nikola_korovacka.lesson_5;
import java.util.Random;
public class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        System.out.println("Initial values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); //Генерация случайного числа от 0 до 99
            System.out.println("Element " + i + ": " + numbers[i]);
        }

        //Увеличение значения на 2
        System.out.println("Values after incrementing by 2:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
}
