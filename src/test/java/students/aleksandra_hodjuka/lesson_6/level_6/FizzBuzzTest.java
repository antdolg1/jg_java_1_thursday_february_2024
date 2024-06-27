package students.aleksandra_hodjuka.lesson_6.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzzDivisibleByThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.detect(15));
        assertEquals("FizzBuzz", fizzBuzz.detect(30));
        assertEquals("FizzBuzz", fizzBuzz.detect(45));
    }

    @Test
    public void testFizzDivisibleByThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.detect(3));
        assertEquals("Fizz", fizzBuzz.detect(6));
        assertEquals("Fizz", fizzBuzz.detect(9));
    }

    @Test
    public void testBuzzDivisibleByFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.detect(5));
        assertEquals("Buzz", fizzBuzz.detect(10));
        assertEquals("Buzz", fizzBuzz.detect(20));
    }

    @Test
    public void testNumberNotDivisibleByThreeOrFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.detect(1));
        assertEquals("2", fizzBuzz.detect(2));
        assertEquals("4", fizzBuzz.detect(4));
        assertEquals("7", fizzBuzz.detect(7));
        assertEquals("8", fizzBuzz.detect(8));
        assertEquals("11", fizzBuzz.detect(11));
    }

}