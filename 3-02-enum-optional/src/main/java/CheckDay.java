public class CheckDay {

    public static String checkDay(DaysOfWeek day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return day.name();
            case SATURDAY:
            case SUNDAY:
                return "Weekend";
            default:
                return "invalid day";
        }
    }
}
