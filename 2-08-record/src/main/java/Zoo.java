
import java.util.List;

public record Zoo(
        String name,
        String openingDate,
        String adress,
        List<Animal> animals
) {
//    public int calcTotalFood(){
//        int totalFood = 0;
//        for (Animal animal : animals) {
//            totalFood += animal.species.foodPerDay()
//        }return totalFood;
//    }
}
