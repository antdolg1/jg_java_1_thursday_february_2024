package students.nikola_korovacka.lesson_16;

class NotThreadSafeIdGenerator {
    private int id;

    public int nextId() {
        return id++;
    }
}

public class IdGeneratorTest {
    public static void main(String[] args) {
        ThreadSafeAtomicIdGenerator idGenerator = new ThreadSafeAtomicIdGenerator();

        // Количество потоков
        int numberOfThreads = 10;
        // Количество вызовов nextId() каждым потоком
        int numberOfIdsPerThread = 100;

        // Создаем и запускаем потоки
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < numberOfIdsPerThread; j++) {
                    int id = idGenerator.nextId();
                    System.out.println("Thread " + Thread.currentThread().getName() + " got ID: " + id);
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

