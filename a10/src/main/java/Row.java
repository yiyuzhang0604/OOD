/**
 * Represents row class
 */
import java.util.ArrayList;
import java.util.Collection;

public class Row extends ArrayList<Seat>{
    private int rowNum;
    private boolean wheelAccess;
    int numberOfSeats;

    /**
     * Constructs a Row
     * @param numberOfSeats number of seats
     * @param wheelAccess whether it has wheelAccess
     */
    public Row(int numberOfSeats, boolean wheelAccess) {
        this.numberOfSeats = numberOfSeats;
        this.wheelAccess = wheelAccess;

    }

    /**
     * Get the row number
     * @return row number
     */
    public int getRowNum() {
        return rowNum;
    }

    /**
     * Get the boolean
     * @return boolean
     */
    public boolean isWheelAccess() {
        return wheelAccess;
    }

    /**
     * Set the row num
     * @param rowNum the row num
     */
    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    /**
     * Set the wheelAccess
     * @param wheelAccess boolean
     */
    public void setWheelAccess(boolean wheelAccess) {
        this.wheelAccess = wheelAccess;
    }
}
