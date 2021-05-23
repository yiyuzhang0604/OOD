package problem2Package;

/**
 * Time is a class object that has Integer time, minutes and seconds to represent a specific time.
 */
public class Time {
    public Integer hour;
    public Integer minutes;
    public Integer seconds;

    /**
     * Constructor that create a new time object with hour, minutes and seconds
     *
     * @param hour    - hour, 0- 23
     * @param minutes - minutes, 0-59
     * @param seconds - seconds, 0-59
     */

    public Time(Integer hour, Integer minutes, Integer seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public Integer getSeconds() {
        return seconds;
    }

}
