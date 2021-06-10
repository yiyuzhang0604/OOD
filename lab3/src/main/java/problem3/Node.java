package problem3;

import java.util.Objects;

public class Node {
  private String item;
  private Node nextNode;

  public Node(String item, Node nextNode) {
    this.item = item;
    this.nextNode = nextNode;
  }

  public String getItem() {
    return item;
  }

  public Node getNextNode() {
    return nextNode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(item, node.item) &&
        Objects.equals(nextNode, node.nextNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, nextNode);
  }

  @Override
  public String toString() {
    return "Node{" +
        "item='" + item + '\'' +
        ", nextNode=" + nextNode +
        '}';
  }
}
