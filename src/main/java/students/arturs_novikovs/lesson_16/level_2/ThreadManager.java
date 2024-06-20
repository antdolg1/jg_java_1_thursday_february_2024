package students.arturs_novikovs.lesson_16.level_2;

public class ThreadManager {
    private final Thread[] threads;

    public ThreadManager(int threadsNumber) {
        threads = new Thread[threadsNumber];
    }

    public void threadManageRaceCondition(NotThreadSafeIdGenerator generator, int threadIterationsCount) {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < threadIterationsCount; j++) {
                    generator.nextId();
                }
            });
        }
    }

    public void threadManageAtomicInteger(ThreadSafeAtomicIdGenerator generator, int threadIterationsCount) {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < threadIterationsCount; j++) {
                    generator.nextId();
                }
            });
        }
    }

    public void startAll() {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public void joinAll() {
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted");
            }
        }
    }
}
