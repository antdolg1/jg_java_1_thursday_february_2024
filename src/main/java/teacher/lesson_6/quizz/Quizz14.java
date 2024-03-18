package teacher.lesson_6.quizz;

public class Quizz14 {
    public static void main(String[] args) {

        int y = 0;
        for (int i = 0; i < 10; ++i) {
            y += i; //тоже самое что y = y + i;
            System.out.println("y value on iteration " + i + " is " + y);
        }
        System.out.println(y);

    }
}
