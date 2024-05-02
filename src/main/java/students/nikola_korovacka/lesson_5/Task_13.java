package students.nikola_korovacka.lesson_5;
import java.util.Random;
public class Task_13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        //Заполнение каждой ячейки массива случайным числом и суммa
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); //Генерация случайного числа от 0 до 99
            sum += numbers[i]; //Добавление числа к сумме
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
