package students.nikola_korovacka.lesson_2;
import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
