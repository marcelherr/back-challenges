import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void findById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println("Der gesuchte Student ist: " + student.getFirstNAme() + " | " + student.getLastName());
            }
        }
    }
//  finish this
//    public void removeById(String studentId) {
//        if (students.getStudentId().equals(studentId)) {
//            students.remove(student);
//            System.out.println("Der Student mit der ID: " + studentId + " wurde geloescht.");
//        }
//    }
}





