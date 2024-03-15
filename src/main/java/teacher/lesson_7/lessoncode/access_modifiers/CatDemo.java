package teacher.lesson_7.lessoncode.access_modifiers;

public class CatDemo {
    public static void main(String[] args) {

        Cat cat1 = new Cat(1, "Whiskas");

        int catAge = cat1.getAge();
        String catNickname = cat1.getNickname();
        System.out.println("cat1 age is " + catAge + ", and name is " + catNickname);

        cat1.setAge(2);
        catAge = cat1.getAge();
        System.out.println("cat1 age is " + catAge + ", and name is " + catNickname);
    }
}
