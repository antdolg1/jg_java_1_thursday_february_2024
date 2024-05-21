package students.ruslan_k.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtilInterfaceRealisations {

    List<String> simpleList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();
//ArrayList: adding/removing elements, situated not in the end of the List can execute slowly.
//LinkedList: Use more memory for List, but work faster;


    void methodSimpleList(){
        System.out.println("Do something...");
    }
    void methodLinkedList(){
        System.out.println("Do something more...");
    }

}
