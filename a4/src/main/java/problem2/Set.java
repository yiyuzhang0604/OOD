package problem2;

import java.util.Arrays;
import java.util.Objects;

public class Set implements SetInterface{
    private int[] set;
    private int size;
    private int capacity;

    /**
     * Constructs a set
     * @param capacity - the maximum number of elements that can be inside the set
     */
    public Set(int capacity) {
        this.capacity = capacity;
        set = new int[capacity];
        int size = 0;
    }

    /**
     * Get the set
     * @return set
     */
    public int[] getSet() {
        return this.set;
    }

    /**
     * Get the size
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Get the capacity
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Return a new empty set
     * @return set
     */
    @Override
    public Set emptySet() {
        Set set = new Set(0);
        return set;
    }

    /**
     * Return true if is empty
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Add the given integer to set if not already in set
     * @param n given number
     * @return the set if add successfully
     */
    @Override
    public Set add(Integer n) {
        Set ans = new Set(this.capacity);
        if(!contains(n)){
            ans.set = Arrays.copyOf(this.set,this.capacity);
            ans.size = this.size;
            ans.set[size] = n;
            ans.size++;
        }
        return ans;
    }

    /**
     * Method that checks if the set contains the number
     * @param n given number
     * @return boolean
     */
    @Override
    public boolean contains(Integer n) {
        int start = 0;
        while(start < capacity){
            if(set[start] == n)return true;
            else{
                start++;
            }
        }
        return false;
    }

    /**
     * Remove the given integer
     * @param n - given integer
     * @return new set
     */
    @Override
    public Set remove(Integer n) {
        int start = 0;
        Set ans = new Set(this.capacity);
        ans.set = Arrays.copyOf(this.set, capacity);
        ans.size = this.size;
        while(start < ans.size){
            if(ans.set[start] == n){
                ans.set[start] = 0;
                ans.size--;
                break;
            }else{
                start++;
            }
        }
        return ans;
    }

    /**
     * Method that return the size of the set
     * @return the size
     */
    @Override
    public Integer size() {
        return getSize();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Set that = (Set) o;
        boolean check = true;
        for(int i = 0; i < that.size; i++){
            for(int j = 0; j < ((Set) o).size; j++){
                if(that.set[i] != ((Set) o).set[j]){
                    check = false;
                }
            }
        }
        return Objects.equals(getCapacity(),that.getCapacity()) &&
                Objects.equals(getSet(),that.getSet()) &&
                Objects.equals(getSize(),that.getSize()) && check;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCapacity(),getSize());
    }

    @Override
    public String toString() {
        return "Set{" +
                "set=" + Arrays.toString(set) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}