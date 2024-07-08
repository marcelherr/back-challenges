import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        School school = new School();
        school.addStudent("1234", new Student("Alex", "Mueller"));
        school.addStudent("4321", new Student("Bernd", "Maier"));
        school.addStudent("5678", new Student("Bruno", "Schuler"));
        school.printAll();
        school.findByKey("1234");
        school.removeByKey("1234");
        school.printAll();
    }
}
