package students.aleksandra_hodjuka.lesson_4.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        testFizz();
        testBuzz();
        testFizzBuzz();
        testNumber();
    }
//тестирование случаев, когда число делится на 3
    public static void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ("Fizz".equals(fizzBuzz.detect(3)) &&
                "Fizz".equals(fizzBuzz.detect(6)) &&
                "Fizz".equals(fizzBuzz.detect(9))) {
            System.out.println("Fizz test passed");
        } else {
            System.out.println("Fizz test failed");
        }
    }
//тестирование случаев, когда число делится на 5
    public static void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ("Buzz".equals(fizzBuzz.detect(5)) &&
                "Buzz".equals(fizzBuzz.detect(10)) &&
                "Buzz".equals(fizzBuzz.detect(20))) {
            System.out.println("Buzz test passed");
        } else {
            System.out.println("Buzz test failed");
        }
    }
// тестирование случаев, когда число делится и на 3 и на 5
    public static void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ("FizzBuzz".equals(fizzBuzz.detect(15)) &&
                "FizzBuzz".equals(fizzBuzz.detect(30)) &&
                "FizzBuzz".equals(fizzBuzz.detect(45))) {
            System.out.println("FizzBuzz test passed");
        } else {
            System.out.println("FizzBuzz test failed");
        }
    }
//тестирование случаев, когда число не делится ни на 3, ни на 5
    public static void testNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ("1".equals(fizzBuzz.detect(1)) &&
                "2".equals(fizzBuzz.detect(2)) &&
                "4".equals(fizzBuzz.detect(4)) &&
                "7".equals(fizzBuzz.detect(7)) &&
                "11".equals(fizzBuzz.detect(11))) {
            System.out.println("Number test passed");
        } else {
            System.out.println("Number test failed");
        }
    }
}
