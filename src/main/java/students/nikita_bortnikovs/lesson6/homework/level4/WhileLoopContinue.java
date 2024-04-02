package students.nikita_bortnikovs.lesson6.homework.level4;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int x = 0;
        while (x < 2) {
            System.out.println("looping");
            x++;
            if (x == 1) {
                continue;
            }

        }
    }

}
