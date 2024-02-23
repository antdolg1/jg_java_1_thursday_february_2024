package teacher.lesson_4.lessoncode;

public class IfStatements {
    public static void main(String[] args) {


        int number = 10;
        if (number > 0) {
            System.out.println("Число положительное");
        }

        int numberTwo = -5;
        if (numberTwo > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

        int examScore = 54;

        if (examScore >= 90) {
            System.out.println("Отлично!");
        } else if (examScore >= 70) {
            System.out.println("Хорошо");
        } else if (examScore >= 50) {
            System.out.println("Удовлетворительно");
        } else if (examScore >=30) {
            System.out.println("Неочень!");
        } else {
            System.out.println("ОТЧИСЛЕН!!!");
        }

        String fruit = "lemon";

        if (fruit.equals("orange")) {
            System.out.println("Orange color");
        } else if (fruit.equals("lemon")) {
            System.out.println("Yellow color");
        } else if (fruit.equals("Apple")) {
            System.out.println("Red color");
        } else {
            System.out.println("Unknown fruit");
        }

    }
}
