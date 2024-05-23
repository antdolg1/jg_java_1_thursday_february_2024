package students.igors_melkins.lesson_2.level_2;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you username!");
        String userName = scanner.next();
        System.out.println("Hello," + userName + "!");
    }
}
//add lesson2