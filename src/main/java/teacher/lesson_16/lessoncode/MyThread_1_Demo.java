package teacher.lesson_16.lessoncode;

public class MyThread_1_Demo {
    public static void main(String[] args) {
        MyThread_1 thread1 = new MyThread_1();
        thread1.start();

        try {
            thread1.join(); //ждём завершения потока
            System.out.println("Main thread continues...");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
