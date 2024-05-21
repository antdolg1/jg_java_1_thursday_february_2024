package teacher.lesson_12.lessoncode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileApp {
    public static void main(String[] args) {
        String separator = File.separator;
        System.out.println(separator);
        String pathToFile = separator + "Users" + separator + "antonsdolgopolovs/Desktop/Lesson12.txt";
        File file = new File(pathToFile);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл с таким названием не был найден на рабочем столе!");
            e.printStackTrace();
        }

        System.out.println("Программа работает дальше....");
        System.out.println("Программа работает дальше....");
        System.out.println("Программа работает дальше....");

    }
}
