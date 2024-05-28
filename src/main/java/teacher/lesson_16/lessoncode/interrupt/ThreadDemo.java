package teacher.lesson_16.lessoncode.interrupt;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        try {
            Thread.sleep(3000); //главный поток спит 3 секунды
            thread.interrupt(); //прерываем поток
            System.out.println("Main thread running...");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
