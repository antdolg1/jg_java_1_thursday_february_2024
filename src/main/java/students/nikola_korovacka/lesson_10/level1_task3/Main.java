package students.nikola_korovacka.lesson_10.level1_task3;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyArrayList();

        myList.add(10);
        myList.add(20);
        myList.add(30);

        System.out.println("List size: " + myList.size());
        System.out.println("Element at index 0: " + myList.get(0));
        System.out.println("Element at index 1: " + myList.get(1));
        System.out.println("Element at index 2: " + myList.get(2));
    }
}
