package teacher.lesson_9.lessoncode.inheritance;

public class Cat extends Animal {
    public Cat(boolean isPredator, boolean canFly, boolean canSwim) {
        super(isPredator, canFly, canSwim);
    }

    void meow() {
        System.out.println("meowing...");
    }

    @Override
    void eat() {
        System.out.println("cat is eating...");
    }
}
