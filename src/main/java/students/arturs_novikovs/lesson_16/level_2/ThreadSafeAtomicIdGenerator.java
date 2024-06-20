package students.arturs_novikovs.lesson_16.level_2;

import java.util.concurrent.atomic.AtomicInteger;
public class ThreadSafeAtomicIdGenerator {
    private final AtomicInteger id = new AtomicInteger(0);

    public int nextId() {
        return id.getAndIncrement();
    }
}
