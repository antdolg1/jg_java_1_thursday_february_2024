package students.karina_cmile.lesson_9.level_2_intern;

class ComputerPlayer extends Player{
    ComputerPlayer(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Computer " + name;
    }
}
