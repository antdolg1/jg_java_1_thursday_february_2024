package teacher.lesson_7.lessoncode.quizz;

class Thing {
    public String name;
    public static String description;

    public static void showDescription() {
        System.out.println(description);
//        System.out.println(name);
    }
}

public class App {
    public static void main(String[] args) {
        Thing.description = "I am the thing";
        Thing.showDescription();
    }
}
