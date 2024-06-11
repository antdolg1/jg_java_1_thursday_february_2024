package students.nikita_bortnikovs.lesson_16.hw.level2;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafeAtomicIdGenerator {
    private final AtomicInteger id = new AtomicInteger(0);

    public int nextId() {
        return id.getAndIncrement();
    }
}

public class ThreadSafeDemo {
    public static void main(String[] args) {
        ThreadSafeAtomicIdGenerator generator = new ThreadSafeAtomicIdGenerator();

        int numberOfThreads = 5;
        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    int id = generator.nextId();
                    System.out.println("Thread  number " + Thread.currentThread().getId() + "  id is  " + id);
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}