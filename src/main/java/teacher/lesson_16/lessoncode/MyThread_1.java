package teacher.lesson_16.lessoncode;

public class MyThread_1 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000); //поток спит 2 секунды
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

    }
}
