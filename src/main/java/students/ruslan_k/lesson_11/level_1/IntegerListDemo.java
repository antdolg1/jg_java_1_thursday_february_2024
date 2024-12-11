package students.ruslan_k.lesson_11.level_1;

import java.util.ArrayList;


public class IntegerListDemo {


    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.addFirst(2);
        integerList.addLast(3);
        integerList.add(2, 4);
        for (int i = 0; i < integerList.size(); i++) {
            System.out.printf("%d List Element : %d\n", i + 1, integerList.get(i));
        }
        integerList.remove((Integer) 1);
        System.out.println("After 1-st removing ");

        for (int i = 0; i < integerList.size(); i++) {
            System.out.printf("%d List Element : %d\n", i + 1, integerList.get(i));
        }

        integerList.remove(1);
        boolean isEmpty = integerList.isEmpty();

        System.out.println("If list is not empty, to do the printing each of List element:");
        if (!isEmpty) {
            for (Integer element : integerList) {
                System.out.println(element);
            }
        }


    }
}
