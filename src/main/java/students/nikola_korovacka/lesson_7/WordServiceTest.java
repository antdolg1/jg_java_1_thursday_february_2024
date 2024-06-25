package students.nikola_korovacka.lesson_7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class WordServiceTest {
    static class WordService {

        // Метод разбивает текст на слова
        public String[] splitTextIntoWords(String text) {
            return text.split("\\s+"); // Использую пробел как разделитель
        }

        // Метод подсчитывает количество повторений каждого слова
        public Map<String, Integer> countWordOccurrences(String[] words) {
            Map<String, Integer> wordCountMap = new HashMap<>();
            for (String word : words) {
                // Если слово уже присутствует, увеличиваем количество повторений на 1, иначе добавляем слово в карту с начальным значением 1
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
            return wordCountMap;
        }

        // Метод находит слово с наибольшим количеством повторений
        public String findMostFrequentWord(Map<String, Integer> wordOccurrences) {
            int maxCount = 0;
            String mostFrequentWord = "";
            // Перебираю все записи
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                // Если количество повторений текущего слова больше максимального, обновляем максимальное количество и самое часто встречающееся слово
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequentWord = entry.getKey();
                }
            }
            return mostFrequentWord;
        }

        // Главный метод, который использует остальные методы для нахождения самого часто встречающегося слова
        public String findMostFrequentWord(String text) {
            String[] words = splitTextIntoWords(text); // Разбиваю текст на слова
            Map<String, Integer> wordOccurrences = countWordOccurrences(words); // Подсчитываю количество повторений каждого слова
            return findMostFrequentWord(wordOccurrences); // Нахож самое часто встречающееся слово
        }
    }
    // Тест для метода splitTextIntoWords
    @Test
    public void testSplitTextIntoWords() {
        WordService wordService = new WordService();
        String text = "hello world";
        String[] expected = {"hello", "world"};
        String[] actual = wordService.splitTextIntoWords(text);
        Assertions.assertArrayEquals(expected, actual);
    }

    // Тест для метода countWordOccurrences
    @Test
    public void testCountWordOccurrences() {
        WordService wordService = new WordService();
        String[] words = {"hello", "world", "hello"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        Map<String, Integer> actual = wordService.countWordOccurrences(words);
        Assertions.assertEquals(expected, actual);
    }

    // Тест для метода findMostFrequentWord
    @Test
    public void testFindMostFrequentWord() {
        WordService wordService = new WordService();
        Map<String, Integer> wordOccurrences = new HashMap<>();
        wordOccurrences.put("hello", 2);
        wordOccurrences.put("world", 1);
        String expected = "hello";
        String actual = wordService.findMostFrequentWord(wordOccurrences);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEmptyText() {
        WordService wordService = new WordService();
        String text = "";
        String expected = ""; // Если ввод пуст, возвращаем пустой результат.
        String actual = wordService.findMostFrequentWord(text);
        Assertions.assertEquals(expected, actual);
    }


    public String[] splitTextIntoWords(String text) {
        if (text.matches("[!@#$%^&*()]+")) { // Проверяем, содержит ли текст только специальные символы
            System.out.println("Введенный текст содержит только специальные символы!"); // Выводим сообщение
            return new String[0]; // Возвращаем пустой массив
        }
        return text.split("\\s+"); // В остальных случаях используем стандартное разделение
    }



    // Тест для главного метода findMostFrequentWord, который использует текст
    @Test
    public void testFindMostFrequentWordInText() {
        WordService wordService = new WordService();
        String text = "hello world hello";
        String expected = "hello";
        String actual = wordService.findMostFrequentWord(text);
        Assertions.assertEquals(expected, actual);
    }
}

