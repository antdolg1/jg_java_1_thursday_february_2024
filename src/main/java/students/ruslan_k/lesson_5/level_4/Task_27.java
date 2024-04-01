package students.ruslan_k.lesson_5.level_4;

class Task_27 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil=new ArrayUtil();
        int arrayLen;
        do {
            arrayLen = (int) (Math.random() * 20);
        } while (arrayLen == 0);
        int[] array = arrayUtil.createArray(arrayLen);
        System.out.println("PLease be informed, that Array with " + array.length + " INT elements was created");
        arrayUtil.fillArrayWithRandomNumbers(array);
        int maxElement= arrayUtil.findMaxNumber(array);
        System.out.println("The value of max array's element is " + maxElement);
    }

}
