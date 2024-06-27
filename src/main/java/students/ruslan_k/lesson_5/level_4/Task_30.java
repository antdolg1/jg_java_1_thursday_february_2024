package students.ruslan_k.lesson_5.level_4;

class Task_30 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil=new ArrayUtil();
        int arrayLen;
        do {
            arrayLen = (int) (Math.random() * 10);
        } while (arrayLen == 0);
        int[] array = arrayUtil.createArray(arrayLen);
        System.out.println("PLease be informed, that Array with " + array.length + " INT elements was created");
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        arrayUtil.listOddElements(array);

    }
}