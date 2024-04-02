package students.aleksandra_hodjuka.lesson_2.level_3;

import java.util.Scanner;

 class Task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first number!");
        double A = scanner.nextInt();

        System.out.println("Please, enter your second number!");
        double B = scanner.nextInt();

        System.out.println("Please, enter your third number!");
        double C = scanner.nextInt();

        double averageNumber = A + B + C / 3;


        System.out.println(averageNumber);


    }
}
