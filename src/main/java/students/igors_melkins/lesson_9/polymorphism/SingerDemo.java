package students.igors_melkins.lesson_9.polymorphism;

public class SingerDemo {
    public static void main(String[] args) {


            Singer michael= new Michael();
            Singer britny = new Britny();
            Singer elvis = new Evlis();

            Singer[] singers = new Singer[3];
            singers[0] = michael;
            singers[1] = britny;
            singers[2] = elvis;

            for (Singer singer : singers ){
                singer.sing();
            }



    }
}
