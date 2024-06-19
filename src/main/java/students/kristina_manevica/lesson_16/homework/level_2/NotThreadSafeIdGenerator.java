package students.kristina_manevica.lesson_16.homework.level_2;

public class NotThreadSafeIdGenerator {

    private int id;

    public int nextId() {
        return id++;
    }
}