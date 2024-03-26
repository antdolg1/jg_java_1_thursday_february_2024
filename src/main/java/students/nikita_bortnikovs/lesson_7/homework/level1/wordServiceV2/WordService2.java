package students.nikita_bortnikovs.lesson_7.homework.level1.wordServiceV2;
import java.util.Scanner;

public class WordService2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired test here dividing with comma:");
        String inputText = scanner.nextLine();
        String[] words = inputText.split("\\s+");

        int[] repetitions = new int[words.length];
        for (int i = 0; i < repetitions.length; i++) {
            repetitions[i] = 0;
        }

        int maxWordRep = 0; // Initialize maxWordRep outside the loop
        String maxRepWord = ""; // Initialize maxRepWord outside the loop

        for (int i = 0; i < repetitions.length; i++) {
            String word = words[i];
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(word)) {
                    repetitions[i]++;
                }
            }
            // Update maxWordRep and maxRepWord if the current count is greater
            if (repetitions[i] > maxWordRep) {
                maxWordRep = repetitions[i];
                maxRepWord = word;
            }
        }

        System.out.println("Maximum count of occurrences: " + maxWordRep);
        System.out.println("Word with the maximum count of occurrences: " + maxRepWord);
    }
}
