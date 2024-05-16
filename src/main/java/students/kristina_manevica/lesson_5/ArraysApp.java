package students.kristina_manevica.lesson_5;

import java.util.Arrays;

class ArraysApp {
    public static void main(String[] args) {

        //dlinna massiva = kol-vo elementov tam

        String[] animals = new String[5];

        animals[0] = "lion";
        animals[1] = "cat";
        animals[2] = "dog";
        animals[3] = "monkey";
        animals[4] = "crocodil";

        //vivod vseh elementov massiva na console
        for(int i =0; i < animals.length; i++){
            System.out.println("[" + i + " ]" + " =" + animals[i]);
        }

        System.out.println("Soderzhanije massiv animals: " + java.util.Arrays.toString(animals));

        System.out.println("In first index of array " + animals[0]);
        System.out.println("In third index of array " + animals[2]);
        System.out.println("Array lenght " + animals.length);

        String[] animals2 = {"Neel", "Sesks"};

        System.out.println("Array lenght " + animals2.length);

        int[] number = {5, 7, 6, 9, 0};
        int[] number2 = new int[3];
        number2[0] = 1;
        number2[1] = 33;
        System.out.println("in first array " + number2[0]);
        System.out.println("in second array " + number2[2]);

        int numArray[] = {1, 5, 4, 3, 7};
        System.out.println(numArray);    //nepraviljno
        System.out.println(java.util.Arrays.toString((numArray)));
        Arrays.sort(numArray, 0, 4);
        System.out.println(Arrays.toString(numArray));

        int key = Arrays.binarySearch(numArray, 5);
        System.out.println(key);
    }
}
