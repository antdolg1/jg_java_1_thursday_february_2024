package teacher.lesson_7.lessoncode.access_modifiers;

import java.util.Objects;

public class CatDemo {
    public static void main(String[] args) {

        Cat cat1 = new Cat(1, "Whiskas");
        Cat cat2 = new Cat(1, "Whiskas");

        int catAge = cat1.getAge();
        String catNickname = cat1.getNickname();
        System.out.println("cat1 age is " + catAge + ", and name is " + catNickname);

//        cat1.setAge(2);
        catAge = cat1.getAge();
        System.out.println("cat1 age is " + catAge + ", and name is " + catNickname);

        System.out.println("cat1 is the same as cat2: " + cat1.equals(cat2));
    }
}
