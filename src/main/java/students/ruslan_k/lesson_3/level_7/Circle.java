package students.ruslan_k.lesson_3.level_7;

class Circle {
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double calculateArea(){
        return radius*radius*Math.PI;
    }
}
