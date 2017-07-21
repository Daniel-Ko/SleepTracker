import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Duration;

/**
 * Created by Dan Ko on 7/20/2017.
 */
public class NightData {
    private LocalTime sleep;
    private LocalTime wake;
    private LocalDate date;

    private Duration sleepDur;

    /** constructor used when sleep time is recorded at night.
     * Wake time should be recorded in the morning after sleeping or later.
     *
     * @param sleep
     * @param date
     */
    public NightData(LocalTime sleep, LocalDate date) {
        this.sleep = sleep;
        this.date = date;
    }

    /** constructor used when sleep and wake times are recorded at once (the morning after sleeping)
     *
     * @param sleep
     * @param wake
     * @param date
     */
    public NightData(LocalTime sleep, LocalTime wake, LocalDate date) {
        this.sleep = sleep;
        this.date = date;
    }

    /** add a waking time (temporal endpoint) to the NightData
     * Will always be added after a sleeping time.
     *
     * @param waking
     */
    public void setWake(LocalTime waking) {
        wake = waking;
    }

    /** Returns the duration of sleep from sleep to waking.
     * If the duration hasn't been initialised already, it will be calculated only the first time.
     * @return
     */
    public Duration getDuration() {
        if(sleepDur == null) sleepDur = Duration.between(sleep, wake); //set duration first time we call this
        return sleepDur;
    }

    /** Should return :
     * Sleep: xxxx hours
     * Wake: xxxx hours
     * @return
     */
    public String toString() {
        String s =  LocalDateTime.of(date, sleep).toString();
        s += "\n" + LocalDateTime.of(date, wake).toString();
        if(sleepDur != null) s+= ("\nSlept for " + sleepDur);
        return s;
    }
}
