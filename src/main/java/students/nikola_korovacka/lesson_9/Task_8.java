package students.nikola_korovacka.lesson_9;

public class Task_8 {
    static class Player {
        private String name;
        Player(String name) {
            this.name = name;
        }
    }
    static class ComputerPlayer extends Player {
        ComputerPlayer(String name) {
            super(name); // Вызываем конструктор родительского класса и передаем имя игрока
        }
    }
    public static class ComputerPlayerDemo {

        public static void main(String[] args) {
            //экземпляр класса ComputerPlayer
            ComputerPlayer computerPlayer = new ComputerPlayer("ComputerPlayer1");
        }
    }
}
