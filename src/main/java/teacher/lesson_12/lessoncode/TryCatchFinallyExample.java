package teacher.lesson_12.lessoncode;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        TryCatchFinallyExample demo = new TryCatchFinallyExample();
        try {
            demo.printLength(null);
            demo.division(8, 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Делить на ноль нельзя!!!");
        } catch (NullPointerException nullPointerException) {
            System.out.println("Не могу подсчитать длинну null");
        }

    }

    public void division(int num1, int num2) throws ArithmeticException{
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль не разрешено");
        } else {
            System.out.println("Результат: " + (num1 / num2));
        }
    }

    public void printLength(String str) throws NullPointerException {
        if (str == null) {
            throw new NullPointerException("String является null!!!");
        } else {
            System.out.println("Длинна строки: " + str.length());
        }
    }
}
