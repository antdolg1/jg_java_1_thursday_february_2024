package students.aleksandra_hodjuka.lesson_3.level_2;

 class Car {
    String model;
    String color;
    Double price;


     Car(String model, String color, Double price) {
        this.model = model;
        this.color = color;
        this.price = price;

    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
