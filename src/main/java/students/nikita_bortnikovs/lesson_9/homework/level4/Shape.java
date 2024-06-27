package students.nikita_bortnikovs.lesson_9.homework.level4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;


    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
