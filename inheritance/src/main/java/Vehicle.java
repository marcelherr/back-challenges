public class Vehicle {
    protected String manufacturer;
    protected String model;
    protected int year;

    public Vehicle() {

    }

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }


    public void display() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year of Manufacturing: " + year);
    }

}

