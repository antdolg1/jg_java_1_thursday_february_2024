package students.ruslan_k.lesson_16.level_2.not_safe;

public class NotThreadSafeIdGenerator {
    private static int id;

    public static int nextId() {
        return id++;
    }

    public static int getId() {
        return id;
    }
}
