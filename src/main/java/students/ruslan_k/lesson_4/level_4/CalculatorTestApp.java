package students.ruslan_k.lesson_4.level_4;

public class CalculatorTestApp {


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
