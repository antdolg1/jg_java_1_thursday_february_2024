package students.aleksandra_hodjuka.lesson_16.level_1;

public class HelloWorldThreads {
    public static void main(String[] args) {
        int numberOfThreads = 5;

        // Массив для хранения потоков
        Thread[] threads = new Thread[numberOfThreads];

        // Создаем и запускаем потоки
        for (int i = 0; i < numberOfThreads; i++) {
            final int threadNumber = i + 1; // Уникальный номер потока
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("[" + threadNumber + "] Hello World");
                }
            });
            threads[i].start();
        }

        // Ожидаем завершения всех потоков
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
