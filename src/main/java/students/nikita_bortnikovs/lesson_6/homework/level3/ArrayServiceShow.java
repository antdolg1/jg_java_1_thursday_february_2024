package students.nikita_bortnikovs.lesson_6.homework.level3;

public class ArrayServiceShow {
    public static void main(String[] args) {
        ArrayServiceMethods arrayServiceMethods = new ArrayServiceMethods();
        int[] array = {1, 2, 3, 4};
        int numberToSearch = 3;
        arrayServiceMethods.findArrayNumber(array, numberToSearch);


        int[] array2 = {1, 2, 3, 4, 3, 3, 3, 3, 3, 3};
        int numberToSearch2 = 3;
        int count = arrayServiceMethods.duplicateNumbersCount(array2, numberToSearch2);
        System.out.println("Your number was found " + count + "times");
    }
}
