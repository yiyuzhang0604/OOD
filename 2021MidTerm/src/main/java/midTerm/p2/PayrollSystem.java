package midTerm.p2;
import java.util.ArrayList;
/**
 * An ADT called PayrollSystem
 */
public interface PayrollSystem {
    public static final int ANNUAL_MAXIMUM = 100000;
    public static final int ANNUAL_MINIMUM = 50000;

    /**
     * Check if empty
     * @return boolean
     */
    Boolean isEmpty();

    /**
     * Count the employees in system
     * @return the number of employees
     */
    Integer countEmployee();

    /**
     * Add an employee, if the employee already exist, can update role
     * @param person - employee
     * @return PayrollSystem
     */
    PayrollSystem add (Employee person);

    /**
     * Remove an employee if found
     * @param person - employee
     * @return  a new PayrollSystem without the employee that got removed
     * @throws EmployeeNotFoundException - exception
     */
    PayrollSystem remove(Employee person) throws EmployeeNotFoundException;

    /**
     * Check if the specific employee is in the system
     * @param person Employee
     * @return boolean
     */
    Boolean check(Employee person);

    /**
     * Get a list of employee who's annual earnings are over ANNUAL_MAXIMUM;
     * @return a PayrollSystem that contains these employees
     */
    PayrollSystem getAnnualEarningLarge();

    /**
     * Get a list of employee who's annual earnings are less than ANNUAL_MINIMUM;
     * @return a PayrollSystem that contains these employees
     */
    PayrollSystem getAnnualEarningLess();

    /**
     * Get a list of employee who join in the same year
     * @param year- year
     * @return a PayrollSystem that contains these employees
     */
    PayrollSystem getSameYear(Integer year);

    /**
     * Get the employee
     * @param EIN employee id
     * @return Employee
     * @throws InvalidEmployeeNumberException - exception
     */
    Employee getEmployee(String EIN) throws InvalidEmployeeNumberException;
}
