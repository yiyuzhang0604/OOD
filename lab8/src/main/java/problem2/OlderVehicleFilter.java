package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OlderVehicleFilter {

    private static Integer FILTER_YEAR = 1999;
    private List<Vehicle> vehicles = new ArrayList<>();

    public OlderVehicleFilter(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public OlderVehicleFilter(Vehicle vehicle1, Vehicle vehicle2, Vehicle vehicle3) {
        this.vehicles.add(vehicle1);
        this.vehicles.add(vehicle2);
        this.vehicles.add(vehicle3);
    }

    /**
     * Filter out vehicles that are manufactured after 1999
     *
     * @return a list of vehicles that are made after 1999
     */
    public void filterOlderVehicles() {
        //Approach 1 - simply filter and print out remaining vehicles
        this.vehicles.stream().filter(vehicle -> vehicle.getYear() > FILTER_YEAR).forEach(vehicle -> Vehicle.printMakeModelAndYear(vehicle));

        //Approach 2 - store filtered vehicles into a list, and then print elements of a list
        List<Vehicle> resultingVehicles = this.vehicles.stream().filter(vehicle -> vehicle.getYear() > FILTER_YEAR)
                .collect(Collectors.toList());
        resultingVehicles.stream().forEach(vehicle -> Vehicle.printMakeModelAndYear(vehicle));
    }

    public List<Vehicle> filterOlderVehicles2(){
        List<Vehicle> resultingVehicles = this.vehicles.stream().filter(vehicle -> vehicle.isYoungerThanGivenYear(FILTER_YEAR))
                .collect(Collectors.toList());
        resultingVehicles.stream().forEach(vehicle -> Vehicle.printMakeModelAndYear(vehicle));

        return resultingVehicles;
    }

}
