import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.With;

@Data
@AllArgsConstructor
@Builder
public class Student {
    private int id;
    private String name;
    private String address;
    private String grade;
}
