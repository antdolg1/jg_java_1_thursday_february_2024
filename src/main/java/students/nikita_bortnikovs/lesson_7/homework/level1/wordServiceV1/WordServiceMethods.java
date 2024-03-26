package students.nikita_bortnikovs.lesson_7.homework.level1.wordServiceV1;

public class WordServiceMethods {
    public String findMostFrequentWord(String[] text) {
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;


        // Count occurrences of each word
        for (String word : text) {
            if (word.equals(text[0])) {
                counter0++;
            }
            else if (word.equals(text[1])) {
                counter1++;
            }else if (word.equals(text[2])) {
                counter2++;
            }else if (word.equals(text[3])) {
                    counter3++;
            }else if (word.equals(text[4])) {
                        counter4++;
            }else if (word.equals(text[5])) {
                            counter5++;
            }else if (word.equals(text[6])) {
                                counter6++;
            }else if (word.equals(text[7])) {
                                    counter7++;
            }else if (word.equals(text[8])) {
                                        counter8++;
            }else if (word.equals(text[9])) {
                                            counter9++;

            }
        }

        // Find the word with the highest count
        if (counter0 > counter1 &&
                counter0 > counter2 &&
                counter0 > counter3 &&
                counter0 > counter4 &&
                counter0 > counter5 &&
                counter0 > counter6 &&
                counter0 > counter7 &&
                counter0 > counter8 &&
                counter0 > counter9) {
            return text[0];
        } else if (counter1 > counter0 && counter1 > counter2  && counter1 > counter3 && counter1 > counter4 && counter1 > counter5 && counter1 > counter6 && counter1 > counter7 && counter1 > counter8 && counter1 > counter9) {
            return text[1];
        }
        else if (
                counter2 > counter0 &&
                counter2 > counter1 &&
                counter2 > counter3 &&
                counter2 > counter4 &&
                counter2 > counter5 &&
                counter2 > counter6 &&
                counter2 > counter7 &&
                counter2 > counter8 &&
                counter2 > counter9) {
            return text[2];
        }
        else if (
                counter3 > counter0 &&
                counter3 > counter1 &&
                counter3 > counter2 &&
                counter3 > counter4 &&
                counter3 > counter5 &&
                counter3 > counter6 &&
                counter3 > counter7 &&
                counter3 > counter8 &&
                counter3 > counter9) {
            return text[3];
        }
        else if (
                counter4 > counter0 &&
                counter4 > counter1 &&
                counter4 > counter2 &&
                counter4 > counter3 &&
                counter4 > counter5 &&
                counter4 > counter6 &&
                counter4 > counter7 &&
                counter4 > counter8 &&
                counter4 > counter9) {
            return text[4];
        }
        else if (
                counter5 > counter0 &&
                counter5 > counter1 &&
                counter5 > counter2 &&
                counter5 > counter3 &&
                counter5 > counter4 &&
                counter5 > counter6 &&
                counter5 > counter7 &&
                counter5 > counter8 &&
                counter5 > counter9) {
            return text[5];
        }
        else if (
                counter6 > counter0 &&
                counter6 > counter1 &&
                counter6 > counter2 &&
                counter6 > counter3 &&
                counter6 > counter4 &&
                counter6 > counter5 &&
                counter6 > counter7 &&
                counter6 > counter8 &&
                counter6 > counter9) {
            return text[6];
        }
        else if (
                counter7 > counter0 &&
                counter7 > counter1 &&
                counter7 > counter2 &&
                counter7 > counter3 &&
                counter7 > counter4 &&
                counter7 > counter5 &&
                counter7 > counter6 &&
                counter7 > counter8 &&
                counter7 > counter9) {
            return text[7];
        } else if (
                counter8 > counter0 &&
                counter8 > counter1 &&
                counter8 > counter2 &&
                counter8 > counter3 &&
                counter8 > counter4 &&
                counter8 > counter5 &&
                counter8 > counter6 &&
                counter8 > counter7 &&
                counter8 > counter9
        ) {
            return text[8];
        } else if (
                counter9 > counter0 &&
                counter9 > counter1 &&
                counter9 > counter2 &&
                counter9 > counter3 &&
                counter9 > counter4 &&
                counter9 > counter5 &&
                counter9 > counter6 &&
                counter9 > counter7 &&
                counter9 > counter8
        ) {
            return text[9];
        } else {
            // If both counters are equal, return some indication, or handle as needed
            return "Both words have the same frequency.";
        }
    }
}
