package students.arturs_novikovs.lesson_5.level_2;
import java.util.Random;
public class Task_12NewMethod {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        System.out.println("Values of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
}
//Это не отменяет , того что я тупой. xD
