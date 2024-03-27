package students.kristina_manevica.lesson_4;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        System.out.println("Enter your age: ");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 0 && age <= 10) {
            System.out.println("Child");
        } else if (age > 10 && age <= 17) {
            System.out.println("Middle");
        } else if (age > 17 && age <= 33) {
            System.out.println("Student");
        } else {
            System.out.println("You are dead");
        }
    }
}
