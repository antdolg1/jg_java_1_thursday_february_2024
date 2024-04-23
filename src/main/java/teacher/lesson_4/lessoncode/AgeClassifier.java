package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {

        System.out.println("Пожалуйста введите свой возраст:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 0 && age <= 10) {
            System.out.println("Вы ребёнок");
        } else if (age > 10 && age <= 17) {
            System.out.println("Вы подросток");
        } else if (age > 17 && age <= 30) {
            System.out.println("Вы студент");
        } else if (age > 30 && age <= 60) {
            System.out.println("Вы взрослый человек");
        } else if (age >60 && age <= 100) {
            System.out.println("Вы очень взрослый человек");
        } else {
            System.out.println("Обратитесь за помощью в пасспортный стол");
        }
    }
}
