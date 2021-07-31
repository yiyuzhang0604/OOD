package problem1;

import java.util.HashMap;
import java.util.Map;
import java.util.List;


/**
 * Class represents the count of frequency
 */
public class FrequencyCount {
    public static Map<Integer, Double> frequencyCount(List<Integer> input){
        Map<Integer, Double> map = new HashMap<>();
        if(input == null) return map;
        for(int n: input){
            map.put(n, map.getOrDefault(n, 0.0)+ 1);
        }
        // update frequency
        for(Map.Entry<Integer, Double> entry: map.entrySet()){
            entry.setValue(entry.getValue()/input.size());
        }
        return map;

    }

}
