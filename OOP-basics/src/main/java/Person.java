public class Person {
    String name;
    int age;
    String gender;
    String nickname;

    public Person(String name, int age, String gender, String nickname) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
    }

    public void introduction() {
        System.out.println("Hello, I am " + name + ", my Nickname is " + nickname + " and I am " + age + " years old.");
    }
}
