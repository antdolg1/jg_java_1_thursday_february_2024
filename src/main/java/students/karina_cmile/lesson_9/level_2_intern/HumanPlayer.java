package students.karina_cmile.lesson_9.level_2_intern;

public class HumanPlayer extends Player {
    HumanPlayer(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Human " + name;
    }
}
