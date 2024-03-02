package students.ruslan_k.lesson_5.level_4;

class Task_27 {
    public static void main(String[] args) {
        int arrayLen;
        do {
            arrayLen = (int) (Math.random() * 10);
        } while (arrayLen == 0);
        int[] array = new int[arrayLen];
        System.out.println("PLease be informed, that Array with " + array.length + " INT elements was created");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array element #%s is %s\n", i + 1, array[i]);
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println("The value of max array's element is " + maxElement);
    }

}
