package students.karina_cmile.lesson_7.level_1_intern;

import java.util.*;

public class WordService {

    public static String splitTheSentence() {
        String sentence = "Word1, Word1, Word2, Word1";
        String[] words = sentence.split("[, ?.@]+");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        return sentence;
    }

    public static String findTheMostFrequentWord(String[] words) {
        int max = 0;
        int count = 1;
        String word = words[0];
        String curr = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = words[i];
            }
            if (max < count) {
                max = count;
                word = words[i];
            }
        }
        System.out.println("The most frequent word in the sentence is "+ word+ " and it is repeated "+max + " times.");
        return word;
    }

    public static void main(String[] args) {
        String wordArr = WordService.splitTheSentence();
        // WordService.findTheMostFrequentWord();

    }

}


/*
        String sentence = "Word1, Word1, Word2, Word1, Word3, Word3, Word3, Word3, Word3, Word1, Word1, Word1";
        String[] words = sentence.split("[, ?.@]+"); // Splitting text into words and making an array.
        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); // Output the array.
        int max = 0; // Finding the frequency of words
        int count= 1;
        String word = words[0];
        String curr = words[0];
        for(int i = 1; i<words.length; i++){
            if(words[i].equals(curr)){
                count++; // Compare first word to the next, if equals ++ and finding max
            }
            else{
                count =1;
                curr = words[i];
            }
            if(max<count){
                max = count;
                word = words[i];
            }
        }
        System.out.println("The most frequent word in the sentence is "+ word+ " and it is repeated "+max + " times.");
    }
 */




