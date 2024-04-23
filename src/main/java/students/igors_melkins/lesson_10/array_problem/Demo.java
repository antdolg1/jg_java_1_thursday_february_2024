package students.igors_melkins.lesson_10.array_problem;

public class Demo {
    public static void main(String[] args) {

        BruteForce bruteForce = new BruteForce();
        SortSelect sortSelect = new SortSelect();
        LinearTraversal linearTraversal = new LinearTraversal();

        int[] array = new int[]{10, 15, 1, 3, 8,20};
        int[] result = bruteForce.maxProductPair(array);
        int[] result2 = sortSelect.maxProductPair(array);
        int[] result3 = linearTraversal.maxProductPair(array);

        System.out.println(result[0]+ " " + result[1]);
        System.out.println(result2[0]+ " " + result2[1]);
        System.out.println(result3[0]+ " " + result3[1]);
    }
}
