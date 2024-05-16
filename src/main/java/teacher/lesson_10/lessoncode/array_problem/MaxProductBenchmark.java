package teacher.lesson_10.lessoncode.array_problem;

import java.util.Random;

public class MaxProductBenchmark {
    public static void main(String[] args) {
        int[] nums = generateRandomArray(100000);
        long startTime;
        long endTime;

        BruteForce bruteForce = new BruteForce();
        SortSelect sortSelect = new SortSelect();
        LinearTraversal linearTraversal = new LinearTraversal();

        //Brute force
        startTime = System.currentTimeMillis();
        int[] result = bruteForce.maxProductPair(nums);
        endTime = System.currentTimeMillis();
        System.out.println("Brute force time: " + (endTime - startTime) + "ms");
        System.out.println(result[0] + " " + result[1]);

        //Sort select
        startTime = System.currentTimeMillis();
        int[] result2 = sortSelect.maxProductPair(nums);
        endTime = System.currentTimeMillis();
        System.out.println("Sort select time: " + (endTime - startTime) + "ms");
        System.out.println(result2[0] + " " + result2[1]);

        //Linear traversal
        startTime = System.currentTimeMillis();
        int[] result3 = linearTraversal.maxProductPair(nums);
        endTime = System.currentTimeMillis();
        System.out.println("Linear traversal time: " + (endTime - startTime) + "ms");
        System.out.println(result3[0] + " " + result3[1]);

    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }


}
