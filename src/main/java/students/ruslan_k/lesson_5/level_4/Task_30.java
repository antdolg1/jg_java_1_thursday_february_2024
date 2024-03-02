package students.ruslan_k.lesson_5.level_4;

class Task_30 {
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
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array element #%s is %s\n", i + 1, array[i]);
        }
        System.out.println("List of odd elements:");
        for (int i = 0; i < arrayLen; i++) {
            if (array[i] % 2 != 0) {
                System.out.printf("#%s - %s \n", i + 1, array[i]);
            }
        }

    }
}