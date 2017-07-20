import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

/**
 * Created by Dan Ko on 7/20/2017.
 */
public class NightData {
    private LocalTime sleep;
    private LocalTime wake;
    private LocalDate date;

    public NightData(LocalTime sleep, LocalDate date) {
        this.sleep = sleep;
        this.date = date;
    }

    public String toString() {
        String s =  LocalDateTime.of(date, sleep).toString();
        s += "\n" + LocalDateTime.of(date, wake).toString();
        return s;
    }
}
