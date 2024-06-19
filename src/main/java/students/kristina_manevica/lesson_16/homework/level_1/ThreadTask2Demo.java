package students.kristina_manevica.lesson_16.homework.level_1;

public class ThreadTask2Demo {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ThreadTask2 threadTask2 = new ThreadTask2();
            threadTask2.start();
        }
    }
}