package teacher.lesson_16.lessoncode.interrupt;

public class MyThread extends Thread{
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread is running...");
                Thread.sleep(1000); //поток спит 1 секунду
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
