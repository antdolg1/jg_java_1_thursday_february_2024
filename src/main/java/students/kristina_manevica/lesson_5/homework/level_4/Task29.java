package students.kristina_manevica.lesson_5.homework.level_4;

class Task29 {
    public static void main(String[] args) {

        int arrayLength = ArrayUtil.createArrayRandomLength();
        int[] array = ArrayUtil.createArray(arrayLength);
        ArrayUtil.fillArrayWithRandomNumbers(array);
        ArrayUtil.printArrayToConsole(array);
        ArrayUtil.printEvenNumbersOfArray(array);
    }
}

       /*   //previous solution
       int[] arrays = new int[(int) (Math.random() * 10)];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array's elements: " + Arrays.toString(arrays));

        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j] % 2 == 0) {
                System.out.println("Even number: " + arrays[j]);
            }
        }
    }*/