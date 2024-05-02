package teacher.lesson_9.lessoncode.polymorphism;

public class SingerDemo {
    public static void main(String[] args) {

        Singer michael = new Michael();
        Singer britney = new Britney();
        Singer elvis = new Elvis();

        Singer[] singers = new Singer[3];
        singers[0] = michael;
        singers[1] = britney;
        singers[2] = elvis;

        for (Singer singer : singers) {
            singer.sing();
        }
    }
}
