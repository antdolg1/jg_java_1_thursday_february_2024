package teacher.lesson_10.lessoncode.array_problem;

public class Demo {
    public static void main(String[] args) {

        BruteForce bruteForce = new BruteForce();
        SortSelect sortSelect = new SortSelect();
        LinearTraversal linearTraversal = new LinearTraversal();

        int[] array = {10000, 30000, Integer.MAX_VALUE, -20000, 0};
        int[] result = bruteForce.maxProductPair(array);
        int[] result2 = sortSelect.maxProductPair(array);
        int[] result3 = linearTraversal.maxProductPair(array);

        System.out.println(result[0] + " " + result[1]);
        System.out.println(result2[0] + " " + result2[1]);
        System.out.println(result3[0] + " " + result3[1]);
    }
}
