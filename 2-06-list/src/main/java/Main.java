import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alex", "Mueller", "S1234"));
        students.add(new Student("Bernd", "Maier", "S4321"));


        for (Student student : students) {
            System.out.println(student);
        }

        School school = new School();
        school.addStudent(new Student("Bruno", "Schuler", "S5678"));
        school.printAll();

    }
}
