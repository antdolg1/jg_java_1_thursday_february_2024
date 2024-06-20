package students.arturs_novikovs.lesson_16.level_2;

public class RaceConditionDemo {
    private static final int THREADS_NUMBER = 10;
    private static final int THREAD_ITERATIONS_COUNT = 1000;

    public static void main(String[] args) {

        NotThreadSafeIdGenerator generator = new NotThreadSafeIdGenerator();
        ThreadManager manager = new ThreadManager(THREADS_NUMBER);

        manager.threadManageRaceCondition(generator, THREAD_ITERATIONS_COUNT);
        manager.startAll();
        manager.joinAll();

        int expectedResult = THREADS_NUMBER * THREAD_ITERATIONS_COUNT;
        int actualResult = generator.nextId();

        System.out.println("Expected Id: " + expectedResult);
        System.out.println("Actual Id: " + actualResult);

        String raiseConditionResult = (actualResult != expectedResult) ? "Race condition!" :
                "No race condition";

        System.out.println(raiseConditionResult);
    }
}
