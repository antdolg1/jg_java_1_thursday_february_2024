package teacher.lesson_5.lessoncode;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        String[] animals = new String[5];

        animals[0] = "Лев";
        animals[3] = "Хомяк";
        animals[1] = "Кот";
        animals[2] = "Собака";
        animals[4] = "Крокодил";
        animals[2] = "Орёл";


        //вывод всех элементов массива в консоль
        for (int i = 0; i < animals.length; i++){
            System.out.println("[" + i +"]" + " = " + animals[i]);
        }

        System.out.println(animals);
        System.out.println("Содержание массива animals: " + Arrays.toString(animals));

        System.out.println("Значение в первой ячейке массива - " + animals[0]);
        System.out.println("Значение в третьей ячейке массива - " + animals[2]);
        System.out.println("Размер массива animals = " + animals.length);

        String[] animals2 = {"Бобёр", "Жираф", "Лошадь"};
        System.out.println("Размер массива animals2 = " + animals2.length);

        int[] numbers = {1, 2, 3, 4};
        int[] numbers2 = new int[3];
        numbers2[0] = 1;
        numbers2[1] = 33;
        System.out.println("Значение в первой ячейке массива - " + numbers2[0]);
        System.out.println("Значение в третьей ячейке массива - " + numbers2[2]);

        // у boolean значение по умолчанию это false
        // у String это null
        // у int, double etc. это 0 или 0.0
        boolean[] array = new boolean[2];
        array[0] = true;
        System.out.println("Значение во второй ячейке массива - " + array[1]);

        int[] numArrray = {1, 5, 4, 3, 7};
        System.out.println(numArrray);
        System.out.println(Arrays.toString(numArrray));
        Arrays.sort(numArrray, 0, 4);
        System.out.println(Arrays.toString(numArrray));
        int key = Arrays.binarySearch(numArrray, 5);
        System.out.println(key);








    }
}
