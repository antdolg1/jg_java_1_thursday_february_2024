package students.ruslan_k.lesson_4.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz test = new FizzBuzz();
        int[] testIn = {3,5,15,7};
        String[] testOut={"Fizz","Buzz","FizzBuzz", "7"};
        for(int i=0; i<testIn.length; i++){
            if(testOut[i].equals(test.detect(testIn[i]))){
                System.out.println("Test " + testOut[i]+ " passed");
            } else System.out.println("Test " + testOut[i]+ " failed");
        }

    }
}
