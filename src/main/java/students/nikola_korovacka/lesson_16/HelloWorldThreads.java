package students.nikola_korovacka.lesson_16;

public class HelloWorldThreads {
    public static void main(String[] args) {
        // Создаем и запускаем 5 дополнительных потоков
        for (int i = 0; i < 5; i++) {
            final int threadNumber = i + 1; // Нумерация начиная с 1
            Thread thread = new Thread(() -> {
                System.out.println("[" + threadNumber + "] Hello World");
            });
            thread.start();
        }
    }
}

