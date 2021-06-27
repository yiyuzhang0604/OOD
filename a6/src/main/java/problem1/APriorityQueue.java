package problem1;

/**
 * Represents common behaviors between EmptyPQ and ConsPQ
 */
public abstract class APriorityQueue implements PriorityQueue{
    @Override
    public PriorityQueue add(Integer priority, String value){
        return new ConsPQ(priority,value, this);
    }

}
