package students.igors_melkins.lesson_9.inheritance;

public class Cat extends  Animal {

    public Cat(boolean isPredator, boolean canFly, boolean canSwim) {
        super(isPredator, canFly, canSwim);
    }

    void  meow (){

        System.out.println("meawiing");
    }

}
