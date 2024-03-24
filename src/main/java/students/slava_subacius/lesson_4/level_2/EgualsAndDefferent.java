package students.slava_subacius.lesson_4.level_2;

import java.util.Scanner;

public class EgualsAndDefferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
