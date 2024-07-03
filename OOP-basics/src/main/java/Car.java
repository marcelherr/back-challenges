public class Car {
    String brand;
    String model;
    String color;
    int year;
    int speed;


    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = 0;
    }

    public void start() {
        System.out.println("The " + brand + " " + model + " is starting");
    }

    public void acceleration() {
        speed += 20;
        System.out.println("The " + brand + " " + model + " is accelerating" + " to " + speed + " kmh.");
    }

    public void brake() {
        speed -= 30;
        System.out.println("The " + brand + " " + model + " is braking" + " to " + speed + " kmh.");
    }
}