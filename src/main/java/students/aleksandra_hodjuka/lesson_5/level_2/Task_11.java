package students.aleksandra_hodjuka.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first number!");
        numbers[0] = scanner.nextInt();
        System.out.println("Please, enter your second number!");
        numbers[1] = scanner.nextInt();
        System.out.println("Please, enter your third number!");
        numbers[2] = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]" + " = " + numbers[i]);
        }


    }
}