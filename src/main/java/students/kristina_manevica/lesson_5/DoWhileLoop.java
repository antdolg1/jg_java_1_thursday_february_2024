package students.kristina_manevica.lesson_5;

import java.util.Scanner;

class DoWhileLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int userInputValue;

        do {
            System.out.println("Enter number from 1 to 10:");
            userInputValue = scanner.nextInt();
        } while (userInputValue != 7);

        System.out.println("You won!");

        do {
            System.out.println("Count is" + count);
            count++;
        } while (count < 11);
    }
}
