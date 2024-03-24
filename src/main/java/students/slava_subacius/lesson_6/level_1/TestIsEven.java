package students.slava_subacius.lesson_6.level_1;

public class TestIsEven {
    public static void main(String[] args) {
        testIsEvenForEvenNumber();
        testIsEvenForOddNumber();
        testIsEvenForZero();
        testIsEvenForNegativNumber();
    }
     static void testIsEvenForEvenNumber() {
         NumberUtils numberUtils = new NumberUtils();
         System.out.println("is 4 even? " + numberUtils.isEven(4));
     }
     static void testIsEvenForOddNumber(){
        NumberUtils numberUtils = new NumberUtils();
         System.out.println("Is 5 even? " + numberUtils.isEven(5));
     }
     static void testIsEvenForZero(){
        NumberUtils numberUtils = new NumberUtils();
         System.out.println("Is 0 even? " + numberUtils.isEven(0));
     }
     static void testIsEvenForNegativNumber(){
        NumberUtils numberUtils = new NumberUtils();
         System.out.println("Is -3 even? " + numberUtils.isEven(-3));
     }

}

