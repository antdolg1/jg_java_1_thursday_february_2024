package teacher.lesson_11.lessoncode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();
        List<String> animals2 = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.addFirst("Tiger");
        animals.addLast("Horse");

        animals.add(2, "Fish");

        String firstAnimal = animals.getFirst();
        String lastAnimal = animals.getLast();
        String animal = animals.get(3);
        System.out.println("First animal: " + firstAnimal + ", last animal: " + lastAnimal);

        boolean hasDog = animals.contains("Dog");
        System.out.println("Animals list contains Dog? " + hasDog);
        boolean isEmpty = animals.isEmpty();

        for (String animalEntry : animals) {
            System.out.println(animalEntry);
        }

        System.out.println("List is empty? " + isEmpty);

        System.out.println("______");

        List<Integer> numbers = new LinkedList<>();
        numbers.add(21);
        numbers.add(2);
        numbers.add(1231);
        numbers.add(234);
        numbers.add(234324324);
        numbers.add(988);
        numbers.add(5);
        numbers.add(67);

        System.out.println("Numbers content: " + numbers);

        Collections.sort(numbers);
        System.out.println("Numbers content after sorting: " + numbers);

        Collections.sort(animals);
        System.out.println("Animals content after sorting: " + animals);

    }
}
