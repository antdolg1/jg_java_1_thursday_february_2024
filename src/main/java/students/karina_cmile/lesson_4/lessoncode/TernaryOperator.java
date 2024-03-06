package students.karina_cmile.lesson_4.lessoncode;

public class TernaryOperator {
    public static void main(String[] args) {

        int number = 5;

        if (number % 2 == 0) {
            System.out.println("Число является чётным");
        } else {
            System.out.println("Число является нечётным");
        }

        //запись при помощи тернарного оператора
        //синтаксис тернарного оператора
        //условие ? значение_если_условие_истинно : значение_если_ложь;

        String result = (number % 2 == 0) ? "Чётное" : "Нечётное";
        System.out.println(result);

        boolean isSpring = false;
        String currentSeasonMessage = isSpring ? "Yes, finally it is Spring" : "NOOOOOOOOOO";
        System.out.println(currentSeasonMessage);
    }
}
