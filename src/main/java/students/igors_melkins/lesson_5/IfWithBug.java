package students.igors_melkins.lesson_5;

public class IfWithBug {
    public static void main(String[] args) {
        int num = 40;

        if (num > 10) {
            System.out.println("Level C");

        } else if (num > 20){
            System.out.println("Level B");
        }  else if (num > 30) {
            System.out.println("Level A");

        }

        if (num > 10 ){
            System.out.println("Level C");

        } if (num > 20){
            System.out.println("Level B");
        }  if (num > 30) {

        } System.out.println("Level A");

        // это приведёт к ошибке компиляции
        int a = 20, b = 20;
//        if (a & b) {
//            System.out.println("Print");
//        }


    }

}
