package teacher.lesson_5.lessoncode;

public class CustomArrauyUtilsDemo {
    public static void main(String[] args) {

        int[] numbers = {12, 22, 2, 40};

        int sum = CustomArrayUtils.sumOfArrayNumbers(numbers);
        System.out.println("Сумма всех чисел массива равна " + sum);

        int maxNumber = CustomArrayUtils.maxNumberInArray(numbers);
        System.out.println("Самое большое значение в массиве = " + maxNumber);

    }
}
