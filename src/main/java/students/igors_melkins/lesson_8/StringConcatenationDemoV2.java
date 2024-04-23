package students.igors_melkins.lesson_8;

public class StringConcatenationDemoV2 {
    public static void main(String[] args) {
        String baseString = "Number: ";
        System.out.println("Initial hashcode: " + System.identityHashCode(baseString));

        for ( int i = 0; i < 5;i++ ){
            baseString += i;
            System.out.println("After concatenation " + i +", hashcode :" + System.identityHashCode(baseString) );
        }
    }
}
