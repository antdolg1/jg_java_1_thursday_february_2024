package students.slava_subacius.lesson_6.level_4;

public class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Current value of i: " + i);

        }
    }
}
