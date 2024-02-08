package teacher.lesson_2.lessoncode;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 20;
        int b = 4;
        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        int mod = a % b;

        //Shortcut for System.out.println(); is sout and press tab
        System.out.println("Sum of a and b is " + sum);
        System.out.println("Subtraction result: " + sub + "...");
        System.out.println(mult);
        System.out.println(div);
        System.out.println("Remainder of a % b is " + mod);
    }
}
