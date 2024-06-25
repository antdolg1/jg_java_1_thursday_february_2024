package students.nikola_korovacka.lesson_15;

class WordsService {

    public int countRepetitions(String[] words, String targetWord) {
        int repetitionCount = 0;
        for (String word : words) {
            if (word.equals(targetWord)) {
                repetitionCount++;
            }
        }
        return repetitionCount;
    }

}

