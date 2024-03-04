package students.nikita_bortnikovs.lesson_4.homework.level_4;

public class CalTest {
    public static void main(String[] args) {
        CalTest calTest = new CalTest();
        calTest.sumTest();
        calTest.minTest();
        calTest.mulTest();
        calTest.divideTest();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Cal cal = new Cal();
        int realResult = cal.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void minTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Cal cal = new Cal();
        int realResult = cal.min(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Min test = OK");
        } else {
            System.out.println("Min test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 2;
        int secondNumber = 2;
        int expectedResult = 4;
        Cal cal = new Cal();
        int realResult = cal.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }

    }

    public void divideTest() {
        int firstNumber = 4;
        int secondNumber = 1;
        int expectedResult = 4;
        Cal cal = new Cal();
        int realResult = cal.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divi test = OK");
        } else {
            System.out.println("Divi test = FAIL");
        }
    }
}
