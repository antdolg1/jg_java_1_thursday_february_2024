package students.ruslan_k.lesson_5.level_4;

class Task_28 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil=new ArrayUtil();
        int arrayLen;
        do {
            arrayLen = (int) (Math.random() * 10);
        } while (arrayLen == 0);
        int[] array = arrayUtil.createArray(arrayLen);
        System.out.println("PLease be informed, that Array with " + array.length + " INT elements was created");
        arrayUtil.fillArrayWithRandomNumbers(array);
        int minElement = arrayUtil.findMinNumber(array);
        System.out.println("The value of min array's element is " + minElement);
    }

}
