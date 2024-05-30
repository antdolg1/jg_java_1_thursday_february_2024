package students.arturs_novikovs.lesson_9.level_2;

public class Porsche911Demo {
    public static void main(String[] args) {
        // Создаем инстанцию класса Porsche911
        Porsche911 myCar = new Porsche911(2022, 200); // Примерные значения
        // Продемонстрируем создание инстанции класса Porsche911
        System.out.println("My Porsche 911 has a release year of " + myCar.getReleaseYear() +
                " and a top speed of " + myCar.getTopSpeed() + " km/h.");
    }
}
