package students.aleksandra_hodjuka.lesson_7;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.testFindMostFrequentWord();
    }

    public void testFindMostFrequentWord() {
        WordService wordService = new WordService();

        // Тестирование с текстом "apple, orange, apple grapes, lemon"
        String text1 = "apple, orange, apple grapes, lemon";
        System.out.println("Test 1 result is: " + wordService.findMostFrequentWord(text1));

        // Тестирование с текстом, в котором все слова встречаются один раз
        String text2 = "apple orange grapes lemon";
        System.out.println("Test 2 result is: " + wordService.findMostFrequentWord(text2));

        // Тестирование с текстом, в котором несколько слов встречаются одинаковое количество раз
        String text3 = "apple, orange, orange, lemon, apple";
        System.out.println("Test 3 result is: " + wordService.findMostFrequentWord(text3));

        // Тестирование с пустым текстом
        String text4 = "";
        System.out.println("Test 4 result is: " + wordService.findMostFrequentWord(text4));

        // Тестирование с текстом, содержащим только одно слово
        String text5 = "apple";
        System.out.println("Test 5 result is: " + wordService.findMostFrequentWord(text5));
    }

    private void assertEquals(String text, String mostFrequentWord) {
    }
}
