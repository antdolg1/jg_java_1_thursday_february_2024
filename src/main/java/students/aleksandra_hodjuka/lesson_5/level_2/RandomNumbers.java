package students.aleksandra_hodjuka.lesson_5.level_2;

class RandomNumbers {
    int[] numbers = new int[3];

    static int sumOfArrayNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;

    }

    static int averageOfArrayNumbers(int[] numbers) {
        int average
                = 0;
        for (int i = 0; i < numbers.length; i++) {
            average = sumOfArrayNumbers(numbers) / numbers.length;
        }
        return average;
    }
}
