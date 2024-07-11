import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {


    List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        persons.add(person);
    }

    public Optional<Person> getPersonById(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.ofNullable(person);
            }
        }
        return Optional.empty();
    }
}