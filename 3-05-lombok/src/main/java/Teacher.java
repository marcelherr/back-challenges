import lombok.Builder;

@Builder
public record Teacher(int id, String name, String subject) {
}
