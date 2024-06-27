package students.igors_melkins.lesson_5.level_2;

public class Task_10 {
    public static void main(String[] args) {
        int [] numbers =  new int [3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;

        for (int i = 0;i < numbers.length;i++){
            System.out.println("[" + i + "]" + " = " + numbers[i]);
        }
    }
}
