package problem2;

public interface SetInterface {
    Set emptySet();
    boolean isEmpty();
    Set add(Integer n);
    boolean contains(Integer n);
    Set remove(Integer n);
    Integer size();
}
