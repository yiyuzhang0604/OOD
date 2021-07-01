package midTerm.p2;

import java.util.Objects;

public class Node {
    private Employee employee;
    private Node nextEmployee;

    public Node(Employee employee, Node nextEmployee) {
        this.employee = employee;
        this.nextEmployee = nextEmployee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Node getNextEmployee() {
        return nextEmployee;
    }

    public void setNextEmployee(Node next){
        this.nextEmployee = next;
    }

    public void setEmployee(Employee person){
        this.employee = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(employee, node.employee) && Objects.equals(nextEmployee, node.nextEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, nextEmployee);
    }

    @Override
    public String toString() {
        return "Node{" +
                "employee=" + employee +
                ", nextEmployee=" + nextEmployee +
                '}';
    }
}
