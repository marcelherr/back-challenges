import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Blubber Bernd", 35, "Hauptstrasse 1");
        Owner owner2 = new Owner("Tadeus Tentakel", 33, "Nebenstrasse 32");

        Species species1 = new Species("Hauskatze", 200);
        Species species2 = new Species("Hase", 100);

        Animal cat1 = new Animal(12345, "Katzischatzi", 7, species1, owner1);
        Animal cat2 = new Animal(23456, "Garry", 5, species1, owner1);
        Animal rabbit1 = new Animal(54321, "Hasilein", 3, species2, owner2);


        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(rabbit1);


        Zoo zoo1 = new Zoo("Hagenbeks Tierpark", "01.01.1990", "Hamburg", animals);

        System.out.println(cat1);
        System.out.println(rabbit1);
        System.out.println(cat1.equals(cat2));
        System.out.println(zoo1);
    }
}
