import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(12, "Alice", "123 Main St", "A");
        Student student2 = new Student(23, "Bob", "456 Oak St", "B");
        Student student3 = new Student(34, "Charlie", "789 Pine St", "A");

        Teacher teacher1 = new Teacher(567, "Paul", "Math");
        Teacher teacher2 = new Teacher(568, "Jack", "English");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(student3);

        Course c1 = new Course(123, "c1", teacher1, studentList);
        Course c2 = new Course(123, "c2", teacher2, studentList2);

        System.out.println(c1);
        System.out.println(c2);


    }
}
