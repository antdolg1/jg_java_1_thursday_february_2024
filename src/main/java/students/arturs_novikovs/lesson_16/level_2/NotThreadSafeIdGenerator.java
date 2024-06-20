package students.arturs_novikovs.lesson_16.level_2;

public class NotThreadSafeIdGenerator {
    private int id;

    public int nextId() {
        return id++;
    }
}
