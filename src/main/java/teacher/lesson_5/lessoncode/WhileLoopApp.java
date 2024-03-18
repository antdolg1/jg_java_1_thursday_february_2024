package teacher.lesson_5.lessoncode;

import java.util.Scanner;

public class WhileLoopApp {
    public static void main(String[] args) {

//        byte countDown = 5;
//
//        while (countDown >= 0) {
//            System.out.println("До старта: " + countDown);
//            countDown--;
//        }
//        System.out.println("Стартуем!");

        //пример бесконечного цикла
//        while (true) {
//            System.out.println("INFINITE!");
//        }

        int attemptCount = 3;
        Scanner scanner = new Scanner(System.in);
        String password = "0000";

        while (attemptCount > 0) {
            System.out.println("Пожалуйста введите пароль:");
            if (password.equals(scanner.nextLine())) {
                System.out.println("Добро пожаловать в ваш личный кабинет!");
                break;
            }
            attemptCount--;
            System.out.println("Неверный пароль. Попробуйте ещё раз. Осталось " + attemptCount + " попытки.");
            if (attemptCount == 0) {
                System.out.println("Вы ввели неправильный пароль три раза, ваш аккаунт заблокирован!");
            }
        }

    }
}
