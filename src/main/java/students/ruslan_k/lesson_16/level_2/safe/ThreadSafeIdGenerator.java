package students.ruslan_k.lesson_16.level_2.safe;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeIdGenerator {
    private static AtomicInteger id = new AtomicInteger(0);

    public static int nextId() {
        return id.incrementAndGet();
    }

    public static int getId(){
        return id.get();
    }

}
