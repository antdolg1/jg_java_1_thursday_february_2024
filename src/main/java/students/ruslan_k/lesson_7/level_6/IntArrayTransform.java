package students.ruslan_k.lesson_7.level_6;

class IntArrayTransform {
    static int[] copyInRange(int[] in, int numberFrom, int numberTo) {

        int counter = countNewArrayDimension(in, numberFrom, numberTo);
        int[] result = new int[counter];

        fillingNewArray(in, result, numberFrom, numberTo);
        return result;
    }

    private static int countNewArrayDimension(int[] in, int numFrom, int numTo) {
        int count = 0;
        for (int arrayElement : in) {
            if (arrayElement >= numFrom && arrayElement <= numTo) count++;
        }
        return count;
    }

    private static void fillingNewArray(int[] in, int[] result, int numberFrom, int numberTo) {
        int indexForResult = 0;
        for (int inElement : in) {
            if (inElement >= numberFrom && inElement <= numberTo) {
                result[indexForResult++] = inElement;
            }
        }
    }

}
