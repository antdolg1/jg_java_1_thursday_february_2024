package students.aleksandra_hodjuka.lesson_15.level_1;

public class WordsService {
    public int countRepetitions(String[] words, String repeatedWord) {
        int amountOfRepetitions = 0;
        for (String word : words) {
            if (word.equals(repeatedWord)) {
                amountOfRepetitions++;
            }
        }
        return amountOfRepetitions;
}
}