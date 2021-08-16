import java.util.List;

/**
 * Represents s ShowSeats class
 */
public class ShowSeats {
    private static final int MAX_ROW = 15;
    private static final int MAX_COLUMN = 10;

    public static void showSeats(List<Row> rows){
        StringBuilder sb = new StringBuilder();
        printSeats(sb, rows);
        System.out.println(sb.toString());
    }

    public static void printSeats(StringBuilder sb, List<Row> rows){
        for (int i = 0; i < MAX_ROW; i++) {
            if (i < MAX_COLUMN - 1) {
                sb.append(i + 1).append("   ");
                printSeats(sb, rows, i);
                sb.append(System.lineSeparator());
            } else if (i < MAX_ROW - 1) {
                sb.append(i + 1).append("  ");
                printSeats(sb, rows, i);
                sb.append(System.lineSeparator());
            } else {
                sb.append(i + 1).append("  ");
                printSeats(sb, rows, i);
            }
        }
    }
    private static void printSeats(StringBuilder sb, List<Row> rows, int i) {
        Row row = rows.get(i);
        for (int k = 0; k < MAX_COLUMN; k++) {
            if (row.isWheelAccess() && row.get(k).getReserveFor() == null)
                sb.append("=").append(" ");
            else if (!row.isWheelAccess() && row.get(k).getReserveFor() == null)
                sb.append("_").append(" ");
            else
                sb.append("X").append(" ");
        }
    }

    public static void confirmSeat(int reserveNum, String customerName, int rowNum, String theaterName){
        System.out.println(reserveNum + " seats has been reserved under " + theaterName + " in row " + rowNum + ", " + customerName);
    }

    public static void noSeatsAvailable(){
        System.out.println("No seats are available");
    }



}
