package students.karina_cmile.lesson_7.level_1_intern;

import java.util.Scanner;

class WordService {

    public static void main(String[] args) {

        System.out.println("Create sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();

        String[] words = sentence.split("[, ?.@]+");
        for (String word : words)
            System.out.println(word);

/*
        int size = words.length;
        for (int i = 0; i < size; i += 1) {
            int count = 0;

            String element = words[i];
            for (int j = 0; j < size; j += 1) {
                if (words[j].equals(element)) {
                    count += 1;
                }
            }
            System.out.println(words[i] + " " + count);
        }

 */
    }
    }
