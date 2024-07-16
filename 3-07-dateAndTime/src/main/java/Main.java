import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Step1
        LocalDateTime currentTime = LocalDateTime.now();
        String formattedDate = currentTime.format(formatter);

        System.out.println(formattedDate);

        //Step2
        LocalDateTime futureTime = currentTime.plusWeeks(2);
        String formattedFuture = futureTime.format(formatter);

        System.out.println(formattedFuture);

        //Step3
        if (currentTime.isBefore(futureTime)) {
            System.out.println("The current Time is before.");
        } else if (currentTime.isAfter(futureTime)) {
            System.out.println("The current Time is after.");
        }

        //Step 4
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = LocalDateTime.now().plusHours(2);

        long differenceDays = ChronoUnit.DAYS.between(startTime, endTime);
        long differenceHours = ChronoUnit.HOURS.between(startTime, endTime);
        long differenceMinutes = ChronoUnit.MINUTES.between(startTime, endTime);

        System.out.println("The difference is: " + differenceDays + " days.");
        System.out.println("The difference is: " + differenceHours + " hours.");
        System.out.println("The difference is: " + differenceMinutes + " minutes.");

    }
}
