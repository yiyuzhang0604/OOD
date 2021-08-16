import java.util.Objects;

/**
 * Represents Seat class
 */
public class Seat {
    private String name;
    private String reserveFor;

    /**
     * Constructs a Seat object
     * @param name consiste of capital letter
     * @param reserveFor represent the name of the person for whom it has been reserved
     */
    public Seat(String name, String reserveFor) throws InvalidSeatNameException {
        this.name = validName(name);
        this.reserveFor = null;
    }

    private String validName(String name) throws InvalidSeatNameException{
        if(!name.matches("[A-Z]*") || !this.upperCase(name)){
            throw new InvalidSeatNameException("Seat name should be capital letter from A to Z");

        }else{
            return name;
        }
    }

    private boolean upperCase(String name){
        for(char c: name.toCharArray()){
            if(!Character.isUpperCase(c)){
                return false;
            }
        }
        return true;
    }

    /**
     * Get the name of the seat
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the reserve for
     * @return reserve for
     */
    public String getReserveFor() {
        return reserveFor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return Objects.equals(name, seat.name) && Objects.equals(reserveFor, seat.reserveFor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, reserveFor);
    }

    @Override
    public String toString() {
        return "Seat{" +
                "name='" + name + '\'' +
                ", reserveFor='" + reserveFor + '\'' +
                '}';
    }
}
