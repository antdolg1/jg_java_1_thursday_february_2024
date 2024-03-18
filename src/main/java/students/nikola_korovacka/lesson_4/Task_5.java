package students.nikola_korovacka.lesson_4;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pirmais skaitlis
        System.out.print("Ievadiet pirmo veselu skaitli: ");
        int firstNumber = scanner.nextInt();
        //Otrs skaitlis
        System.out.print("Ievadiet otro veselu skaitli: ");
        int secondNumber = scanner.nextInt();
        //Salīdzinam skaitļus
        if (firstNumber > secondNumber) {
            System.out.println("Lielākais skaitlis ir: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Lielākais skaitlis ir: " + secondNumber);
        } else {
            System.out.println("Skaitļi ir vienādi.");
        }

    }
}
