package students.igors_melkins.lesson_9.inheritance;

public class BabyDog extends Dog {

    public BabyDog(boolean isPredator, boolean canFly, boolean canSwim, String nickname, String color) {
        super(isPredator, canFly, canSwim, nickname, color);
    }

    void weep(){
        System.out.println("weeping...");
    }
}
