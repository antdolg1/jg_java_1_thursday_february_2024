package teacher.lesson_6.lessoncode;

import java.util.Scanner;

public class StaticInitializationBlock {

    static String staticString;

    //это статический блок инициализации
    static {
        System.out.println("Был инициализирован статический блок");
        Scanner scanner = new Scanner(System.in);
        staticString = scanner.nextLine();
    }

    public static void main(String[] args) {

        System.out.println("staticString value is: " + staticString);
    }

}
