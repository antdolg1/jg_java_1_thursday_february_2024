package students.aleksandra_hodjuka.lesson_4.level_1;

import java.util.Scanner;

 class Task2 {

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите любое целое число!");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0 ) {
            System.out.println("Число отрицательное");
        } else if (number == 0) {
            System.out.println("Число равно нулю.");
        } else {
            System.out.println("Число положительное");
        }





    }
}
