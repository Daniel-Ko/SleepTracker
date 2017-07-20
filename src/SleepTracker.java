import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;

/**
 * Created by Dan Ko on 7/16/2017.
 */
public class SleepTracker {
    private List<NightData> nights;
    private Map<LocalDate, NightData> sleepDataByDate;

    public SleepTracker() {
        nights = new ArrayList<>();
        sleepDataByDate = new HashMap<>();
    }

    /** Creates a NightData object and maps it to its unique date. The date mapped will be the date when you go to sleep (the night of), regardless of
     * whether you sleep later than midnight or not.
     * @param date
     */
    public void addSleepTime(LocalDate date) {
        //get user inputted and sleep time
        LocalTime sleep = LocalTime.of(4, 4, 4);

        //when click button to add (or maybe a text bar?)
        sleep = LocalTime.of(4, 4, 4);

        nights.add(new NightData(sleep, date));
    }

    /** Find the NightData object existing which maps to the relevant date, and add a wake time to it. Doing this will create a time period in the NightData object
     * and complete everything we need for it.
     */
    public void addWakeTime() {
        //add user inputted wake time to an existing date
        NightData data = sleepDataByDate.get(LocalDate.of(5, 5, 5));

    }

    public void drawGraph() {

    }

}


