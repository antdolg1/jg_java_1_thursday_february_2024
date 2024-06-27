package students.ruslan_k.lesson_7.level_6;

public class Palindrome {
    boolean isPalindrome(String test) {
        test=test.toLowerCase();
        char[] text = test.toCharArray();
        char[] textRev = reverse(text);
        for (int i = 0; i < textRev.length; i++) {
            if (text[i] != textRev[i]) return false;
        }
        return true;
    }

    char[] reverse(char[] text) {
        char[] revText = new char[text.length];
        for (int i = 0; i < text.length; i++) {
            revText[i] = text[text.length - 1 - i];
        }
        return revText;
    }
}
