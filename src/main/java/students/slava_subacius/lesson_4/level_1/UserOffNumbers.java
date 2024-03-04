package students.slava_subacius.lesson_4.level_1;

import java.util.Scanner;

public class UserOffNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number : ");
        int numbers = scanner.nextInt();
        if (numbers > 0) {
            System.out.println("Positive number");
        } else if (numbers < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Equal to zero");
        }
    }
}
