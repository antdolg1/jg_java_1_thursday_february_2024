package students.kristina_manevica.lesson_15.homework.level_1;

public class WordsService {

    public int countRepetitions(String[] words, String repeatedWord) {
        int repetitionsCount = 0;
        for (String word : words) {
            if (word.equals(repeatedWord)) {
                repetitionsCount++;
            }
        }
        return repetitionsCount;
    }
}