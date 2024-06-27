package students.aleksandra_hodjuka.lesson_9.level_3;

class ScientificCalculator extends Calculator {
    //Task 12//
    @Override
    int calculationOfSum(int number1, int number2) {
        //Возведение в степень через цикл.//
        int result = 1;
        for (int i = 0; i < number2; i++) {
            result *= number1;
        }
        return result;
    }
}