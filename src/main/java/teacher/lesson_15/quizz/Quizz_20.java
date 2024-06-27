package teacher.lesson_15.quizz;

import java.util.Arrays;
import java.util.List;

public class Quizz_20 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7, 9);
        double result = numbers2.stream()
                .filter(n -> n % 2 == 0) // [2, 4, 6, 8, 10]
                .mapToInt(n -> n * n) //convert to IntStream to use method average() [4, 16, 36, 64, 100]
                .distinct()
                .skip(2) //[36, 64, 100]
                .limit(3) //[36, 64, 100]
                .average() // (36 + 64 + 100)/3 = 200/3 ~ 66.666666
                .orElse(0.0);
        System.out.println(result);

    }
}
