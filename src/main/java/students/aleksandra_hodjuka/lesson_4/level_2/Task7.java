package students.aleksandra_hodjuka.lesson_4.level_2;

import java.util.Scanner;

 class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите любое целое число!");
        int A = scanner.nextInt();
        System.out.println("Пожалуйста, введите еще одно целое число!");
        int B = scanner.nextInt();


        if (A == B) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }


    }

}
