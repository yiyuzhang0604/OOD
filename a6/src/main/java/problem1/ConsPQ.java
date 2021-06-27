package problem1;

import java.util.Objects;

/**
 * Represents a non-empty PQ
 */
public class ConsPQ extends APriorityQueue{
    private Integer priority;
    private String value;
    private PriorityQueue rest;

    /**
     * Constructs a ConsPQ
     * @param priority - priority
     * @param value - String value
     * @param rest - rest of the PriorityQueue
     */
    public ConsPQ(Integer priority, String value, PriorityQueue rest) {
        this.priority = priority;
        this.value = value;
        this.rest = rest;
    }
    /**
     * Constructs a ConsPQ
     * @param priority - priority
     * @param value - String value
     */
    public ConsPQ(Integer priority, String value){
        this.priority = priority;
        this.value = value;
        this.rest = new EmptyPQ();

    }


    /**
     * {@inheritDoc}
     */
    @Override
    public PriorityQueue add(Integer priority, String value) {
        //base case
        if(priority == this.priority){
            // value is alphabetically lower than this.value
            if(value.compareTo(this.value) < 0){
                // add here
                return new ConsPQ(priority,value,this);
            }else{
                // continue to find the add position in the rest
                return new ConsPQ(this.priority,this.value,this.rest.add(priority,value));
            }
        }
        if(priority > this.priority){
            return new ConsPQ(priority,value,this);
        }
        return new ConsPQ(this.priority, this.value, this.rest.add(priority, value));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean isEmpty() {
        return false;
    }

    /**
     * {@inheritDoc}
     * Sicne the PQ is ordered by its priority then by its alphabetical order
     * peek() will only return one element that is the highest priority and highest alphabatical order
     */
    @Override
    public String peek() {
        return this.value;
    }



    /**
     * {@inheritDoc}
     * Sicne the PQ is ordered by its priority then by its alphabetical order
     * peek() will only return one element that is the highest priority and highest alphabatical order
     */
    @Override
    public PriorityQueue pop() {
        if(this.rest.isEmpty()){
            return new EmptyPQ();
        }else{
            return this.rest;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof ConsPQ)) return false;
        ConsPQ other = (ConsPQ) o;
        if(this.priority != other.priority || !(this.value.equals(other.value))){
            return false;
        }
        return this.rest.equals(other.rest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.priority, this.value, this.rest);
    }

    @Override
    public String toString() {
        return "ConsPQ [pq=" + "|" + this.priority +","+ this.value + "|" +
                this.rest.toString() + "]";
    }
}
