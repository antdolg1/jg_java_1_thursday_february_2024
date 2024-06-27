package teacher.lesson_11.lessoncode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Riga");
        hashSet.add("Valmiera");
        hashSet.add("Ventspils");
        hashSet.add("Liepaja");
        hashSet.add("Jelgava");
        hashSet.add("Tukums");
        hashSet.add("Daugavpils");
        hashSet.add("Riga");
        hashSet.add("Riga");
        hashSet.add(null);

        boolean containsRiga = hashSet.contains("Riga");
        System.out.println("HashSet contains Riga: " + containsRiga);

        System.out.println(hashSet);

        boolean added = hashSet.add("Tukums"); //вернёт false, так как Tukums уже есть в нашем Set
        System.out.println("Tukums added again: " + added);

        boolean isRemoved = hashSet.remove("Riga");
        System.out.println("Riga removed: " + isRemoved);
        boolean isRemovedTwo = hashSet.remove("Riga");
        System.out.println("Riga removed: " + isRemovedTwo);

        int size = hashSet.size();
        System.out.println("Size or hashSet " + size);

        for (String city : hashSet) {
            System.out.println(city);
        }

        hashSet.clear();
        System.out.println("========");

        treeSet.add("Riga");
        treeSet.add("Daugavpils");
        treeSet.add("Tukums");
        treeSet.add(null);
        treeSet.add("Ventspils");

        System.out.println("TreeSet content:" + treeSet);

    }
}
