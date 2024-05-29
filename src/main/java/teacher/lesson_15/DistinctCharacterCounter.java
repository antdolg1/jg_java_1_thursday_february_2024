package teacher.lesson_15;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharacterCounter {

    public static int countDistinctCharactersRefactored(String str) {
        if (StringUtils.isEmpty(str)) {
            return 0;
        }

        //StringUtils.isNotEmpty
        // строка != null && строка.length != 0

        //StringUtils.isNotBlank
        // строка != null && строка.length != 0 && строка не состоит просто из пробелов


        str = str.toLowerCase();
        Set<Character> distinctChars = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                distinctChars.add(ch);
            }
        }
        return distinctChars.size();
    }


    public static int countDistinctCharacters(String str) {
        if (str == null || str.isBlank()) {
            return 0;
        }

        str = str.toLowerCase();
        int distinctCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                boolean isDistinct = true;
                for (int j = 0; j < i; j++) {
                    if (str.charAt(j) == ch) {
                        isDistinct = false;
                        break;
                    }
                }
                if (isDistinct) {
                    distinctCount++;
                }
            }
        }
        return distinctCount;
    }

    public static void main(String[] args) {
        String inputString = "HOCKEYYYYY";
        System.out.println("Distinct letters count: " + countDistinctCharacters(inputString));
        System.out.println("Distinct letters count: " + countDistinctCharactersRefactored(inputString));
    }
}
