package students.slava_subacius.lesson_6.level_4;

public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 1; true; i++) {
            System.out.println("For loop iteration: " + i);
            if (i == 5) {
                System.out.println("For loop iteration: ");

                break;
            }
        }
    }
}
