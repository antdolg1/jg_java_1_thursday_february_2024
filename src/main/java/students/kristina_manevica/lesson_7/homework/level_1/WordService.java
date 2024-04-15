package students.kristina_manevica.lesson_7.homework.level_1;

public class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray = WordServiceUtils.splitText(text);
        int[] wordCountsArray = WordServiceUtils.countWordOccurrences(textArray);
        int maxWordIndex = WordServiceUtils.findMaxWordIndex(wordCountsArray);
        return textArray[maxWordIndex];
    }

    public static void main(String[] args) {

    }


}