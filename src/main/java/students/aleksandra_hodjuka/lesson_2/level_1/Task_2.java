package students.aleksandra_hodjuka.lesson_2.level_1;

import java.util.Scanner;

 class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first fractional number!");
        double A = scanner.nextDouble();
        System.out.println("Please, enter your second fractional number!");
        double B = scanner.nextDouble();

        double sum = A + B;
        double sub = A - B;
        double mult = A * B;
        double div = A / B;

        System.out.println("The result of sum is " + sum);
        System.out.println("The result of sub is " + sub);
        System.out.println("The result of mult is " + mult);
        System.out.println("The result of div is " + div);


    }


}
