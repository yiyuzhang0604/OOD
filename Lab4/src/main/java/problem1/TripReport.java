package problem1;

import java.util.Objects;

/**
 * TripReport class
 */
public class TripReport {
    private Vehicle vehicle;
    private float speed;
    private float distance;
    private Integer duration;

    /**
     * Constructs a TripReport class
     * @param vehicle - the vehicle
     * @param speed - the avg speed
     * @param distance - the distance
     * @param duration - the time
     */
    public TripReport(Vehicle vehicle, float speed, float distance, Integer duration) {
        this.vehicle = vehicle;
        this.speed = speed;
        this.distance = distance;
        this.duration = duration;
    }

    /**
     * Get vehicle
     * @return vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Get speed
     * @return speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Get distance
     * @return distance
     */
    public float getDistance() {
        return distance;
    }

    /**
     * Get duration
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripReport that = (TripReport) o;
        return Float.compare(that.speed, speed) == 0 && Float.compare(that.distance, distance) == 0 && vehicle.equals(that.vehicle) && duration.equals(that.duration);
    }

    @Override
    public String toString() {
        return "TripReport{" +
                "vehicle=" + vehicle +
                ", speed=" + speed +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVehicle(),getSpeed(),getDistance(),getDuration());
    }
}
