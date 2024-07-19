package students.karina_cmile.lesson_11.level_1_intern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {

        // ArrayList creation
        List<String> groupMembers = new ArrayList<>();
        groupMembers.add("Alena");
        groupMembers.add("Marina");
        groupMembers.add("Anna");
        groupMembers.add("Ingus");
        groupMembers.add("Einars");
        groupMembers.add("Maris");
        System.out.println(groupMembers);


        // LinkedList creation
        List<String> tools = new LinkedList<>();
        tools.add("Pin gage");
        tools.add("Pincette");
        tools.add("Scissors");
        tools.add("Jig");
        System.out.println(tools);
    }

    /*
    ▸ LinkedList потребляет больше памяти, чем ArrayList;
    ▸ ArrayList медленнее, потому что элементы в ArrayList необходимо сдвинуть, если элемент добавляется или удаляется посередине;
    ▸ LinkedList быстрее, потому что необходимо изменить только ссылки;
    */

}
