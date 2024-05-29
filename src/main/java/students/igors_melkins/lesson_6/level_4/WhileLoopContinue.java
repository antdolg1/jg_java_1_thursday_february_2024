package students.igors_melkins.lesson_6.level_4;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5 ){
            i++;
            if (i == 3 ){
                continue;
            }
            System.out.println("Current value of i :" + i);

        }
    }
}
