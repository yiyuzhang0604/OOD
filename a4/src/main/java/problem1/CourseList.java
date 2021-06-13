package problem1;

public interface CourseList {
    void append(Course c);
    void remove(Course c);
    boolean contains(Course c);
    int indexOf(Course c);
    int count();
    Course get(int index);
    boolean isEmpty();

}
