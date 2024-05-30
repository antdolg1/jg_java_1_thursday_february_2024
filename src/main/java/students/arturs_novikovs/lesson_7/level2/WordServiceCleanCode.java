package students.arturs_novikovs.lesson_7.level2;

import java.util.HashMap;
import java.util.Map;

class WordServiceCleanCode {
 String findMostFrequentWord(String text) {
String[] words = cleanAndSplitText(text);
Map<String, Integer> wordCount = countWordOccurrences(words);
        return findMostFrequentWordInMap(wordCount);
    }

String[] cleanAndSplitText(String text) {
    text = text.toLowerCase().replaceAll("[^а-яА-Я ]", "");
    return text.split("\\s+");
}

Map<String, Integer> countWordOccurrences(String[] words) {
    Map<String, Integer> wordCount = new HashMap<>();
    for (String word : words) {
        if (!word.isEmpty()) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }
    return wordCount;
}

String findMostFrequentWordInMap(Map<String, Integer> wordCount) {
    String mostFrequentWord = null;
    int maxCount = 0;
    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        if (entry.getValue() > maxCount) {
            maxCount = entry.getValue();
            mostFrequentWord = entry.getKey();
        }
    }
    return mostFrequentWord;
}
}
