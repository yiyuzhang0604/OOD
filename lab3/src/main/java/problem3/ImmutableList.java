package problem3;

public interface ImmutableList {
  boolean isEmpty();
  Integer size();
  boolean contains(String item);
  boolean containsAll(ImmutableList items);
  ImmutableList fillterLargerThan(Integer strLen);
  boolean hasDuplicate();
  ImmutableList removeDuplicate();
}
