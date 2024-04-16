package students.kristina_manevica.lesson_7.homework.level_1;

import java.util.Arrays;

public class WordServiceTests {

    private static final String text = "I'm a Barbie girl, in the Barbie world.";
    private static final String word = "barbie";
    private static final String[] expectedSplitText = {"i", "m", "a", "barbie", "girl", "in", "the", "barbie", "world"};
    private static final int[] expectedWordCount = {1, 1, 1, 2, 1, 1, 1, 2, 1};
    private static final int[] expectedWordCountNull = {1, 1, 1, 1, 1, 1, 1, 1, 1};


    public static void main(String[] args) {
        WordServiceTests test = new WordServiceTests();
        test.testSplitText();
        test.testCountWordOccurrences();
        test.testMaxWordIndex();
        test.testMostFrequentWord();
    }

    private static void testSplitText() {
        String[] actualResult = WordServiceUtil.splitText(text);
        System.out.println(Arrays.equals(actualResult, expectedSplitText) ? "Test testSplitText passed" :
                "Error in testSplitText");
    }

    private static void testCountWordOccurrences() {
        int[] actualResult = WordServiceUtil.countWordOccurrences(expectedSplitText);
        System.out.println(Arrays.equals(actualResult, expectedWordCount) ? "Test testCountWordOccurrences passed" :
                "Error in testCountWordOccurrences");
    }

    private static void testMaxWordIndex() {
        int expectedResult = 3;
        int actualResult = WordServiceUtil.findMaxWordIndex(expectedWordCount);
        System.out.println((expectedResult == actualResult) ? "Test testMaxWordIndex passed" :
                "Error in testMaxWordIndex");
    }

    private static void testMostFrequentWord() {
        String actualResult = WordService.findMostFrequentWord(text);
        System.out.println((actualResult.equals(word)) ? "Test testMostFrequentWord passed" :
                "Error in testMostFrequentWord");
    }
}