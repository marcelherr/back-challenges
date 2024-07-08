public class Student {
    private String firstNAme;
    private String lastName;
    private String studentId;


    public Student(String firstNAme, String lastName, String studentId) {
        this.firstNAme = firstNAme;
        this.lastName = lastName;
        this.studentId = studentId;


    }

    public String getFirstNAme() {
        return firstNAme;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setFirstNAme(String firstNAme) {
        this.firstNAme = firstNAme;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return "Student{" +
                "firstNAme='" + firstNAme + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
