package students.nikola_korovacka.lesson_9;

public class Task_6 {
    static class Car {
        private int releaseYear;

        public Car(int releaseYear) {
            this.releaseYear = releaseYear;
        }
    }

    static class Porsche911 extends Car {
        private int topSpeed;

        public Porsche911(int releaseYear, int topSpeed) {
            super(releaseYear);
            this.topSpeed = topSpeed;
        }
    }

    public static class Porsche911Demo {
        public static void main(String[] args) {
            Porsche911 myPorsche = new Porsche911(2022, 250);
        }
    }
}
