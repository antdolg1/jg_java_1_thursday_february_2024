package students.kristina_manevica.lesson_4.homework.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
    }

    public void fizzBuzzTest() {
        int numberOne = 6;
        int numberTwo = 10;
        int numberThree = 15;
        int numberFour = 1;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String actualResultOne = fizzBuzz.detect(numberOne);
        System.out.println((actualResultOne.equals("Fizz")) ? "Test for Fizz passed" : "Error!");

        String actualResultTwo = fizzBuzz.detect(numberTwo);
        System.out.println((actualResultTwo.equals("Buzz")) ? "Test for Buzz passed" : "Error!");

        String actualResultThree = fizzBuzz.detect(numberThree);
        System.out.println((actualResultThree.equals("FizzBuzz")) ? "Test for FizzBuzz passed" : "Error!");

        String actualResultFour = fizzBuzz.detect(numberFour);
        System.out.println((actualResultFour.equals("Other number" + numberFour)) ? "Other test passed" : "Error!");
    }
}
