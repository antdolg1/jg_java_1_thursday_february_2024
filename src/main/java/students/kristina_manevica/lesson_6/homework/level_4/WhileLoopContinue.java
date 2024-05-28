package students.kristina_manevica.lesson_6.homework.level_4;

public class WhileLoopContinue {
    public static void main(String[] args) {

        int i = 10;
        while (i < 20) {
            i++;
            if (i == 13) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
