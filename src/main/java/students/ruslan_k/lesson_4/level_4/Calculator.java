package students.ruslan_k.lesson_4.level_4;

class Calculator {
  /*
  int firstInt, secondInt;
    Calculator(){
        this.firstInt=0;
        this.secondInt=0;
    }
*/
    int sum(int firstInt, int secondInt){
        return firstInt+secondInt;
    }
    int sub(int firstInt, int secondInt){
        return firstInt-secondInt;
    }
    int mul(int firstInt, int secondInt){
        return firstInt*secondInt;
    }
    int div(int firstInt, int secondInt){
        if (secondInt==0){
            System.out.println("Are You SURE ??? You want divide by ZERO ??? You need Doc's assist!");
            return 0;
        }
        else
            return firstInt/secondInt;
    }
    boolean isEven(int number) {
        return ((number % 2)==0);
    }

}
