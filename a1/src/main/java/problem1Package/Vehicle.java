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

    /**
     * @return owner's first name
     */
    public String getOwnerFirstName() {
        return carOwner.firstName;
    }


    /**
     * @return owner's last name
     */
    public String getOwnerLastName() {
        return carOwner.lastName;
    }


    /**
     * @return owner's phone number
     */
    public String getOwnerPhoneNumber() {
        return carOwner.phoneNumber;
    }

    /**
     * @param VIN
     * set the VIN number
     */
    public void setVIN(Integer VIN) {
        this.VIN = VIN;
    }

    /**
     * @param licensePlate
     * set the license plate
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * @return VIN
     */

    public Integer getVIN() {
        return VIN;
    }

    /**
     * @return license plate
     */
    public String getLicensePlate() {
        return licensePlate;
    }
}
