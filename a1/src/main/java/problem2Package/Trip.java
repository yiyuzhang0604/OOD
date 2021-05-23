package problem2Package;

/**
 * Trip is a class object that has start location, end location, start time and end time
 *
 */
public class Trip {
    public String start;
    public String end;
    public Time startTime;
    public Time endTime;

    /**
     * Constructor that creates a new trip object with these parameters:
     * @param start - start location
     * @param end - end location
     * @param startTime - start time
     * @param endTime -end time
     */
    public Trip(String start, String end, Time startTime, Time endTime) {
        this.start = start;
        this.end = end;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * calculate the duration between start time and end time
     * @return a new time object which represents the duration time
     */

    public Time getDurtion() {
        int secDiff;
        int minDiff;
        int hrDiff;
        if(endTime.seconds < startTime.seconds){
            endTime.seconds = endTime.seconds + 60;
            endTime.minutes = endTime.minutes - 1;
        }
        secDiff = endTime.seconds - startTime.seconds;

        if(endTime.minutes < startTime.minutes){
            endTime.minutes = endTime.minutes + 60;
            endTime.hour = endTime.hour - 1;
        }
        minDiff = endTime.minutes - startTime.minutes;
        hrDiff = endTime.hour - startTime.hour;
        Time duration = new Time(hrDiff, minDiff, secDiff);
        return duration;
    }
    /**
     * Return the start location of the trip
     */
    public String getStart() {
        return start;
    }

    /**
     * @return the end location of the trip
     */
    public String getEnd() {
        return end;
    }

    /**
     * @return the start time of the trip
     */
    public Time getStartTime() {
        return startTime;
    }

    /**
     * @return the end time of the trip
     */
    public Time getEndTime() {
        return endTime;
    }
}
