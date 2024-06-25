package students.nikola_korovacka.lesson_16;

public class HelloWorldLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello World"));
        thread.start();
    }
}

