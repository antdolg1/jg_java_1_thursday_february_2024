package students.slava_subacius.lesson_7.level_1;

import java.util.Arrays;

public class WordServiceTest {
    public static void main(String[] args) {
        testSplitTextIntoWords();
        testCountWordOccurrences();
        testFindIndexOfMaxCount();
        testFindMostFrequentWord();
    }

    static void testSplitTextIntoWords() {
        WordService wordService = new WordService();
        String text = "This is a test sentence.";
        String[] expectedWords = {"This", "is", "a", "test", "sentence."};
        String[] result = wordService.splitTextIntoWords(text);
        if (arraysEqual(result, expectedWords)) {
            System.out.println("testSplitTextIntoWords passed");
        } else {
            System.out.println("testSplitTextIntoWords failed");
        }
    }

    static void testCountWordOccurrences() {
        WordService wordService = new WordService();
        String[] words = {"This", "is", "a", "test", "sentence", "This"};
        int[] expectedCounts = {2, 1, 1, 1, 1, 2};
        int[] result = new int[]{wordService.countWordOccurrences(words)};
        if (arraysEqual(result, expectedCounts)) {
            System.out.println("testCountWordOccurrences passed");
        } else {
            System.out.println("testCountWordOccurrences failed");
        }
    }

    static void testFindIndexOfMaxCount() {
        WordService wordService = new WordService();
        int[] wordCounts = {2, 1, 1, 1, 1, 2};
        int expectedResult = 0;
        int result = wordService.findIndexOfMaxCount(wordCounts);
        if (result == expectedResult) {
            System.out.println("testFindIndexOfMaxCount passed");
        } else {
            System.out.println("testFindIndexOfMaxCount failed");
        }
    }

    static void testFindMostFrequentWord() {
        WordService wordService = new WordService();
        String text = "This is a test sentence. This is another test.";
        String expectedResult = "is";
        String result = wordService.findMostFrequentWord(text);
        if (result.equals(expectedResult)) {
            System.out.println("testFindMostFrequentWord passed");
        } else {
            System.out.println("testFindMostFrequentWord failed");
        }
    }

    static boolean arraysEqual(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}





