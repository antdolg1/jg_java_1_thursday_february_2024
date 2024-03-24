package students.kristina_manevica.lesson_4.homework.level_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter int number (except 0):");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        System.out.println("Number is " + (userNumber > 0 ? "positive" : "negative"));
    }
}
