package students.nikita_bortnikovs.lesson_6.homework.level4;

public class ForLoopContinue {
    public static void main(String[] args) {
        for (int x = 0; x < 2; x++) {
            System.out.println("looping");
            if (x == 1) {
                continue;
            }
        }
    }
}
