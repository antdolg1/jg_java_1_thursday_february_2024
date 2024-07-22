package students.nikola_korovacka.lesson_16;

public class HelloWorldRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new HelloWorldRunnable());
        thread.start();
    }
}

