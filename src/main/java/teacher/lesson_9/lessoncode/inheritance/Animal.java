package teacher.lesson_9.lessoncode.inheritance;

public class Animal {

    boolean isPredator;
    boolean canFly;
    boolean canSwim;

    public Animal(boolean isPredator, boolean canFly, boolean canSwim) {
        this.isPredator = isPredator;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    void eat() {
        System.out.println("eating...");
    }
}
