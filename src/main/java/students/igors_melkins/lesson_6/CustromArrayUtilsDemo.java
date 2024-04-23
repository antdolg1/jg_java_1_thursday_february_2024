package students.igors_melkins.lesson_6;

public class CustromArrayUtilsDemo {
    public static void main(String[] args) {

        int arrayLength1 = CustomArrayUtils.getArrayLengthFromUser();
        int arrayLength2 = CustomArrayUtils.getArrayLengthFromUser();

        int [] array1 = CustomArrayUtils.createArray(arrayLength1);
        int [] array2 = CustomArrayUtils.createArray(arrayLength2);

        CustomArrayUtils.fillArrayWithNumbersFromUser(array1);
        CustomArrayUtils.fillArrayWithNumbersFromUser(array2);

        CustomArrayUtils.printArrayToConsole(array1);
        CustomArrayUtils.printArrayToConsole(array2);

        CustomArrayUtils.reverseArray(array1);
        CustomArrayUtils.printArrayToConsole(array2);

        String [] stringsArray = {"Red","Blue","Orange"};

        System.out.println("Array contains word Black? - " + CustomArrayUtils.containsStringValue(stringsArray, "Black"));

    }






    }

