package problem3;
import java.util.*;

import java.util.HashSet;
import java.util.List;

public class ListOfString implements ImmutableList{
  private Node head;
  private Integer num;

  public ListOfString(){
    this.head = null;
    this.num = 0;

  }
  @Override
  public boolean isEmpty() {
    return (this.head.equals(null) && this.num == 0);
  }

  @Override
  public Integer size() {
    return this.num;
  }

  @Override
  public boolean contains(String item) {
    if(this.head == null) return false;
    else{
      Node curr = this.head;
      while(curr.getNextNode() != null){
        if(curr.getItem().equals(item)) return true;
        else curr = curr.getNextNode();
    }
    }
    return false;
  }

  @Override
  public boolean containsAll(ImmutableList items) {
    if (this.head !=null) {
      int flagCounter = 0;
      Node curr = this.head;
      while (curr.getNextNode() != null) {
        ListOfString currItems = (ListOfString) items;
        while (currItems.head.getNextNode() != null) {
          if (currItems.head.getItem().equals(curr.getItem())) {
            flagCounter++;
          } else {
            currItems.head = currItems.head.getNextNode();
          }
        }

      }
    }
    return false;
  }

  @Override
  public ImmutableList fillterLargerThan(Integer strLen) {
    Node curr = this.head;
    while(curr.getNextNode()!= null){
      if(curr.getItem().length() > strLen){
        curr = new Node(curr.getNextNode().getItem(),curr.getNextNode());
      }
      }
    return (ImmutableList)curr;
  }

  @Override
  public boolean hasDuplicate(){
    Set<Node> set = new HashSet<>();
    Node curr = this.head;
    while(curr.getNextNode() != null){
      if(!set.add(curr)) return false;
    }
    return true;
  }

  @Override
  public ImmutableList removeDuplicate() {
    Set<Node> set = new HashSet<>();
    Node curr = this.head;
    while(curr.getNextNode() != null){
      if(!set.add(curr.getNextNode())){
        Node prev = curr;
        Node next = curr.getNextNode();
        //prev.getNextNode() = new Node(next.getItem());
      }
    }
    return(ImmutableList)curr;
  }
}
