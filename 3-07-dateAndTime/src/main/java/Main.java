import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //Step1
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);

        //Step2
        LocalDateTime futureTime = currentTime.plusWeeks(2);
        System.out.println(futureTime);

        //Step3
        if (currentTime.isBefore(futureTime)) {
            System.out.println("The current Time is before.");
        } else if (currentTime.isAfter(futureTime)) {
            System.out.println("The current Time is after.");
        }

    }
}
