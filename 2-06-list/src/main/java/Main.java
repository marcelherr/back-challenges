import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        School school = new School();
        school.addStudent(new Student("Alex", "Mueller", "1234"));
        school.addStudent(new Student("Bernd", "Maier", "4321"));
        school.addStudent(new Student("Bruno", "Schuler", "5678"));
        school.printAll();
        school.findById("5678");
//        school.removeById("1234");
//        school.printAll();
    }
}
