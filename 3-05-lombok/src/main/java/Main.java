import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = Student.builder()
                .name("Alice")
                .address("Main St 5")
                .id(12)
                .grade("B")
                .build();

        Student student2 = Student.builder()
                .id(23)
                .name("Bob")
                .address("456 Oak St")
                .grade("A")
                .build();

        Student student3 = Student.builder()
                .id(34)
                .name("Charlie")
                .address("789 Pine St")
                .grade("C")
                .build();

        Teacher teacher1 = Teacher.builder()
                .id(567)
                .name("Paul")
                .subject("Math")
                .build();

        Teacher teacher2 = Teacher.builder()
                .id(678)
                .name("John")
                .subject("English")
                .build();

        Teacher updatedTeacher2 = teacher2.withSubject("Sports");


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
