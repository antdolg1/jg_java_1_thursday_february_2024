package students.kristina_manevica.lesson_5.homework.level_4;

public class Task25 {
    public static void main(String[] args) {

        int arrayLength = ArrayUtil.getArrayLengthFromUser();
        int[] array = ArrayUtil.createArray(arrayLength);
        ArrayUtil.fillArrayFromUser(array);
        ArrayUtil.printArrayToConsole(array);
    }
}

/*      //previous version
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter element value with index: " + i);
            arrays[i] = scanner.nextInt();
        }
        System.out.println("All array elements: " + Arrays.toString(arrays));
        }*/