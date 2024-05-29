package teacher.lesson_16.lessoncode.thread_name;

public class MyThread extends  Thread{
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Thread priority: " + Thread.currentThread().getPriority());

    }

}
