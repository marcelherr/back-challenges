import java.util.HashMap;
import java.util.Map;

public class School {

    private Map<String, Student> students;

    public School() {
        students = new HashMap<>();
    }

    public void addStudent(String key, Student student) {
        students.put(key, student);
    }

    public void printAll() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public void findByKey(String key) {
        students.get(key);
        System.out.println(students.get(key));
    }

    public void removeByKey(String key) {
        students.remove(key);
    }
}

