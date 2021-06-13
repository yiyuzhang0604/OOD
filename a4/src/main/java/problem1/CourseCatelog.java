package problem1;

import java.util.Arrays;
import java.util.Objects;

/**
 * CourseCatelog class store all the courses
 */
public class CourseCatelog implements CourseList{
    private int capacity;
    private Course courseArray[];
    private int size;

    /**
     * Constructs a CourseCatelog object
     * @param capacity - the capacity of the list
     */
    public CourseCatelog(int capacity){
        this.capacity = capacity;
        this.courseArray = new Course[capacity];
        this.size = 0;
    }

    /**
     * Method that get the capacity of the catelog
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method that return the course array
     * @return course array
     */
    public Course[] getCourseArray(){
        return courseArray;
    }

    /**
     * Method that get the size of the catelog
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Method that add the course to the catelog
     * @param c - course
     */

    public void append(Course c) {
        if(size == 0){
            courseArray[0] = c;
        }else{
            courseArray[size] = c;
        }
        size++;

    }

    /**
     * Method that remove the course from catelog
     * @param c - course
     */

    public void remove(Course c) {
        int start = 0;
        while(start < capacity){
            if(courseArray[start].equals(c)){
                courseArray[start] = null;
                size--;
                break;
            }else{
                start++;
            }
        }
    }

    /**
     * Method that determine if catelog has course c
     * @param c - the course
     * @return true or false
     */

    public boolean contains(Course c) {
        for(int i = 0; i < size; i++){
            if(courseArray[i].equals(c)){
                return true;
            }
        }
        return false;
    }

    /**
     * Method that return the index of course c in the list
     * @param c - the course
     * @return the index, or -1 if not found this course
     */

    public int indexOf(Course c) {
        int start = 0;
        if(contains(c)){
            while(start < size){
                if(courseArray[start].equals(c)){
                    return start;
                }else{
                    start++;
                }
            }
        }
        return -1;
    }

    /**
     * Method that return the count of courses
     * @return the count
     */

    public int count() {
        return this.size;
    }

    /**
     * Method that get the course by index
     * @param index - the index in list
     * @return the course
     */

    public Course get(int index) {
        return courseArray[index];
    }

    /**
     * Method that determine if the list is empty
     * @return boolean
     */

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CourseCatelog that = (CourseCatelog) o;
        return Objects.equals(getCapacity(),that.getCapacity()) &&
                Objects.equals(getCourseArray(),that.getCourseArray()) &&
                Objects.equals(getSize(),that.getSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCapacity());
    }

    @Override
    public String toString() {
        return "CourseCatelog{" +
                "capacity=" + capacity +
                ", courseArray=" + Arrays.toString(courseArray) +
                ", size=" + size +
                '}';
    }
}