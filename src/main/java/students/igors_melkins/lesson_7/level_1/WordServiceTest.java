package students.igors_melkins.lesson_7.level_1;

import students.aleksandra_hodjuka.lesson_7.WordService;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.testFindMostFrequentWord();
    }
    public void  testFindMostFrequentWord (){
        WordService wordService = new WordService();

        String text1 = "Kiwi, apple, grapes, bananas, apple, orange ";
        System.out.println("Test 1 result is : "+ wordService.findMostFrequentWord(text1));

        String text2 = "Kiwi,grapes bananas, orange ";
        System.out.println("Test 2 result is : " + wordService.findMostFrequentWord(text2));

        String text3 = " Kiwi ,apple ,bananas,apple ";
        System.out.println("Test 3 result is : " + wordService.findMostFrequentWord(text3));

        String text4 = " ";
        System.out.println("Test 4 result is : " + wordService.findMostFrequentWord(text4));

        String text5 = " Kiwi,grapes,bananas,orange ";
        System.out.println("Test 5 result is : " + wordService.findMostFrequentWord(text5));
    }

    private void assertEquals (String text , String mostFrequentWord){

    }



}
