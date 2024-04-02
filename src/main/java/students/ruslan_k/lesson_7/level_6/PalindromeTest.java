package students.ruslan_k.lesson_7.level_6;

public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome pl = new Palindrome();
        boolean result;
        String textForText1="ABCDEfghHgfedcBa";
        String textForText2="1234567890";
        result=pl.isPalindrome(textForText1);
        System.out.printf("Test1 \"Is Palindrome\" is %s\n", result? "Passed": "Failed");
        result=pl.isPalindrome(textForText2);
        System.out.printf("Test1 \"Is Not Palindrome\" is %s\n", result? "Failed": "Passed");



    }
}
