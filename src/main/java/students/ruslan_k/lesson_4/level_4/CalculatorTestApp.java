package students.ruslan_k.lesson_4.level_4;

class CalculatorTestApp {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
// Input data
        int firstTestValue = 15;
        int secondTestValue = 2;
        int thirdTestValue = -2;
        int secondWrongTestValue = 0;
// Expected data
        int resSum = 17;
        int resSub = 13;
        int resMul = 30;
        int resDiv = 7;
        int resDivByZero = 0;

// Test +
        String testResult = (calc.sum(firstTestValue, secondTestValue) == resSum) ? "Pass" : "False";
        System.out.println("Test Sum is " + testResult);
// Test -
        testResult = (calc.sub(firstTestValue, secondTestValue) == resSub) ? "Pass" : "False";
        System.out.println("Test Sub is " + testResult);
// Test *
        testResult = (calc.mul(firstTestValue, secondTestValue) == resMul) ? "Pass" : "False";
        System.out.println("Test Mul is " + testResult);
// Test /
        testResult = (calc.div(firstTestValue, secondTestValue) == resDiv) ? "Pass" : "False";
        System.out.println("Test Div is " + testResult);
// Test /0
        testResult = (calc.div(firstTestValue, secondWrongTestValue) == resDivByZero) ? "Pass" : "False";
        System.out.println("Test Divide by Zero  is " + testResult);
// Test Even-Odd
        System.out.println("1-st Even Test is " + (calc.isEven(firstTestValue) ? "False" : "Pass"));
        System.out.println("2-nd Even Test is " + (calc.isEven(secondTestValue) ? "Pass" : "False"));
// Test MAX
        testResult = (calc.getMax(firstTestValue, secondTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 1-st MAX is " + testResult);
        testResult = (calc.getMax(secondTestValue, firstTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 2-nd MAX is " + testResult);
        testResult = (calc.getMax(firstTestValue, firstTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 1-st equal with 2-nd is " + testResult);
// Test MAX_Of_3
        testResult = (calc.getMaxOf3(firstTestValue, secondTestValue,thirdTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 1-st MAX is " + testResult);
        testResult = (calc.getMaxOf3(secondTestValue, firstTestValue, thirdTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 2-nd MAX is " + testResult);
        testResult = (calc.getMaxOf3(secondTestValue,thirdTestValue, firstTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 3-rd MAX is " + testResult);
        testResult = (calc.getMaxOf3(firstTestValue, firstTestValue,thirdTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 1=2 MAX is " + testResult);
        testResult = (calc.getMaxOf3(firstTestValue, thirdTestValue, firstTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 1=3 MAX is " + testResult);
        testResult = (calc.getMaxOf3(thirdTestValue, firstTestValue, firstTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 2=3 MAX is " + testResult);
        testResult = (calc.getMaxOf3(firstTestValue, firstTestValue, firstTestValue) == firstTestValue) ? "Pass" : "False";
        System.out.println("Test 1=2=3 is " + testResult);

    }

}
