public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstNAme, String lastName) {
        this.firstName = firstNAme;
        this.lastName = lastName;
    }

    public String getFirstNAme() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setFirstNAme(String firstNAme) {
        this.firstName = firstNAme;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " | " + lastName;
    }
}
