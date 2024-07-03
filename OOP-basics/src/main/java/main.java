public class main {

    public static void main(String[] args) {
        Car marcelsCar = new Car("BMW", "M3", "green", 2024);
        marcelsCar.start();
        marcelsCar.acceleration();
        marcelsCar.acceleration();
        marcelsCar.acceleration();
        Car AlinasCar = new Car("BMW", "X5", "schwarz", 2020);
        AlinasCar.start();
        AlinasCar.acceleration();
        AlinasCar.acceleration();
        AlinasCar.acceleration();
        AlinasCar.brake();
        Car weekendCar = new Car("Porsche", "992 GT3", "schwarz", 2020);
        weekendCar.start();
        weekendCar.acceleration();
        weekendCar.acceleration();
        weekendCar.acceleration();
        weekendCar.brake();
        weekendCar.brake();
        Person MarcelsPerson = new Person("Marcel", 33, "Male", "Pineapple the Fruit Dude");
        Person AlinasPerson = new Person("Alina", 30, "Female", "Bobbelz");
        Person GroguPerson = new Person("Grogu", 50, "Male", "Bibi Yoda");
        MarcelsPerson.introduction();
        AlinasPerson.introduction();
        GroguPerson.introduction();
    }
}