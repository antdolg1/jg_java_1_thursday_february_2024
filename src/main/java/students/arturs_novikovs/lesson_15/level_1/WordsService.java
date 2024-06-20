package students.arturs_novikovs.lesson_15.level_1;

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
