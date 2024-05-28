package teacher.lesson_9.lessoncode.inheritance;

public class BabyDog extends Dog{
    void weep() {
        System.out.println("weeping...");
    }

    public BabyDog(boolean isPredator, boolean canFly, boolean canSwim, String nickname, String color) {
        super(isPredator, canFly, canSwim, nickname, color);
    }
}
