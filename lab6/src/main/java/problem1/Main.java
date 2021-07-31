package problem1;
import static problem1.FrequencyCount.frequencyCount;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 4, 4, 4));
        System.out.print(frequencyCount(list1));

    }
}
