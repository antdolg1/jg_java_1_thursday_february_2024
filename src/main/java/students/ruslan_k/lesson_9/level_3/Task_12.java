package students.ruslan_k.lesson_9.level_3;

abstract class Ship {


    int displacement;
    int topSpeed;
    private int course;
    String typeOfVessel;
    String nameOfVessel;

    public Ship(int displacement, int topSpeed, String typeOfVessel, String nameOfVessel) {
        this.displacement = displacement;
        this.topSpeed = topSpeed;
        this.typeOfVessel = typeOfVessel;
        this.nameOfVessel = nameOfVessel;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    abstract void maneuver();


}

class Battleship extends Ship {
    int gunAmount;
    int torpedoAmount;

    public Battleship(int displacement, int topSpeed, String typeOfVessel, String nameOfVessel, int gunAmount, int torpedoAmount) {
        super(displacement, topSpeed, typeOfVessel, nameOfVessel);
        this.gunAmount = gunAmount;
        this.torpedoAmount = torpedoAmount;
    }

    @Override
    void maneuver() {
        System.out.println("Fast Turn");
    }
}

class CivilianShip extends Ship {
    final int courseChangeValue = 1;
    int cargoCapacity;

    public CivilianShip(int displacement, int topSpeed, String typeOfVessel, String nameOfVessel, int cargoCapacity) {
        super(displacement, topSpeed, typeOfVessel, nameOfVessel);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    void maneuver() {
        System.out.println("Slow Turn");
    }
}