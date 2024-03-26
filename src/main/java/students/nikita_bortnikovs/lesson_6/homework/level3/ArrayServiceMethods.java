package students.nikita_bortnikovs.lesson_6.homework.level3;

public class ArrayServiceMethods {

    public boolean findArrayNumber(int[] arr, int numberToSearch) {
        boolean found = false;

        for (int number : arr) {
            if (number == numberToSearch) {
                found = true;
                System.out.println("Your number is found in our array, congrats! Your number is: " + numberToSearch);
                break;
            }
        }
        if (!found) {
            System.out.println("Your number is not found in our array, sorry!");
        }

        return found;
    }

    public int duplicateNumbersCount(int[] arr, int numberToSearch) {
        int count = 0;
        for (int number : arr) {
            if (number == numberToSearch) {
                count++;


            }

        }
        return count;


    }
}
