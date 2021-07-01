package midTerm.p2;
import java.util.Objects;

/**
 * Class represents LinkedPayrollSystem
 */
public class LinkedPayrollSystem implements PayrollSystem {

    private Node headEmployee;
    private Integer numEmployee;

    /**
     * Constructs a LinkedPayrollSystem
     * @param headEmployee - the first employee in the system
     * @param numEmployee - the number of employeee in the system
     */
    public LinkedPayrollSystem(Node headEmployee, Integer numEmployee) {
        this.headEmployee = headEmployee;
        this.numEmployee = numEmployee;
    }

    /**
     * Constructs a LinkedPayrollSystem
     * @param headEmployee the first element
     */
    public LinkedPayrollSystem(Employee headEmployee) {
        this.headEmployee = new Node(headEmployee,null);
        this.numEmployee = 1;
    }

    /**
     * Constructs a LinkedPayrollSystem
     */
    public LinkedPayrollSystem() {
        this.headEmployee = null;
        this.numEmployee = 0;
    }


    /**
     * Get the first element
     * @return first element
     */
    public Node getHeadEmployee() {
        return headEmployee;
    }

    /**
     * Get the number of elements
     * @return the number of elements
     */
    public Integer getNumEmployee() {
        return numEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LinkedPayrollSystem that = (LinkedPayrollSystem) o;
        return Objects.equals(getHeadEmployee(), that.getHeadEmployee()) &&
                Objects.equals(getNumEmployee(), that.getNumEmployee());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeadEmployee(),getNumEmployee());
    }

    @Override
    public String toString() {
        return "LinkedPayrollSystem{" +
                "headEmployee=" + headEmployee +
                ", numEmployee=" + numEmployee +
                '}';
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean isEmpty() {
        return (this.numEmployee == 0);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Integer countEmployee() {
        return this.numEmployee;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayrollSystem add(Employee person) {
        Node newNode = new Node(person,null);
        if(this.headEmployee == null){
            this.headEmployee = newNode;
            this.numEmployee++;
            return this;
        }else{
            if(!this.check(person)){
                Node curr = this.headEmployee;
                while(curr.getNextEmployee() != null){
                    curr = curr.getNextEmployee();
                }
                curr.setNextEmployee(newNode);
                this.numEmployee++;
            }
        }
        return this;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public PayrollSystem remove(Employee person) throws EmployeeNotFoundException {
        PayrollSystem result = new LinkedPayrollSystem();
        if(!this.check(person)){
            throw new EmployeeNotFoundException("This employee is not in the system");
        }else{
            Node curr = this.headEmployee;
            while(curr.getNextEmployee() != null){
                if(!curr.getEmployee().equals(person)){
                    result.add(curr.getEmployee());
                }else{
                    curr = curr.getNextEmployee();
                }
            }
        }
        return result;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean check(Employee person) {
        Node curr = this.headEmployee;
        while(curr != null){
            if(curr.getEmployee().equals(person)){
                return true;
            }else{
                curr = curr.getNextEmployee();
            }
        }
        return false;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public PayrollSystem getAnnualEarningLarge() {
        PayrollSystem result = new LinkedPayrollSystem();
        Node curr = this.headEmployee;
        while(curr.getNextEmployee() != null){
            if(curr.getEmployee().getAnnualEarnings() > ANNUAL_MAXIMUM){
                result.add(curr.getEmployee());
            }
            curr = curr.getNextEmployee();
        }
        return result;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public PayrollSystem getAnnualEarningLess() {
        PayrollSystem result = new LinkedPayrollSystem();
        Node curr = this.headEmployee;
        while(curr!= null){
            if(curr.getEmployee().getAnnualEarnings() < ANNUAL_MINIMUM){
                result.add(curr.getEmployee());
            }
            curr = curr.getNextEmployee();
        }
        return result;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public PayrollSystem getSameYear(Integer year) {
        PayrollSystem result = new LinkedPayrollSystem();
        Node curr = this.headEmployee;
        while(curr.getNextEmployee() != null){
            if(curr.getEmployee().getYearJoinedCompany().equals(year)){
                result.add(curr.getEmployee());
            }
            curr = curr.getNextEmployee();
        }
        return result;

    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Employee getEmployee(String EIN) throws InvalidEmployeeNumberException {
        Node curr = this.headEmployee;
        while(curr.getNextEmployee() != null){
            if(curr.getEmployee().getEmployeeID().equals(EIN)){
                return curr.getEmployee();
            }else{
                curr = curr.getNextEmployee();
            }
        }
        throw new InvalidEmployeeNumberException("Invalid employee id");
    }
}
