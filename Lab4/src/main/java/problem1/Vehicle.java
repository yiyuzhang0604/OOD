package problem1;

import java.util.Objects;

/**
 * Vehicle class
 */
public class Vehicle {
    private String ID;
    private float avgSpeed;
    private float maxSpeed;

    /**
     * Constructs a vehicle object
     * @param ID - the id
     * @param avgSpeed - the average speed
     * @param maxSpeed - the maximum speed
     */
    public Vehicle(String ID, float avgSpeed, float maxSpeed) {
        this.ID = ID;
        this.avgSpeed = avgSpeed;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Get the ID
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * Get the average speed
     * @return the average speed
     */
    public float getAvgSpeed() {
        return avgSpeed;
    }

    /**
     * Get the maximum speed
     * @return the maximum speed
     */
    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Float.compare(vehicle.avgSpeed, avgSpeed) == 0 && Float.compare(vehicle.maxSpeed, maxSpeed) == 0 && ID.equals(vehicle.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getAvgSpeed(), getMaxSpeed());
    }
}
