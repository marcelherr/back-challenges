import java.util.Objects;

public class Medication {
    private String name;
    private int price;
    private boolean available;

    public Medication(String name, int price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }

    public String toString() {
        return " Preis: " + price + " Verfuegbar: " + available + " | ";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return price == that.price && available == that.available && Objects.equals(name, that.name);
    }

    public int hashCode() {
        return Objects.hash(name, price, available);
    }
}
