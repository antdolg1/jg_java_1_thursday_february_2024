package students.arturs_novikovs.lesson_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordServiceTest {

    @Test
    void findMostFrequentWord() { WordService wordService = new WordService();
        String text = "слово";
        String result = wordService.findMostFrequentWord(text);
        assertEquals("слово", result);
    }

    @Test
    void findMostFrequentWord_normalText() {
        WordService wordService = new WordService();
        String text = "этот текст содержит несколько слов текст несколько раз";
        String result = wordService.findMostFrequentWord(text);
        assertEquals("текст", result);
    }

    @Test
    void findMostFrequentWord_multipleMostFrequent() {
        WordService wordService = new WordService();
        String text = "слово раз слово два раз слово два";
        String result = wordService.findMostFrequentWord(text);
        assertTrue(result.equals("слово") || result.equals("раз") || result.equals("два"));
    }

    @Test
    void findMostFrequentWord_noWords() {
        WordService wordService = new WordService();
        String text = "";
        String result = wordService.findMostFrequentWord(text);
        assertEquals("", result);
    }

    @Test
    void findMostFrequentWord_largeText() {
        WordService wordService = new WordService();
        String text = """
                Конечно эту задачу можно решить в лоб не разбивая на более
                маленькие подзадачи. В реальных проектах более сложные задачи
                в лоб решать будет гораздо сложнее. Поэтому давайте учиться
                разбивать наши задачи на более простые. Будем учиться применять
                принцип разделяй и властвуй. Любую более сложную задачу можно
                разбить на более маленькие подзадачи. Решать маленькие подзадачи
                намного проще чем решать одну большую сложную задачу""";
        String result = wordService.findMostFrequentWord(text);
        assertEquals("более", result);
    }
}