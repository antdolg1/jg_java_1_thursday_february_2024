package students.karina_cmile.lesson_11.level_1_intern;

import java.util.LinkedList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        numbers.add(5);
        numbers.add(54);

        numbers.addFirst(100);
        numbers.addLast(200);
        System.out.println(numbers);

        System.out.println("The size of the list is: " + numbers.size());

        numbers.remove();
        System.out.println("List with removed head: "+ numbers);

        numbers.remove(8);
        System.out.println("List with removed element in index 8: "+ numbers);

        numbers.removeFirst();
        System.out.println("List with removed first element: "+ numbers);

        numbers.removeLast();
        System.out.println("List with removed last element: "+ numbers);

        numbers.removeFirstOccurrence(3);
        System.out.println("List with removed first '3' element occurrence: "+ numbers);

        boolean isEmpty = numbers.isEmpty();
        System.out.println("List is empty? " + isEmpty);

        System.out.println("    ");
        for (Integer numbersEntry : numbers) {
            System.out.println(numbersEntry);
        }
    }
}
