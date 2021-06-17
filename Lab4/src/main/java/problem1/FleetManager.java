package problem1;

/**
 * FleetManger class
 */
public class FleetManager {
    /**
     * Constructs a TripReport object
     * @param distance - the distance
     * @param vehicle - the Vehicle
     * @return
     */
    public TripReport drive(float distance, Vehicle vehicle){
        float speed = vehicle.getAvgSpeed();
        Integer duration = (int)(distance /speed);
        return new TripReport(vehicle,speed,distance,duration);
    }

    /**
     * Constructs a TripReport object
     * @param vehicle - the Vehicle object
     * @param duration - the time spent
     * @return new TripReport
     */
    public TripReport drive(Vehicle vehicle, Integer duration) {
        float speed = vehicle.getAvgSpeed();
        float distance = duration * speed;
        return new TripReport(vehicle,speed,distance,duration);
    }

    /**
     * Constructs a TripReport object
     * @param vehicle - the vehicle
     * @param duration - the time
     * @param distance - the distance
     * @param speed - the average speed
     * @return new TripReport object
     */
    public TripReport drive(Vehicle vehicle, Integer duration, float distance, float speed){
        return new TripReport(vehicle,speed,distance,duration);
    }

    /**
     * Constructs a TripReport object
     * @param duration - the time
     * @param distance - the distance
     * @param speed - the avg speed
     * @param vehicle - the vehicle
     * @return
     */
    public TripReport drive(Integer duration, float distance, float speed,Vehicle vehicle){
        return new TripReport(vehicle,speed,distance,duration);
    }

    public static void main(String[] args){
        Vehicle testVe = new Bus("V1",10f,50f);
        Vehicle testVe2 = new Boat("V2",15f, 40f);
        Vehicle testVe3 = new Train("V3", 12.5f, 30.5f);

        int duration1 = 600;
        int duration2 = 800;
        int duration3 = 505;
        float distance1 = 1000f;
        float distance2 = 888f;
        float distance3 = 1215f;

        FleetManager manager = new FleetManager();
        TripReport report1 = manager.drive(distance1,testVe);
        TripReport report2 = manager.drive(testVe,duration1);
        TripReport report3 = manager.drive(testVe2,duration2,distance2,testVe2.getAvgSpeed());
        TripReport report4 = manager.drive(duration3,distance3,testVe3.getAvgSpeed(),testVe3);

        System.out.println(report1);
        System.out.println(report2);
        System.out.println(report3);
        System.out.println(report4);

    }

}
