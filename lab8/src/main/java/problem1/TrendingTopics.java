package problem1;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TrendingTopics {
    private Map<String, Integer> occuranceMap;

    public TrendingTopics(Map<String,Integer> occuranceMap) {
        this.occuranceMap = occuranceMap;
    }
    public TrendingTopics() {
        this.occuranceMap = new HashMap<>();
    }
    public Map<String, Integer> countTopics(List<String> topics){
        this.occuranceMap = topics.stream().collect(Collectors.toMap(x -> x.toString(), x -> 1, (x, y) -> x + y));
        return this.occuranceMap;
    }

    public Map<String, Long> countTopic2(List<String> topics){
        return topics.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public Map<String, Long> countTopics3(List<String> topics){
        return topics.stream().collect(Collectors.groupingBy(word->word, Collectors.counting()));
    }

    public Map<String, Integer> countTopics4(List<String> topics){
        this.occuranceMap = topics.stream().collect(Collectors.toMap(x->x, x->1, Integer::sum));
        return this.occuranceMap;
    }

    public Map<String, Integer> countTopics5(List<String> topics){
        this.occuranceMap = topics.stream().collect(Collectors.toMap(Function.identity(), x -> TrendingTopics.getNumElements(topics, x)));
        return this.occuranceMap;

    }

    protected static Integer getNumElements(List<String> topics, String x){
        Integer counter = 0;
        for(String element: topics) {
            if (element.equals(x)){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrendingTopics that = (TrendingTopics) o;
        return Objects.equals(occuranceMap, that.occuranceMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(occuranceMap);
    }

    @Override
    public String toString() {
        return "TrendingTopics{" +
                "occuranceMap=" + occuranceMap +
                '}';
    }
}
