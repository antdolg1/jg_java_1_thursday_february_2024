package students.kristina_manevica.lesson_7.homework.level_1;

public class WordService {

    public static String findMostFrequentWord(String text) {
        String[] textArray = WordServiceUtil.splitText(text);
        int[] wordCountsArray = WordServiceUtil.countWordOccurrences(textArray);
        int maxWordIndex = WordServiceUtil.findMaxWordIndex(wordCountsArray);
        return textArray[maxWordIndex];
    }
}