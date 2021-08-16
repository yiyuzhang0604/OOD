import jdk.dynalink.beans.StaticClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Theater class
 */
public class Theater {
    private String name;
    private List<Row> rows;
    private ArrayList<Integer> wheelAccessRow;
    private static Theater instance;

    /**
     * Construct a Theater class
     * @param name the name of the Theater
     * @param rows a list of rows
     * @param wheelAccessRow a list of number represents which row has wheel access
     */
    public Theater(String name, List<Row> rows, ArrayList<Integer> wheelAccessRow) {
        this.name = name;
        this.rows = rows;
        this.wheelAccessRow = wheelAccessRow;
    }

    /**
     * Get the name of the theater
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the rows
     * @return rows
     */
    public List<Row> getRows() {
        return rows;
    }

    /**
     * Get the list of wheelacess
     * @return list
     */
    public ArrayList<Integer> getWheelAccessRow() {
        return wheelAccessRow;
    }

    /**
     * Create a new theater if have not
     * @param name name
     * @param rows rows
     * @param wheelAccessRow wheel access
     * @return a new Theater instance
     */
    public static Theater createTheater(String name, List<Row>rows, ArrayList<Integer> wheelAccessRow){
        if(instance == null){
            return new Theater(name, rows, wheelAccessRow);
        }
        return instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theater theater = (Theater) o;
        return Objects.equals(name, theater.name) && Objects.equals(rows, theater.rows) && Objects.equals(wheelAccessRow, theater.wheelAccessRow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rows, wheelAccessRow);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", rows=" + rows +
                ", wheelAccessRow=" + wheelAccessRow +
                '}';
    }
}
