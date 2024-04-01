package students.nikola_korovacka.lesson_4;
import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
        // Izveidojam skeneri, lai lasītu lietotāja ievadi
        Scanner scanner = new Scanner(System.in);

        // Prasam lietotājam ievadīt pirmo veselu skaitli
        System.out.print("Ievadiet pirmo veselu skaitli: ");
        int number1 = scanner.nextInt();

        // Prasam lietotājam ievadīt otro veselu skaitli
        System.out.print("Ievadiet otro veselu skaitli: ");
        int number2 = scanner.nextInt();

        // Izvadam atbilstošu paziņojumu par to, vai skaitļi ir vienādi vai atšķiras
        if (number1 == number2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
