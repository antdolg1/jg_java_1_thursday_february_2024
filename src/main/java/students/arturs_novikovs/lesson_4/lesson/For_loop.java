package students.arturs_novikovs.lesson_4.lesson;

public class For_loop {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                continue;
            }
                System.out.println("stroka nomer " + i);
       System.out.println("ja vivel stroku");
    }
}}