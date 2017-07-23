import java.awt.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Dan Ko on 7/16/2017.
 */
public class SleepTracker {
    private Map<LocalDate, NightData> sleepDataByDate;

    public SleepTracker() {
        sleepDataByDate = new HashMap<>();
    }

    /** Creates a NightData object and maps it to its unique date. The date mapped will be the date when you go to sleep (the night of), regardless of
     * whether you sleep later than midnight or not.
     * @param date
     */
    public void addSleepTime(LocalDate date) {
        //get user inputted and sleep time
        LocalTime sleep;
    
        //when click button to add (or maybe a text bar?)
        sleep = LocalTime.of(4, 4, 4); //change to user-inputted values

        sleepDataByDate.put(date, new NightData(sleep, date));
    }

    /** Find the NightData object existing which maps to the relevant date, and add a wake time to it. Doing this will create a time period in the NightData object
     * and complete everything we need for it.
     */
    public void addWakeTime() {
        //add user inputted wake time to an existing date
        NightData data = sleepDataByDate.get(LocalDate.of(5, 5, 5)); //change to user-inputted values
    }

    public void drawGraph(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //AXES: 1-4, everyday. 14-28, every 2 days. 28-56, every week. 65-1 year, every month. 1 yr +, every year.

        //BAR, SCATTER, LINE

        //need a graphics object g

        List<LocalDate> nights = sleepDataByDate.keySet()
                .stream()
                .sorted() //LocalDate implements comparable
                .collect(Collectors.toList());

        for(LocalDate date : nights) {
            sleepDataByDate.get(date); //draw this on component
        }
    }

}


