package students.karina_cmile.lesson_2.homework.level_2_intern;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = scanner.next();
        System.out.println("Hello "+ name + "!");
    }
}
