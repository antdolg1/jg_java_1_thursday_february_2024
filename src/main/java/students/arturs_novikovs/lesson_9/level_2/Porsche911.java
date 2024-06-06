package students.arturs_novikovs.lesson_9.level_2;

public class Porsche911 extends Car{
    private int topSpeed;

    // Создаем конструктор в классе Porsche911
    public Porsche911(int releaseYear, int topSpeed) {
        // Вызываем конструктор родительского класса с помощью super()
        super(releaseYear);
        // Инициализируем свойство topSpeed
        this.topSpeed = topSpeed;
    }
}
