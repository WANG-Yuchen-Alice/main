package fithelper.model.entry;

/**
 * This main class is for testing and debugging only.
 */
public class TimeMain {

    public static void main(String[] args) {
        String timeStr = "2020-03-31-06:15";
        Time tryTime = new Time(timeStr);
        System.out.println(tryTime.time);
        System.out.println(tryTime.date);
        System.out.println(tryTime.value);
    }
}
