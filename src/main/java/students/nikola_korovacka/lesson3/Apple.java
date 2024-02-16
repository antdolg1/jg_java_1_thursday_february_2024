package students.nikola_korovacka.lesson3;

class Apple {
    private String type;
    private String color;
    private int weight;

    public Apple(String type, String color, int weight){
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType(){return this.type;}
    public String getColor(){return this.color;}
    public int getWeight(){return this.weight;}
}
