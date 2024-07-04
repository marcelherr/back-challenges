public class Car extends Vehicle {
    private int numberOfDoors;


    public Car(String manufacturer, String model, int year, int numberOfDoors) {
        super(manufacturer, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                "} " + super.toString();
    }

    public void display() {
        super.display();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
