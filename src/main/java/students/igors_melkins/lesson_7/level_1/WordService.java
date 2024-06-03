package students.igors_melkins.lesson_7.level_1;

import java.util.HashMap;
import java.util.Map;

public class WordService {
        String text = "Kiwi, apple, grapes, bananas,apple, orange ";

        String findMostFrequentWord (String text) {
            String [] words = text.split("\\s*,\\s*");
            Map< String,Integer > wordCount = new HashMap<>();

            String mostFrequentWord = " ";
            int maxCount = 0 ;

            for (String word : words ) {
                word = word.toLowerCase();
                int count = wordCount.getOrDefault(word, 0) + 1;
                wordCount.put(word,count);

                if (count > maxCount|| (count == maxCount && text.indexOf(word) < text.indexOf(mostFrequentWord))){
                    mostFrequentWord = word;
                    maxCount = count;
                }
            }
            return mostFrequentWord;
        }

        public static void main (String [] args ){
            WordService wordService = new WordService();
            String mostFrequentWord = wordService.findMostFrequentWord(wordService.text);
            System.out.println("The most frequent word is : " + mostFrequentWord);
        }

    }






