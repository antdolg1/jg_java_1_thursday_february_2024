package students.karina_cmile.lesson_9.level_2_intern;

public class ComputerPlayerDemo {
    public static void main(String[] args) {
        ComputerPlayer computerPlayer = new ComputerPlayer("Elf");
        HumanPlayer humanPlayer = new HumanPlayer("Tarzan");
        System.out.println(computerPlayer + " vs "+ humanPlayer);
    }
}
