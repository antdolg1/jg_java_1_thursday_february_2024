package students.kristina_manevica.lesson_7.homework.level_1;

public class WordServiceUtil {

    public static String[] splitText(String text) {
        return text.toLowerCase().replaceAll("[\\p{Punct}\\p{IsPunctuation}]", " ").split("\\s+");
    }

    public static int[] countWordOccurrences(String[] textArray) {
        int[] wordCounts = new int[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            for (String word : textArray) {
                if (textArray[i].equals(word)) {
                    wordCounts[i]++;
                }
            }
        }
        return wordCounts;
    }

    public static int findMaxWordIndex(int[] array) {
        int maxWordIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxWordIndex]) {
                maxWordIndex = i;
            }
        }
        return maxWordIndex;
    }
}
