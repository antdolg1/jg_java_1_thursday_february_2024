package students.slava_subacius.lesson_4.level_1;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number : ");
        int numbers = scanner.nextInt();

        if(numbers % 2 == 0 ) {
            System.out.println("Тhe number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}

