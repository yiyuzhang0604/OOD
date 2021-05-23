package problem1Package;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Integer expectedVIN;
    private String expectedLicensePlate;
    private Vehicle testVehicle;
    private Owner carOwner;
    private String expectedFirstName;
    private String expectedLastName;
    private String expectedPhoneNumber;

    @Before
    public void setUp() throws Exception {
        expectedFirstName = "Yiyu";
        expectedLastName = "Zhang";
        expectedPhoneNumber = "4028784632";
        carOwner = new Owner(expectedFirstName, expectedLastName, expectedPhoneNumber);

        expectedVIN = 7834512;
        expectedLicensePlate = "MA828";
        testVehicle = new Vehicle(expectedVIN, expectedLicensePlate, carOwner);
    }

    @Test
    public void setVIN() {
        Integer VIN3 = 84729;
        String license = "md829";
        Owner person = new Owner("Briana","Zhang","2345678");
        Vehicle test2 = new Vehicle(VIN3,license, person);
        test2.setVIN(VIN3);
        assertEquals(VIN3, test2.getVIN());
    }
    @Test
    public void setLicensePlate() {
        String license = "MA 898";
        testVehicle.setLicensePlate(license);
        assertEquals(license, testVehicle.licensePlate);

    }

    @Test
    public void getVIN() {
        assertEquals(expectedVIN, testVehicle.getVIN());
    }

    @Test
    public void getLicensePlate() {
        assertEquals(expectedLicensePlate, testVehicle.getLicensePlate());
    }

    @Test
    public void getOwnerFirstName() {
        assertEquals(expectedFirstName, testVehicle.getOwnerFirstName());
    }

    @Test
    public void getOwnerLastName() {
        assertEquals(expectedLastName, testVehicle.getOwnerLastName());
    }
    @Test
    public void getOwnerPhoneNumber() {
        assertEquals(expectedPhoneNumber, testVehicle.getOwnerPhoneNumber());

    }
}