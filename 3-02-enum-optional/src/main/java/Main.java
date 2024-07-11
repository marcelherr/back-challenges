public class Main {
    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepository();


        Person p1 = new Person(1, "Karl", DaysOfWeek.MONDAY);
        Person p2 = new Person(2, "Fritz", DaysOfWeek.WEDNESDAY);
        Person p3 = new Person(3, "Otto", DaysOfWeek.SUNDAY);

        personRepository.add(p1);
        personRepository.add(p2);
        personRepository.add(p3);


        System.out.println(CheckDay.checkDay(DaysOfWeek.THURSDAY));
        System.out.println(CheckDay.checkDay(DaysOfWeek.SATURDAY));
        System.out.println(personRepository.getPersonById(1));
        System.out.println(p1.name() + " | " + p1.favouriteDay());

    }
}
