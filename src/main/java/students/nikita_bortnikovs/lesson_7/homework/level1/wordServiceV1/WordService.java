package students.nikita_bortnikovs.lesson_7.homework.level1.wordServiceV1;

import java.util.Scanner;

public class WordService {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired test here dividing with comma:");
        String inputText = scanner.nextLine();
        String[] text = inputText.split(",");

        WordServiceMethods wordServiceMethods = new WordServiceMethods();
        String mostFrequentWord = wordServiceMethods.findMostFrequentWord(text);
        System.out.println("The most frequent word is: " + mostFrequentWord);

}
}