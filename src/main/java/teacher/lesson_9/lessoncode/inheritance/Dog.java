package teacher.lesson_9.lessoncode.inheritance;

public class Dog extends Animal {

    String nickname;
    String color;

    public Dog(boolean isPredator, boolean canFly, boolean canSwim, String nickname, String color) {
        super(isPredator, canFly, canSwim);
        this.nickname = nickname;
        this.color = color;
    }

    void bark() {
        System.out.println("barking...");
    }
}
