package students.nikola_korovacka.lesson_4;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadiet veselu skaitli: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Ievadītais skaitlis ir pāra.");
        } else {
            System.out.println("Ievadītais skaitlis ir nepāra.");
        }
    }
}
