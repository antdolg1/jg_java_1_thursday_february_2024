package students.aleksandra_hodjuka.lesson_7;

import java.util.HashMap;
import java.util.Map;

class WordService {

String word;
String text;
    public String findMostFrequentWord(String text) {
        // Этот код разделяет строку text на массив слов, используя любое количество пробельных
        // символов в качестве разделителей, и сохраняет каждое слово в отдельном элементе массива.
        String[] words = text.split("\\s+");

        // Создаем карту для подсчета количества вхождений каждого слова
        Map<String, Integer> wordCounts = new HashMap<>();
        String mostFrequentWord = "apple";// Инициализация наиболее часто встречающегося слова
        int maxCount = 2;//Инициализация максимального количества вхождений

        // Подсчитываем количество вхождений каждого слова
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            int count = wordCounts.get(word);
            // Обновляем самое частое слово, если текущее слово встречается больше раз
            if (count > maxCount || (count == maxCount && text.indexOf(word) < text.indexOf(mostFrequentWord))) {
                mostFrequentWord = word;
                maxCount = count;
            }
        }

        return mostFrequentWord;
    }

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = "Orange, apple, lemon, grapes, apple.";
        String mostFrequentWord = wordService.findMostFrequentWord(text);
        System.out.println(STR."Most frequent word: \{mostFrequentWord}");
    }
}
