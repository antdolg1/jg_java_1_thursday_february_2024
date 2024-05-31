package students.karina_cmile.lesson_10.level_1_intern.Task_3;

import java.util.ArrayList;

public interface MyList {
    public static void main(String[] args) {


        // Создание списка с типом данных, например, String
        ArrayList<String> someList = new ArrayList<>();

        // Добавление элементов в конец списка
        someList.add("Элемент1");
        someList.add("Элемент2");
        someList.add("Элемент3");

        //  Добавление элементов в середину списка списка
        someList.add(1, "Element2");

        // Добавление элементов в начало списка
        someList.add(0, "Element1");

        // Получение элемента под определенным индексом
        System.out.println(someList.get(3));

        // Узнать индекс определенного элемента
        System.out.println(someList.indexOf("Элемент3"));

        // Заменить один элемент на другой
        someList.set(2, "ELEMENT");

        // Удалить элемент
        someList.remove(1);
        someList.remove("ELEMENT");

        // Очистить список
        // someList.clear();

        // Размер списка
        int someListSize = someList.size();
        System.out.println("List size: " + someListSize);

        // Проверка пустой ли список
        boolean isEmpty = someList.isEmpty();
        System.out.println("Some list is empty? " + isEmpty);

        // Узнать, есть ли данный элемент в списке?
        boolean hasElement = someList.contains("Element6");
        System.out.println("Some list contains Element6? " + hasElement);

        System.out.println("________________");

        // Проход по элементам списка
        for (String s : someList) {
            System.out.println(s);
        }
    }
}
