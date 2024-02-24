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

class CalculatorApp{
    public static void main(String[] args) {
        Calculator calc =new Calculator();

        int firstTestValue=15;
        int secondTestValue=2;
        int secondWrongTestValue=0;

        int resSum=17;
        int resSub=13;
        int resMul=30;
        int resDiv=7;
        int resDivByZero=0;


        String testResult=(calc.sum(firstTestValue,secondTestValue)==resSum)? "Pass": "False";
        System.out.println("Test Sum is " + testResult);
        testResult=(calc.sub(firstTestValue,secondTestValue)==resSub)? "Pass": "False";
        System.out.println("Test Sub is " + testResult);
        testResult=(calc.mul(firstTestValue,secondTestValue)==resMul)? "Pass": "False";
        System.out.println("Test Mul is " + testResult);
        testResult=(calc.div(firstTestValue,secondTestValue)==resDiv)? "Pass": "False";
        System.out.println("Test Div is " + testResult);
        testResult=(calc.div(firstTestValue,secondWrongTestValue)==resDivByZero)? "Pass": "False";
        System.out.println("Test Divide by Zero  is " + testResult);
        System.out.println("1-st Even Test is " + (calc.isEven(firstTestValue)? "False":"Pass"));
        System.out.println("2-nd Even Test is " + (calc.isEven(secondTestValue)? "Pass":"False"));




    }
}