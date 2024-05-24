package students.aleksandra_hodjuka.lesson_16.level_2;

import java.util.HashSet;
import java.util.Set;

public class NotThreadSafeIdGenerator {
    private int id;

    public int nextId() {
        return id++;
    }
}

class IdGeneratorTest {
    public static void main(String[] args) {
        // Создаем экземпляр NotThreadSafeIdGenerator
        NotThreadSafeIdGenerator idGenerator = new NotThreadSafeIdGenerator();

        // Количество потоков
        int numberOfThreads = 10;
        // Количество вызовов nextId() на поток
        int callsPerThread = 1000;

        // Массив для хранения потоков
        Thread[] threads = new Thread[numberOfThreads];

        // Set для хранения уникальных id
        Set<Integer> uniqueIds = new HashSet<>();

        // Создаем и запускаем потоки
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < callsPerThread; j++) {
                        int id = idGenerator.nextId();
                        synchronized (uniqueIds) {
                            uniqueIds.add(id);
                        }
                    }
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

        // Проверяем количество уникальных id
        int expectedUniqueIds = numberOfThreads * callsPerThread;
        int actualUniqueIds = uniqueIds.size();

        System.out.println("Expected unique IDs: " + expectedUniqueIds);
        System.out.println("Actual unique IDs: " + actualUniqueIds);

        if (expectedUniqueIds != actualUniqueIds) {
            System.out.println("IdGenerator is not thread-safe!");
        } else {
            System.out.println("IdGenerator is thread-safe.");
        }
    }
}
