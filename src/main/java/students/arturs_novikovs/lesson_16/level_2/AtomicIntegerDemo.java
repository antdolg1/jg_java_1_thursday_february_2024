package students.arturs_novikovs.lesson_16.level_2;

public class AtomicIntegerDemo {
    private static final int THREADS_NUMBER = 10;
    private static final int THREAD_ITERATIONS_COUNT = 1000;

    public static void main(String[] args) {

        int expectedId = THREADS_NUMBER * THREAD_ITERATIONS_COUNT;

        ThreadSafeAtomicIdGenerator generator = new ThreadSafeAtomicIdGenerator();
        ThreadManager manager = new ThreadManager(THREADS_NUMBER);

        manager.threadManageAtomicInteger(generator, THREAD_ITERATIONS_COUNT);
        manager.startAll();
        manager.joinAll();

        int actualId = generator.nextId();

        System.out.println("Expected Id: " + expectedId);
        System.out.println("Actual Id: " + actualId);

        String raiseConditionResult = (actualId == expectedId) ? "No race condition" : "Race condition!";
        System.out.println(raiseConditionResult);
    }
}
