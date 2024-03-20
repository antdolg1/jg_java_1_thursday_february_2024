package students.karina_cmile.lesson_7.level_1_intern;

import java.util.Scanner;

class WordService {
    public static String splitSentence() {
        System.out.println("Create sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();
        String[] arrOfSentence = sentence.split("[, ?.@!]+");
        for (String a : arrOfSentence){
            System.out.println(a);
    }
        return sentence;
    }
    public static void countTimesWordAppearsInArray(String[] arrOfSentence) {
        int size = arrOfSentence.length;
        for (int i = 0; i < size; i += 1) {
            int count = 0;

            String element = arrOfSentence[i];
            for (int j = 0; j < size; j += 1) {
                if (arrOfSentence[j].equals(element)) {
                    count += 1;
                }
            }
            System.out.println(arrOfSentence[i] + " " + count);
        }
    }



    /*
    public static String findMostFrequentWord(String[] arrOfSentence) {
        for (int i = 0; i < arrOfSentence.length; i++) {
            for (int j = i + 1; j < arrOfSentence.length; j++) {
                if (arrOfSentence[i].equals(arrOfSentence[j])) {
                    int sum = Integer.parseInt(arrOfSentence[i] + 1);
                } else {
                    System.out.println("No equals words in sentence");
                }
            }
            System.out.print(arrOfSentence[i] + " ne znaju chto napisatj");
        }

    }
    */
    public static void main(String[] args) {
        WordService.splitSentence();
 //       WordService.countTimesWordAppearsInArray();
//        WordService.findMostFrequentWord();


    }
    }
