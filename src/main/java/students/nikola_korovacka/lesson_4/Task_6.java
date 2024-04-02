package students.nikola_korovacka.lesson_4;
import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ievadiet pirmo skaitli: ");
        int number1 = scanner.nextInt();
        //Otrs skaitlis
        System.out.print("Ievadiet otro veselu skaitli: ");
        int number2 = scanner.nextInt();
        //Salīdzinam skaitļus
        if (number1 > number2) {
            System.out.println("Lielākais skaitlis ir: " + number1);
        } else if (number2 > number1) {
            System.out.println("Lielākais skaitlis ir: " + number2);
        } else {
            System.out.println("Skaitļi ir vienādi.");
        }

    }
}
