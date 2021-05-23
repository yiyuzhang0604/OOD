package problem1Package;

/**
 * This class represents a vehicle.A vehicle has a VIN number, a license plate and a car owner.
 */

public class Vehicle {
    public Integer VIN;
    public String licensePlate;
    public Owner carOwner;

    /**
     * Construct a vehicle object that has VIN ,license plate and car owner
     * @param VIN - The VIN number
     * @param licensePlate - The license plate
     * @param carOwner - the Owner, who has first name, last name and phone number
     */

    public Vehicle(Integer VIN, String licensePlate, Owner carOwner) {
        this.VIN = VIN;
        this.licensePlate = licensePlate;
        this.carOwner = carOwner;

    }
    public String getOwnerFirstName() {
        return carOwner.firstName;
    }

    public String getOwnerLastName() {
        return carOwner.lastName;
    }

    public String getOwnerPhoneNumber() {
        return carOwner.phoneNumber;
    }

    public void setVIN(Integer VIN) {
        this.VIN = VIN;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Integer getVIN() {
        return VIN;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
