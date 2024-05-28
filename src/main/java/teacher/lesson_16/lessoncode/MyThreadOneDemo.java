package teacher.lesson_16.lessoncode;

public class MyThreadOneDemo {
    public static void main(String[] args) {

        MyThreadOne threadOne1 = new MyThreadOne();
        MyThreadOne threadOne2 = new MyThreadOne();
        MyThreadOne threadOne3 = new MyThreadOne();

        threadOne1.start();
        try {
            threadOne1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadOne2.start();
        threadOne3.start();

    }
}
