package students.kristina_manevica.lesson_9.homework.level_4;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}