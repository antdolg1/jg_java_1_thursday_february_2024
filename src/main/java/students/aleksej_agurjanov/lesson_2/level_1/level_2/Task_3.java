package students.aleksej_agurjanov.lesson_2.level_1.level_2;

class Book{

    private String Name;
    private String type;
    private int price;

    private Book(String Name, String type, int price) {
        this.Name = Name;
        this.type = type;
        this.price = price;
    }

    public String getName() { return Name; }

    public String getType() { return type; }

    public int getPrice() { return price; }


}
