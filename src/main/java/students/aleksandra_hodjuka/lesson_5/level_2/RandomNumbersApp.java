package students.aleksandra_hodjuka.lesson_5.level_2;

import teacher.lesson_5.lessoncode.CustomArrayUtils;

class RandomNumbersApp {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 500);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]" + " = " + numbers[i]);
        }

        int sum = RandomNumbers.sumOfArrayNumbers (numbers);
        System.out.println("Сумма всех чисел массива равна " +sum);

        int average = RandomNumbers.averageOfArrayNumbers (numbers);
        System.out.println("Среднее значение всех чисел массива равно " +average);
        }






}

