package teacher.lesson_9.lessoncode.inheritance;

import teacher.lesson_9.lessoncode.Event;

import java.time.LocalDate;

public class TestInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog(false, false, true, "Buddy", "Gold");
        dog.bark();
        dog.eat();
        System.out.println("_____");

        BabyDog babyDog = new BabyDog(false, false, true, "Lucky", "Black");
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();
        System.out.println("_____");

        Cat cat = new Cat(true, false, true);
        cat.meow();
        cat.eat();

        Event event = new Event("Daily stand-up", LocalDate.of(2024, 04, 1));

        Object[] animals = new Object[4];
        animals[0] = babyDog;
        animals[1] = cat;
        animals[2] = dog;
        animals[3] = event;

    }
}
