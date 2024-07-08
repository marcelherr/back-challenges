public class Student {
    private String firstName;
    private String lastName;
    private String studentId;


    public Student(String firstNAme, String lastName, String studentId) {
        this.firstName = firstNAme;
        this.lastName = lastName;
        this.studentId = studentId;


    }

    public String getFirstNAme() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setFirstNAme(String firstNAme) {
        this.firstName = firstNAme;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return "Student{" +
                "firstNAme='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
