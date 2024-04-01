package students.ruslan_k.lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        ArrayUtilTest test = new ArrayUtilTest();
        int test1 = 10;
        int test2 = 0;
        int test3 = -2;
        int[] myArray = new int[10];
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        for (int result : myArray) {
            System.out.println(result);
        }
        System.out.println("------------------");
        test.shouldCreateArray(test1);
        test.shouldCreateArray(test2);
        test.shouldCreateArray(test3);

    }

    public void shouldCreateArray(int test) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray;
        int expectValue;
        if (test >= 0) {
            expectValue = test;
        } else {
            expectValue = 0;
        }
        myArray = arrayUtil.createArray(test);
        //expectValue=myArray.length;
        if (myArray.length == expectValue) {
            System.out.println("Was created array with " + expectValue + " elements \n Test was passed");
        } else {
            System.out.println("Test was failed");
        }
    }

}