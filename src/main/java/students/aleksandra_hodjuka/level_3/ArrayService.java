package students.aleksandra_hodjuka.level_3;

class ArrayService {
    int number;
    int numberToSearch;
    int numberToReplace;
    int newNumber;


    public static boolean contains(int[] array, int numberToSearch) {
        for (int number : array) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public static int countOccurrences(int[] array, int numberToSearch) {
        int count = 0;

        for (int number : array) {
            if (number == numberToSearch) {
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 5};
        int number = 1;
        boolean result = contains(array, number);
        int occurrences = countOccurrences(array, number);
        System.out.println("Количество повторений числа " + number + ": " + occurrences + "раза!");
        if (contains(array, number)) {
            System.out.println("Массив содержит число " + number);
        } else {
            System.out.println("Массив не содержит число " + number);
        }
    }
}
