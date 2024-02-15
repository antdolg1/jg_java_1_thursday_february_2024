package teacher.lesson_3_oop_first_look.lessoncode.solutions;

public class AppleApp {

    public static void main(String[] args) {
        Apple apple1 = new Apple("antonovka", "red", 100);
        Apple apple2 = new Apple("antonovka", "yellow", 900);
        Apple apple3 = new Apple("antonovka", "blue", 90);

        System.out.println(apple1.getColor());
        System.out.println(apple1.getSort());
        System.out.println(apple1.getWeight());
    }

}
