package students.nikita_bortnikovs.lesson10.hw.level1;

import java.util.ArrayList;

public class MyList implements MyListUtil{
    static ArrayList<String> GroceryList = new ArrayList<>();


    public MyList() {
        GroceryList.add("milk");
        GroceryList.add("cookies");
        GroceryList.add("jam");
        GroceryList.add("ham");
        GroceryList.add("beer");


    }

    @Override
    public  void printList(ArrayList<String> list) {
        System.out.println(GroceryList);

    }

    @Override
    public void removeItem(ArrayList<String> list, String item) {
        list.remove(item);

    }

    @Override
    public void addItem(ArrayList<String> list, String item) {
        list.add(item);
    }

    public static void main(String[] args) {
        MyList list = new MyList();

        list.printList(GroceryList);
        list.removeItem(GroceryList, "milk");
        list.printList(GroceryList);
        list.addItem(GroceryList, "milk");
        list.printList(GroceryList);
    }
}