package teacher.lesson_11.lessoncode;

import java.util.*;

public class MapsDemo {

    public static void main(String[] args) {
        //не гарантирует порядка в котором элементы были добавлены
        Map<Integer, String> hashMap = new HashMap<>();

        //элементы сохраняют порядок, в котором были добалены
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //элементы отсортированны в натуральном порядке (1, 2, 3) или (A, B, C)
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Ferrari");
        treeMap.put(2, "Porsche");
        treeMap.put(4, "Ford");
        treeMap.put(3, "Subaru");
        treeMap.put(5, "Toyota");
        treeMap.put(6, "Volvo");
        treeMap.put(7, "VW");
//        treeMap.put(null, null); //бросит NPE

        linkedHashMap.put(1, "Ferrari");
        linkedHashMap.put(null, null);
        linkedHashMap.put(9, null);
        linkedHashMap.put(2, "Porsche");
        linkedHashMap.put(4, "Ford");
        linkedHashMap.put(3, "Subaru");
        linkedHashMap.put(6, "Volvo");
        linkedHashMap.put(5, "Toyota");
        linkedHashMap.put(7, "VW");

        hashMap.put(1, "BMW"); //перезапишет значение под ключём 1
        System.out.println("=======");
        System.out.println("TreeMap content: " + treeMap);
        System.out.println("=======");
        System.out.println("linkedHashMap content: " + linkedHashMap);
        System.out.println("=======");
        System.out.println("HashMap content: " + hashMap);

        String car = hashMap.get(2);
        System.out.println("HashMap value with key 2 is: " + car);

        boolean containsKey = hashMap.containsKey(8);
        System.out.println("HashMap contains key with value 8? " + containsKey);

        boolean containsValue = hashMap.containsValue("Volvo");
        System.out.println("HashMap contains value Volvo? " + containsValue);

        List<String> hashMapValues = new ArrayList<>(hashMap.values());
        System.out.println("HashMapValues list content: " + hashMapValues);

        System.out.println("HashMap size: " + hashMap.size());

        hashMap.remove(2);
        System.out.println("HashMap size: " + hashMap.size());

        String removedValue = hashMap.remove(3);
        System.out.println(removedValue);
        System.out.println("HashMap size: " + hashMap.size());

        //итерация по ключам
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key);
        }

        //итерация по значениям
        for (String value : hashMap.values()) {
            System.out.println("Value: " + value);
        }

        //итерация по парам ключ-значение
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        boolean isEmpty = hashMap.isEmpty();
        System.out.println("HashMap is empty? " + isEmpty);

        hashMap.clear();
        isEmpty = hashMap.isEmpty();
        System.out.println("HashMap is empty? " + isEmpty);





    }
}
