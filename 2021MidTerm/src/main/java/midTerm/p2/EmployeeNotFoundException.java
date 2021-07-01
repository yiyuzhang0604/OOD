package midTerm.p2;

import midTerm.p1.EmployeeAbstract;

/**
 * Throws an exception when the employee is not found
 */
public class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
