import java.util.ArrayList;
import java.util.List;

public class School {

    List<Student> students = new ArrayList<>();


    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
