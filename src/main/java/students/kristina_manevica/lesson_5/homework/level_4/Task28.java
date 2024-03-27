package students.kristina_manevica.lesson_5.homework.level_4;


class Task28 {
    public static void main(String[] args) {

        int arrayLength = ArrayUtil.createArrayRandomLength();
        int[] array = ArrayUtil.createArray(arrayLength);
        ArrayUtil.fillArrayWithRandomNumbers(array);
        ArrayUtil.printArrayToConsole(array);
        ArrayUtil.findMinNumber(array);
    }
}

        /*
        int[] arrays = new int[(int) (Math.random() * 10)];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 1000);
        }

        System.out.println("Array values: " + Arrays.toString(arrays));

        int minNumber = arrays[0];
        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j] < minNumber) {
                minNumber = arrays[j];
            }
        }
        System.out.println("Min number in array: " + minNumber);
    }*/