package students.ruslan_k.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class ListWithDuplicate {
    public static void main(String[] args) {
        List<String> listWithDuplicate = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listWithDuplicate.add("Duplicate");
        }
        int sizeOfList = listWithDuplicate.size();

        System.out.println("Current size of List is :" + sizeOfList);

        for(String element: listWithDuplicate){
            System.out.println(element);
        }
        System.out.println("In List duplicates is allowed");

    }
}
