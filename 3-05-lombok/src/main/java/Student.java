import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String address;
    private String grade;
}
