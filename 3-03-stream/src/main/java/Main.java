import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even Numbers: " + evenNumbers);

        //2
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("Doubled Numbers: " + doubledNumbers);


        //3
        Collections.shuffle(numbers);

        List<Integer> shuffeledNumbers = numbers;

        System.out.println(shuffeledNumbers);

        List<Integer> ascendingOrder = shuffeledNumbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted Numbers: " + ascendingOrder);

        //4
        int reducedNumber = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of all Numbers: " + reducedNumber);

        //5
        evenNumbers.forEach(System.out::println);
        doubledNumbers.forEach(System.out::println);
        shuffeledNumbers.forEach(System.out::println);
        ascendingOrder.forEach(System.out::println);

    }
}

