package students.karina_cmile.lesson_7.level_1_intern;

import java.util.Arrays;
public class TestWordService {

    // Test with the simple text
    public static String[] splitTheSentenceOne() {
        String sentence = "1, 2, 2, 2";
        System.out.println("Text is: " +sentence);
        String[] words = sentence.split("[, ?.@]+");
        Arrays.sort(words);
        return words;
    }
    public static String[] findTheMostFrequentWordOne() {
        String[] words1 = TestWordService.splitTheSentenceOne();
        int max = 0;
        int count = 1;
        String word = words1[0];
        String curr = words1[0];
        for (int i = 1; i < words1.length; i++) {
            if (words1[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = words1[i];
            }
            if (max < count) {
                max = count;
                word = words1[i];
            }
        }
        System.out.println("The most frequent word in the sentence is '" + word + "' and it is repeated " + max + " times.");
        return words1;
    }

    // Test with the same the most frequent word number
    public static String[] splitTheSentenceTwo() {
        String sentence = "1, 2, 2, 2, 1, 1";
        System.out.println("Text is: " +sentence);
        String[] words = sentence.split("[, ?.@]+");
        Arrays.sort(words);
        return words;
    }
    public static String[] findTheMostFrequentWordTwo() {
        String[] words1 = TestWordService.splitTheSentenceTwo();
        int max = 0;
        int count = 1;
        String word = words1[0];
        String curr = words1[0];
        for (int i = 1; i < words1.length; i++) {
            if (words1[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = words1[i];
            }
            if (max < count) {
                max = count;
                word = words1[i];
            }
        }
        System.out.println("The most frequent word in the sentence is '" + word + "' and it is repeated " + max + " times.");
        return words1;
    }

    // Test with no repeated words
    public static String[] splitTheSentenceThree() {
        String sentence = "1, 2, 3, 4, 5";
        System.out.println("Text is: " +sentence);
        String[] words = sentence.split("[, ?.@]+");
        Arrays.sort(words);
        return words;
    }
    public static String[] findTheMostFrequentWordThree() {
        String[] words1 = TestWordService.splitTheSentenceThree();
        int max = 0;
        int count = 1;
        String word = words1[0];
        String curr = words1[0];
        for (int i = 1; i < words1.length; i++) {
            if (words1[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = words1[i];
            }
            if (max < count) {
                max = count;
                word = words1[i];
            }
        }
        System.out.println("The most frequent word in the sentence is '" + word + "' and it is repeated " + max + " times.");
        return words1;
    }

    // Test with the void text
    public static String[] splitTheSentenceFour() {
        String sentence = " ";
        System.out.println("Text is: " +sentence);
        String[] words = sentence.split("[, ?.@]+");
        Arrays.sort(words);
        return words;
    }
    public static String[] findTheMostFrequentWordFour() {
        String[] words1 = TestWordService.splitTheSentenceFour();
        int max = 0;
        int count = 1;
        String word = words1[0];
        String curr = words1[0];
        for (int i = 1; i < words1.length; i++) {
            if (words1[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = words1[i];
            }
            if (max < count) {
                max = count;
                word = words1[i];
            }
        }
        System.out.println("The most frequent word in the sentence is '" + word + "' and it is repeated " + max + " times.");
        return words1;
    }

    // Test with only one word
    public static String[] splitTheSentenceFive() {
        String sentence = "1";
        System.out.println("Text is: " +sentence);
        String[] words = sentence.split("[, ?.@]+");
        Arrays.sort(words);
        return words;
    }
    public static String[] findTheMostFrequentWordFive() {
        String[] words1 = TestWordService.splitTheSentenceFive();
        int max = 0;
        int count = 1;
        String word = words1[0];
        String curr = words1[0];
        for (int i = 1; i < words1.length; i++) {
            if (words1[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = words1[i];
            }
            if (max < count) {
                max = count;
                word = words1[i];
            }
        }
        System.out.println("The most frequent word in the sentence is '" + word + "' and it is repeated " + max + " times.");
        return words1;
    }


    public static void main(String[] args) {
        TestWordService.splitTheSentenceOne();
        TestWordService.findTheMostFrequentWordOne();

        TestWordService.splitTheSentenceTwo();
        TestWordService.findTheMostFrequentWordTwo();

        TestWordService.splitTheSentenceThree();
        TestWordService.findTheMostFrequentWordThree();

//        TestWordService.splitTheSentenceFour();
//        TestWordService.findTheMostFrequentWordFour();

        TestWordService.splitTheSentenceFive();
        TestWordService.findTheMostFrequentWordFive();
    }
}
