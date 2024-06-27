package students.kristina_manevica.lesson_16.homework.level_1;

public class ThreadTask2 extends Thread {

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().threadId() + "] Hello World");
    }
}