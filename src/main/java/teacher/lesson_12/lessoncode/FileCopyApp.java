package teacher.lesson_12.lessoncode;

import java.io.*;

public class FileCopyApp {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop/";
        File sourceFile = new File(desktopPath + "source.txt");
        File destinationFile = new File(desktopPath + "destination.txt");

        try {
            if (!destinationFile.exists()) {
                destinationFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
            return; //выходим из программы, если не удалось создать файл
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Текст файла успешно скопирован");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при копировании файла: " + e.getMessage());
        }
    }
}
