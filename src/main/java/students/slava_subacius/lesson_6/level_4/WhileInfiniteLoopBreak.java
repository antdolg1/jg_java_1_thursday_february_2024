package students.slava_subacius.lesson_6.level_4;

public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            System.out.println("While loop iteration: " + i);
            i++;
            if (i == 5) {
                break;
            }
        }
    }
}
