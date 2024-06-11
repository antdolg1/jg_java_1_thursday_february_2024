package students.nikita_bortnikovs.lesson_16.hw.level2;
//difficult to spot same ids
class NotThreadSafeIdGenerator {
    private int id;

    public int nextId() {
        return id++;
    }
}

public class NotThreadSafeDemo {
    public static void main(String[] args) {
        NotThreadSafeIdGenerator generator = new NotThreadSafeIdGenerator();
        int numberOfThreads = 1000;
        int iterations = 10000;
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < iterations; j++) {
                    int id = generator.nextId();
                    synchronized (System.out) {
                        System.out.println("Thread number  " + Thread.currentThread().getId() + " id is  " + id);
                    }
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
