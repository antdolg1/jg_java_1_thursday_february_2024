package students.kristina_manevica.lesson_6.homework.level_4;

public class ForLoopContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}