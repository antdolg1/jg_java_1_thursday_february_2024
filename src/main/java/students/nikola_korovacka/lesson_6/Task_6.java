package students.nikola_korovacka.lesson_6;

class NumberUtils {

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
public class Task_6 {
    public static void main(String[] args) {
        NumberUtils utils = new NumberUtils();

        //Pārbauda vai katrs pāra skaitlis atgriež true
        for (int i = 2; i <= 10; i += 2) {
            if (!utils.isEven(i)) {
                System.out.println("FAIL: " + i + " should be even");
            }
        }
        //Pārbauda vai katrs nepāra skaitlis atgriež false
        for (int i = 1; i <= 7; i += 2) {
            if (utils.isEven(i)) {
                System.out.println("FAIL: " + i + " should not be even");
            }
        }
        System.out.println("Tests completed");
    }
}