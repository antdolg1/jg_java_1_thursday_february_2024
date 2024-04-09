package students.aleksandra_hodjuka.lesson_7;

import java.util.HashMap;
import java.util.Map;

public class WordService {
    String text = "Orange, apple, grapes, apple, lemon, tangerine";

    //Разбиваем текст на слова.//
    public static String findMostFrequentWord(String text) {
        String[] words = text.split("\\s*,\\s*");
        Map<String, Integer> wordCount = new HashMap<>();

//Создаем переменные, которые используются для отслеживания наиболее часто встречающегося слова и его частоты в тексте.//
        String mostFrequentWord = "";
        int maxCount = 0;
//Подсчитываем слова.//
        for (String word : words) {
            word = word.toLowerCase();
            int count = wordCount.getOrDefault(word, 0) + 1;
            wordCount.put(word, count);

            if (count > maxCount || (count == maxCount && text.indexOf(word) < text.indexOf(mostFrequentWord))) {
                mostFrequentWord = word;
                maxCount = count;
            }
        }

        return mostFrequentWord;
    }

    //Выводим самое частое слова на консоль.//
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String mostFrequentWord = wordService.findMostFrequentWord(wordService.text);
        System.out.println("The most frequent word is: " + mostFrequentWord);
    }
}