package teacher.lesson_16.lessoncode.thread_name;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("MyCustomThread"); //задаём имя потоку
        String threadName = thread.getName();
        System.out.println(threadName + "is alive? " + thread.isAlive());
        thread.start();
        System.out.println(threadName + "is alive? " + thread.isAlive());
    }
}
