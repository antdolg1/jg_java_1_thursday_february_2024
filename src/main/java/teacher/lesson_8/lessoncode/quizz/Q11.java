package teacher.lesson_8.lessoncode.quizz;

public class Q11 {
    public static void main(String[] args) {

        String cat1 = "Cat";
        String cat2 = "Dog";
        cat2 = "Cat";
        String cat3 = new String("Cat").intern();

        System.out.println("cat1 == cat2 " + (cat1 == cat2));
        System.out.println("cat1 == cat3 " + (cat1 == cat3));



    }
}
