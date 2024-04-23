package students.igors_melkins.lesson_10.array_problem;

import java.util.Random;

public class MaxProductBenchmark {
    public static void main(String[] args) {
        int [] nums = generateRandomArray(100000);
        long starTime;
        long endTime;

        BruteForce bruteForce = new BruteForce();
        SortSelect sortSelect = new SortSelect();
        LinearTraversal linearTraversal = new LinearTraversal();



        //Brute Force
        starTime = System.currentTimeMillis();
        bruteForce.maxProductPair(nums);
        endTime = System.currentTimeMillis();
        System.out.println("Brute force time : " +(endTime+ starTime)+ " ms ");

        //sort select
        starTime = System.currentTimeMillis();
        sortSelect.maxProductPair(nums);
        endTime = System.currentTimeMillis();
        System.out.println("Sort time : " +(endTime+ starTime)+ " ms ");

        //LinearTraversal
        starTime = System.currentTimeMillis();
        linearTraversal.maxProductPair(nums);
        endTime = System.currentTimeMillis();
        System.out.println("Linear traversal time : " +(endTime+ starTime)+ " ms ");

    }

    public static int[] generateRandomArray(int size )  {
        Random random = new Random();
        int [] array = new int[size];
        for (int i = 0;i < size ;i++){
            array[i]=random.nextInt(20000)-10000;

        }
        return array;
    }
}
