package teacher.lesson_16.lessoncode;

import java.util.Scanner;

public class Question_11_quizz {
    public static void main(String[] args) {

//        int a, b;
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextFloat();


        for (int i = 10; i < 20; i += 2) {
            if (i > 15) {
                break;
            }

            if (i % 4 == 0) {
                continue;
            }

            System.out.print(i);
        }

    }
}
