package students.nikola_korovacka.lesson_16;

public class HelloWorldThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        HelloWorldThread thread = new HelloWorldThread();
        thread.start();
    }
}

