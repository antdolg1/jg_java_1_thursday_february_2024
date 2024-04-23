package students.igors_melkins.lesson_5;

public class CustomArrayUtils {
    static int sumOfArrayNumbers(int[] numbers){
        int sum = 0;
        for (int i=0;i < numbers.length;i++){
            sum = sum + numbers[i];

        }
        return sum;
    }

    static int maxNumberInArray(int[] numbers){
        int maxNumber = numbers[0];
        for (int i=0;i< numbers.length;i++){
            if ( numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

}
